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
package com.cmcc.test.dao;

import com.cmcc.test.pojo.OrderDO;

import java.util.List;

/**
 * @date 2017-12-26 16:20
 */
public interface OrderDao {

    List<OrderDO> findAll();

}
