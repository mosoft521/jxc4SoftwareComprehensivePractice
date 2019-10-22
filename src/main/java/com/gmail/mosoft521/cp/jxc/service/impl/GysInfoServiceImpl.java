package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.ext.GysInfoMapperExt;
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
    private GysInfoMapperExt gysInfoMapperExt;

    @Override
    public List<GysInfo> getGysInfos() {
        return gysInfoMapperExt.selectByExample(null);
    }

    @Override
    public GysInfo getGysInfo(Item item) {
        if (StringUtils.isNotBlank(item.getId())) {
            return gysInfoMapperExt.selectByPrimaryKey(item.getId());
        } else {
            GysInfoExample example = new GysInfoExample();
            GysInfoExample.Criteria criteria = example.createCriteria();
            criteria.andNameEqualTo(item.getName());
            List<GysInfo> gysInfoList = gysInfoMapperExt.selectByExample(example);
            if (gysInfoList.isEmpty()) {
                return null;
            } else {
                return gysInfoList.get(0);
            }
        }
    }

    @Override
    public boolean existQuanChengF(String quanCheng) {
        GysInfoExample example = new GysInfoExample();
        GysInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(quanCheng);
        List<GysInfo> gysInfoList = gysInfoMapperExt.selectByExample(example);
        return !gysInfoList.isEmpty();
    }

    @Override
    public int addGys(GysInfo gysInfo) {
        return gysInfoMapperExt.insert(gysInfo);
    }

    @Override
    public String selectMaxId() {
        String sid = "gys";
        String maxId = gysInfoMapperExt.selectMaxId();
        if(StringUtils.isEmpty(maxId)){
            sid += "1001";
        } else {
            String str = maxId.substring(3);
            sid += (Integer.parseInt(str) + 1);
        }
        return sid;
    }

    @Override
    public int updateGys(GysInfo gysInfo) {
        return gysInfoMapperExt.updateByPrimaryKeySelective(gysInfo);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return gysInfoMapperExt.deleteByPrimaryKey(id);
    }
}
