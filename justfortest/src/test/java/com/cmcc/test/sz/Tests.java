/*
 * Project: cmcc_test
 * 
 * File Created at 2017-12-26
 * 
 * Copyright 2017 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.cmcc.test.sz;

import com.cmcc.test.MockHelper;
import com.cmcc.test.dao.OrderDao;
import com.cmcc.test.pojo.OrderDO;
import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 根据以下描述在此class中添加对应的可执行代码
 * -- 背景假设如下：
 * 1，数据库中order表有10万条订单数据
 * 2，DO对象为OrderDO，每个字段含义DO中有注释
 * -- 编码需求如下，所有订单中：
 * 1，productName为空（包括空格、tab等空字符串）置为删除状态
 * 2，下单状态保持超过两个小时置为删除状态
 * 3, 以多线程方式实现
 * @date 2017-12-26 16:14
 */
public class Tests {

    private static final Logger logger = LoggerFactory.getLogger(Tests.class);
    private final OrderDao orderDao = EasyMock.createMock(OrderDao.class);

    public Tests() {
        MockHelper.mockOrderDao(orderDao);
    }

    @Test
    public void demo() {
        logger.debug("This is just a demo!");
        List<OrderDO> orderDOS = orderDao.findAll();
        Assert.assertEquals(1, orderDOS.size());
    }

}
