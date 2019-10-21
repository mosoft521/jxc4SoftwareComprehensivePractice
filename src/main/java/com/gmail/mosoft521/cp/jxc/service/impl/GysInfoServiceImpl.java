package com.gmail.mosoft521.cp.jxc.service.impl;

import com.gmail.mosoft521.cp.jxc.entity.GysInfo;
import com.gmail.mosoft521.cp.jxc.service.GysInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("gysInfoService")
@Transactional
public class GysInfoServiceImpl implements GysInfoService {
    @Override
    public List<GysInfo> getGysInfos() {
        return null;
    }
}
