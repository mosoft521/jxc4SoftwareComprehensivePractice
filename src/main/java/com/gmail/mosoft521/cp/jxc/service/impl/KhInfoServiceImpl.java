package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.KhInfoMapper;
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
    private KhInfoMapper khInfoMapper;

    @Override
    public List<KhInfo> getKhInfos() {
        return khInfoMapper.selectByExample(null);
    }

    @Override
    public KhInfo getKhInfo(Item item) {
        if (StringUtils.isNotBlank(item.getId())) {
            return khInfoMapper.selectByPrimaryKey(item.getId());
        } else {
            KhInfoExample example = new KhInfoExample();
            KhInfoExample.Criteria criteria = example.createCriteria();
            criteria.andKhnameEqualTo(item.getName());
            List<KhInfo> khInfoList = khInfoMapper.selectByExample(example);
            if (khInfoList.isEmpty()) {
                return null;
            } else {
                return khInfoList.get(0);
            }
        }
    }
}
