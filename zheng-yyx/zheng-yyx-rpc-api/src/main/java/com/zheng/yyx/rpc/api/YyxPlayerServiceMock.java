package com.zheng.yyx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.yyx.dao.mapper.YyxPlayerMapper;
import com.zheng.yyx.dao.model.YyxPlayer;
import com.zheng.yyx.dao.model.YyxPlayerExample;

/**
* 降级实现YyxPlayerService接口
* Created by shuzheng on 2020/3/8.
*/
public class YyxPlayerServiceMock extends BaseServiceMock<YyxPlayerMapper, YyxPlayer, YyxPlayerExample> implements YyxPlayerService {

}
