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
package com.cmcc.test;

import com.cmcc.test.dao.OrderDao;
import com.cmcc.test.pojo.OrderDO;
import com.google.common.collect.Lists;
import org.easymock.EasyMock;

import java.util.Date;
import java.util.List;

/**
 * @date 2017-12-26 16:57
 */
public class MockHelper {

    private static final MockHelper instance = new MockHelper();

    public static void mockOrderDao(OrderDao orderDao) {
        instance.mockFindAll(orderDao);
    }

    private void mockFindAll(OrderDao orderDao) {
        List<OrderDO> orderDOs = Lists.newArrayList();
        OrderDO orderDO1 = new OrderDO();
        orderDO1.setOrderId(1L);
        orderDO1.setProductName("iPhone8X");
        orderDO1.setStatusCode(1);
        orderDO1.setCreateTime(new Date());
        orderDO1.setUpdateTime(new Date());
        orderDOs.add(orderDO1);
        EasyMock.expect(orderDao.findAll()).andReturn(orderDOs);
        EasyMock.replay(orderDao);
    }
}
