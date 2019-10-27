package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.RukuDetailMapper;
import com.gmail.mosoft521.cp.jxc.dao.ext.RukuMapperExt;
import com.gmail.mosoft521.cp.jxc.entity.Ruku;
import com.gmail.mosoft521.cp.jxc.entity.RukuDetail;
import com.gmail.mosoft521.cp.jxc.entity.RukuExample;
import com.gmail.mosoft521.cp.jxc.service.RukuService;
import com.gmail.mosoft521.cp.jxc.vo.RukuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("rukuService")
@Transactional
public class RukuServiceImpl implements RukuService {

    @Autowired
    private RukuMapperExt rukuMapperExt;

    @Autowired
    private RukuDetailMapper rukuDetailMapper;

    @Override
    public boolean insertRukuInfo(RukuVO rukuVO) {
        int r = rukuMapperExt.insert(rukuVO);
        for (RukuDetail rukuDetail : rukuVO.getDetailArrayList()) {
            rukuDetailMapper.insert(rukuDetail);
        }
        return r > 0;
    }

    @Override
    public String selectMaxId() {
        return rukuMapperExt.selectMaxId();
    }

    @Override
    public String getRuKuMainMaxId(Date date) {
        String dateStr = date.toString().replace("-", "");
        String id = "RK" + dateStr;
        RukuExample example = new RukuExample();
        RukuExample.Criteria criteria = example.createCriteria();
        criteria.andRkidEqualTo(id + "%");
        example.setOrderByClause("rkID desc");
        List<Ruku> sellList = rukuMapperExt.selectByExample(example);
        if(sellList.isEmpty()) {
            id += "1001";
            return id;
        } else {
            //todo:
            return sellList.get(0).getRkid();
        }
    }
}
