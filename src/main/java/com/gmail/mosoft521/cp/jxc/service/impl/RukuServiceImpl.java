package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.RukuDetailMapper;
import com.gmail.mosoft521.cp.jxc.dao.RukuMapper;
import com.gmail.mosoft521.cp.jxc.service.RukuService;
import com.gmail.mosoft521.vo.RukuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("rukuService")
@Transactional
public class RukuServiceImpl implements RukuService {

    @Autowired
    private RukuMapper rukuMapper;

    @Autowired
    private RukuDetailMapper rukuDetailMapper;

    @Override
    public RukuVO insertRukuInfo(RukuVO rukuVO) {
        return null;
    }
}
