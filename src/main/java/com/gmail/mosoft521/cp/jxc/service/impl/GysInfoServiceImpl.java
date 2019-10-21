package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.GysInfoMapper;
import com.gmail.mosoft521.cp.jxc.entity.GysInfo;
import com.gmail.mosoft521.cp.jxc.entity.GysInfoExample;
import com.gmail.mosoft521.cp.jxc.service.GysInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("gysInfoService")
@Transactional
public class GysInfoServiceImpl implements GysInfoService {

    @Autowired
    private GysInfoMapper gysInfoMapper;

    @Override
    public List<GysInfo> getGysInfos() {
        return gysInfoMapper.selectByExample(null);
    }

    @Override
    public GysInfo getGysInfoById(String id) {
        return gysInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public GysInfo getGysInfoByName(String name) {
        GysInfoExample example = new GysInfoExample();
        GysInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<GysInfo> gysInfoList = gysInfoMapper.selectByExample(example);
        if (gysInfoList.isEmpty()) {
            return null;
        } else {
            return gysInfoList.get(0);
        }
    }
}
