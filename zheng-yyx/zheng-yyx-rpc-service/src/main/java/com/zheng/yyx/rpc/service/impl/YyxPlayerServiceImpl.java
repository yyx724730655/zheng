package com.zheng.yyx.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.yyx.dao.mapper.YyxPlayerMapper;
import com.zheng.yyx.dao.model.YyxPlayer;
import com.zheng.yyx.dao.model.YyxPlayerExample;
import com.zheng.yyx.rpc.api.YyxPlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* YyxPlayerService实现
* Created by shuzheng on 2020/3/8.
*/
@Service
@Transactional
@BaseService
public class YyxPlayerServiceImpl extends BaseServiceImpl<YyxPlayerMapper, YyxPlayer, YyxPlayerExample> implements YyxPlayerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(YyxPlayerServiceImpl.class);

    @Autowired
    YyxPlayerMapper yyxPlayerMapper;

}