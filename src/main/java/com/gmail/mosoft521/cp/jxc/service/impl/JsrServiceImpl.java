package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.ext.JsrMapperExt;
import com.gmail.mosoft521.cp.jxc.entity.Jsr;
import com.gmail.mosoft521.cp.jxc.entity.JsrExample;
import com.gmail.mosoft521.cp.jxc.service.JsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("jsrService")
@Transactional
public class JsrServiceImpl implements JsrService {

    @Autowired
    private JsrMapperExt jsrMapperExt;

    @Override
    public List<Jsr> getJsrs() {
        return jsrMapperExt.selectByExample(null);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jsrMapperExt.deleteByPrimaryKey(id);
    }

    @Override
    public int reduceEnableById(Integer id) {
        return jsrMapperExt.reduceEnableByPk(id);
    }

    @Override
    public Jsr getJsr(String nameStr, String ageStr) {
        JsrExample jsrExample = new JsrExample();
        JsrExample.Criteria criteria = jsrExample.createCriteria();
        criteria.andNameEqualTo(nameStr);
        criteria.andAgeEqualTo(ageStr);
        List<Jsr> jsrs = jsrMapperExt.selectByExample(jsrExample);
        if (jsrs.isEmpty()) {
            return null;
        } else {
            return jsrs.get(0);
        }
    }

    @Override
    public int addJsr(Jsr jsr) {
        jsr.setEnable(1);
        return jsrMapperExt.insertSelective(jsr);
    }
}
