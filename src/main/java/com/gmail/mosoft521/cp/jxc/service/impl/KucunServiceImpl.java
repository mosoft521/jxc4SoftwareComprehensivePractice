package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.KucunMapper;
import com.gmail.mosoft521.cp.jxc.entity.Kucun;
import com.gmail.mosoft521.cp.jxc.entity.KucunExample;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;
import com.gmail.mosoft521.cp.jxc.service.KucunService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("kucunService")
@Transactional
public class KucunServiceImpl implements KucunService {
    @Autowired
    private KucunMapper kucunMapper;

    @Override
    public List<Kucun> getKucunInfos() {
        return kucunMapper.selectByExample(null);
    }

    @Override
    public int updateKucunDj(Kucun kucun) {
        return kucunMapper.updateByPrimaryKeySelective(kucun);
    }

    @Override
    public Kucun getKucun(Item item) {
        if (StringUtils.isNotBlank(item.getId())) {
            return kucunMapper.selectByPrimaryKey(item.getId());
        } else {
            KucunExample example = new KucunExample();
            KucunExample.Criteria criteria = example.createCriteria();
            criteria.andSpnameEqualTo(item.getName());
            List<Kucun> kucunList = kucunMapper.selectByExample(example);
            if (kucunList.isEmpty()) {
                return null;
            } else {
                return kucunList.get(0);
            }
        }
    }
}
