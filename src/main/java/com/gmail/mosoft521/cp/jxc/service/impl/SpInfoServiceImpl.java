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
    public List<SpInfo> getSpInfos() {
        return spInfoMapper.selectByExample(null);
    }

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

    @Override
    public List searchInfo(String conName, String conOperation, String content, List list) {
        SpInfoExample example = new SpInfoExample();
        SpInfoExample.Criteria criteria = example.createCriteria();
        if (conOperation.equals("等于")) {
            if (conName.equals("商品名称"))
                criteria.andSpnameEqualTo(content);
            if (conName.equals("供应商"))
                criteria.andGysnameEqualTo(content);
            if (conName.equals("产地"))
                criteria.andCdEqualTo(content);
            if (conName.equals("规格"))
                criteria.andGgEqualTo(content);
        } else {
            if (conName.equals("商品名称"))
                criteria.andSpnameLike("%" + content + "%");
            if (conName.equals("供应商"))
                criteria.andGysnameLike("%" + content + "%");
            if (conName.equals("产地"))
                criteria.andCdLike("%" + content + "%");
            if (conName.equals("规格"))
                criteria.andGgLike("%" + content + "%");
        }
        return spInfoMapper.selectByExample(example);
    }
}
