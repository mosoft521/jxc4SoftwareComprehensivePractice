package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.SellDetailMapper;
import com.gmail.mosoft521.cp.jxc.dao.ext.SellMapperExt;
import com.gmail.mosoft521.cp.jxc.entity.SellDetail;
import com.gmail.mosoft521.cp.jxc.service.SellService;
import com.gmail.mosoft521.vo.SellVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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
        return sellMapperExt.getSellMainMaxId(date);
    }
}
