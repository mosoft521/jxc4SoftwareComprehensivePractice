package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.SellDetailMapper;
import com.gmail.mosoft521.cp.jxc.dao.SellMapper;
import com.gmail.mosoft521.cp.jxc.entity.SellDetail;
import com.gmail.mosoft521.cp.jxc.service.SellService;
import com.gmail.mosoft521.vo.SellVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("sellService")
@Transactional
public class SellServiceImpl implements SellService {
    @Autowired
    private SellMapper sellMapper;

    @Autowired
    private SellDetailMapper sellDetailMapper;

    @Override
    public boolean insertSellInfo(SellVO sellVO) {
        int r = sellMapper.insert(sellVO);
        for (SellDetail sellDetail : sellVO.getSellDetailList()) {
            sellDetailMapper.insert(sellDetail);
        }
        return r > 0;
    }
}
