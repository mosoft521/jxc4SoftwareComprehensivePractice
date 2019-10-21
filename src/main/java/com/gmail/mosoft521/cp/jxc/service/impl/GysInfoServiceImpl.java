package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.GysInfoMapper;
import com.gmail.mosoft521.cp.jxc.entity.GysInfo;
import com.gmail.mosoft521.cp.jxc.entity.GysInfoExample;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;
import com.gmail.mosoft521.cp.jxc.service.GysInfoService;
import org.apache.commons.lang3.StringUtils;
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
    public GysInfo getGysInfo(Item item) {
        if (StringUtils.isNotBlank(item.getId())) {
            return gysInfoMapper.selectByPrimaryKey(item.getId());
        } else {
            GysInfoExample example = new GysInfoExample();
            GysInfoExample.Criteria criteria = example.createCriteria();
            criteria.andNameEqualTo(item.getName());
            List<GysInfo> gysInfoList = gysInfoMapper.selectByExample(example);
            if (gysInfoList.isEmpty()) {
                return null;
            } else {
                return gysInfoList.get(0);
            }
        }
    }
}
