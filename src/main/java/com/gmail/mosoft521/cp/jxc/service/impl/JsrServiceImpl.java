package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.GysInfoMapper;
import com.gmail.mosoft521.cp.jxc.dao.JsrMapper;
import com.gmail.mosoft521.cp.jxc.entity.Jsr;
import com.gmail.mosoft521.cp.jxc.service.JsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("jsrService")
@Transactional
public class JsrServiceImpl implements JsrService {

    @Autowired
    private JsrMapper jsrMapper;

    @Override
    public List<Jsr> getJsrs() {
        return jsrMapper.selectByExample(null);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jsrMapper.deleteByPrimaryKey(id);
    }
}
