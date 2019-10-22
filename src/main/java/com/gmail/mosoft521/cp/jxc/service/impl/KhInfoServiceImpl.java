package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.ext.KhInfoMapperExt;
import com.gmail.mosoft521.cp.jxc.entity.KhInfo;
import com.gmail.mosoft521.cp.jxc.entity.KhInfoExample;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;
import com.gmail.mosoft521.cp.jxc.service.KhInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("khInfoService")
@Transactional
public class KhInfoServiceImpl implements KhInfoService {
    @Autowired
    private KhInfoMapperExt khInfoMapperExt;

    @Override
    public List<KhInfo> getKhInfos() {
        return khInfoMapperExt.selectByExample(null);
    }

    @Override
    public KhInfo getKhInfo(Item item) {
        if (StringUtils.isNotBlank(item.getId())) {
            return khInfoMapperExt.selectByPrimaryKey(item.getId());
        } else {
            KhInfoExample example = new KhInfoExample();
            KhInfoExample.Criteria criteria = example.createCriteria();
            criteria.andKhnameEqualTo(item.getName());
            List<KhInfo> khInfoList = khInfoMapperExt.selectByExample(example);
            if (khInfoList.isEmpty()) {
                return null;
            } else {
                return khInfoList.get(0);
            }
        }
    }

    @Override
    public boolean existByKhname(String name) {
        KhInfoExample example = new KhInfoExample();
        KhInfoExample.Criteria criteria = example.createCriteria();
        criteria.andKhnameEqualTo(name);
        List<KhInfo> khInfoList = khInfoMapperExt.selectByExample(example);
        return !khInfoList.isEmpty();
    }

    @Override
    public String selectMaxId() {
        String id = "kh";
        String maxId = khInfoMapperExt.selectMaxId();
        if (StringUtils.isEmpty(maxId)) {
            id += "1001";
        } else {
            String str = maxId.substring(2);
            id += (Integer.parseInt(str) + 1);
        }
        return id;
    }

    @Override
    public int addKeHu(KhInfo khInfo) {
        return khInfoMapperExt.insert(khInfo);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return khInfoMapperExt.deleteByPrimaryKey(id);
    }

    @Override
    public int updateKeHu(KhInfo khInfo) {
        return khInfoMapperExt.updateByPrimaryKeySelective(khInfo);
    }
}
