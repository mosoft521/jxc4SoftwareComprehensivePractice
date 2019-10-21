package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.SpInfoMapper;
import com.gmail.mosoft521.cp.jxc.entity.SpInfo;
import com.gmail.mosoft521.cp.jxc.entity.SpInfoExample;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;
import com.gmail.mosoft521.cp.jxc.service.SpInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("spInfoService")
@Transactional
public class SpInfoServiceImpl implements SpInfoService {

    @Autowired
    private SpInfoMapper spInfoMapper;

    @Override
    public SpInfo getSpInfo(Item item) {
        if (StringUtils.isNotBlank(item.getId())) {
            return spInfoMapper.selectByPrimaryKey(item.getId());
        } else {
            SpInfoExample example = new SpInfoExample();
            SpInfoExample.Criteria criteria = example.createCriteria();
            criteria.andSpnameEqualTo(item.getName());
            List<SpInfo> spInfoList = spInfoMapper.selectByExample(example);
            if (spInfoList.isEmpty()) {
                return null;
            } else {
                return spInfoList.get(0);
            }
        }
    }
}
