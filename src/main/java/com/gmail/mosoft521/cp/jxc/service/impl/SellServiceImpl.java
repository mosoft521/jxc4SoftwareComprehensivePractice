package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.SellDetailMapper;
import com.gmail.mosoft521.cp.jxc.dao.ext.SellMapperExt;
import com.gmail.mosoft521.cp.jxc.entity.Sell;
import com.gmail.mosoft521.cp.jxc.entity.SellDetail;
import com.gmail.mosoft521.cp.jxc.entity.SellExample;
import com.gmail.mosoft521.cp.jxc.service.SellService;
import com.gmail.mosoft521.cp.jxc.vo.SellVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("sellService")
@Transactional
public class SellServiceImpl implements SellService {
    @Autowired
    private SellMapperExt sellMapperExt;

    @Autowired
    private SellDetailMapper sellDetailMapper;

    @Override
    public boolean insertSellInfo(SellVO sellVO) {
        int r = sellMapperExt.insert(sellVO);
        for (SellDetail sellDetail : sellVO.getSellDetailList()) {
            sellDetailMapper.insert(sellDetail);
        }
        return r > 0;
    }

    @Override
    public String selectMaxId() {
        return sellMapperExt.selectMaxId();
    }

    @Override
    public String getSellMainMaxId(Date date) {
        String dateStr = date.toString().replace("-", "");
        String id = "XS" + dateStr;
        SellExample example = new SellExample();
        SellExample.Criteria criteria = example.createCriteria();
        criteria.andSellidLike(id + "%");
        example.setOrderByClause("sellID desc");
        List<Sell> sellList = sellMapperExt.selectByExample(example);
        if(sellList.isEmpty()) {
            id += "1001";
            return id;
        } else {
            String maxId = sellList.get(0).getSellid();
            String str = maxId.substring(id.length());
            id += (Integer.parseInt(str) + 1);
            return id;
        }
    }
}
