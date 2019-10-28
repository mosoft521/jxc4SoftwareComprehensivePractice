package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.dao.KucunMapper;
import com.gmail.mosoft521.cp.jxc.dao.RukuDetailMapper;
import com.gmail.mosoft521.cp.jxc.dao.ext.RukuMapperExt;
import com.gmail.mosoft521.cp.jxc.dao.ext.SpInfoMapperExt;
import com.gmail.mosoft521.cp.jxc.entity.Kucun;
import com.gmail.mosoft521.cp.jxc.entity.Ruku;
import com.gmail.mosoft521.cp.jxc.entity.RukuDetail;
import com.gmail.mosoft521.cp.jxc.entity.RukuExample;
import com.gmail.mosoft521.cp.jxc.entity.SpInfo;
import com.gmail.mosoft521.cp.jxc.service.RukuService;
import com.gmail.mosoft521.cp.jxc.vo.RukuVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("rukuService")
@Transactional
public class RukuServiceImpl implements RukuService {

    @Autowired
    private RukuMapperExt rukuMapperExt;

    @Autowired
    private RukuDetailMapper rukuDetailMapper;

    @Autowired
    private KucunMapper kucunMapper;

    @Autowired
    private SpInfoMapperExt spInfoMapperExt;

    @Override
    public boolean insertRukuInfo(RukuVO rukuVO) {
        int r = rukuMapperExt.insert(rukuVO);
        for (RukuDetail rukuDetail : rukuVO.getDetailArrayList()) {
            rukuDetailMapper.insert(rukuDetail);
            //TODO:操作库存表
            Kucun kucun = kucunMapper.selectByPrimaryKey(rukuDetail.getSpid());
            if (null == kucun || StringUtils.isEmpty(kucun.getSpname())) {
                //插入
                SpInfo spInfo = spInfoMapperExt.selectByPrimaryKey(rukuDetail.getSpid());
                kucun = new Kucun();
                BeanUtils.copyProperties(spInfo, kucun);
                kucun.setDj(Float.valueOf(rukuDetail.getDj()));
                kucun.setKcsl(rukuDetail.getSl());
                kucunMapper.insert(kucun);
            } else {
                //更新
                float sl = kucun.getKcsl() + rukuDetail.getSl();
                kucun.setKcsl(sl);
                kucunMapper.updateByPrimaryKeySelective(kucun);
            }
        }
        return r > 0;
    }

    @Override
    public String selectMaxId() {
        return rukuMapperExt.selectMaxId();
    }

    @Override
    public String getRuKuMainMaxId(Date date) {
        String dateStr = date.toString().replace("-", "");
        String id = "RK" + dateStr;
        RukuExample example = new RukuExample();
        RukuExample.Criteria criteria = example.createCriteria();
        criteria.andRkidLike(id + "%");
        example.setOrderByClause("rkID desc");
        List<Ruku> rukuList = rukuMapperExt.selectByExample(example);
        if (rukuList.isEmpty()) {
            id += "1001";
            return id;
        } else {
            String maxId = rukuList.get(0).getRkid();
            String str = maxId.substring(id.length());
            id += (Integer.parseInt(str) + 1);
            return id;
        }
    }
}
