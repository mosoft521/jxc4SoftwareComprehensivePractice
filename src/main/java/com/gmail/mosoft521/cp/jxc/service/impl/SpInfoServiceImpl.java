package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.ext.SpInfoMapperExt;
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
    private SpInfoMapperExt spInfoMapperExt;

    @Override
    public List<SpInfo> getSpInfos() {
        return spInfoMapperExt.selectByExample(null);
    }

    @Override
    public SpInfo getSpInfo(Item item) {
        if (StringUtils.isNotBlank(item.getId())) {
            return spInfoMapperExt.selectByPrimaryKey(item.getId());
        } else {
            SpInfoExample example = new SpInfoExample();
            SpInfoExample.Criteria criteria = example.createCriteria();
            criteria.andSpnameEqualTo(item.getName());
            List<SpInfo> spInfoList = spInfoMapperExt.selectByExample(example);
            if (spInfoList.isEmpty()) {
                return null;
            } else {
                return spInfoList.get(0);
            }
        }
    }

    @Override
    public List<SpInfo> searchInfo(String conName, String conOperation, String content, List list) {
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
        return spInfoMapperExt.selectByExample(example);
    }

    @Override
    public boolean existBySpname(String spname) {
        SpInfoExample example = new SpInfoExample();
        SpInfoExample.Criteria criteria = example.createCriteria();
        criteria.andSpnameEqualTo(spname);
        List<SpInfo> spInfoList = spInfoMapperExt.selectByExample(example);
        return !spInfoList.isEmpty();
    }

    @Override
    public String selectMaxId() {
        String id = "";
        String maxId = spInfoMapperExt.selectMaxId();
        if (StringUtils.isEmpty(maxId)) {
            id += "1001";
        } else {
            id += (Integer.parseInt(maxId) + 1);
        }
        return id;
    }

    @Override
    public int addSp(SpInfo spInfo) {
        return spInfoMapperExt.insert(spInfo);
    }

    @Override
    public int deleteByPk(String id) {
        return spInfoMapperExt.deleteByPrimaryKey(id);
    }

    @Override
    public int updateSp(SpInfo spInfo) {
        return spInfoMapperExt.updateByPrimaryKeySelective(spInfo);
    }

    @Override
    public List<SpInfo> selectExistKucun() {
        return spInfoMapperExt.selectExistKucun();
    }

    @Override
    public List<SpInfo> selectByGysName(String gysName) {
        SpInfoExample example = new SpInfoExample();
        SpInfoExample.Criteria criteria = example.createCriteria();
        criteria.andGysnameEqualTo(gysName);
        List<SpInfo> spInfoList = spInfoMapperExt.selectByExample(example);
        return spInfoList;
    }
}
