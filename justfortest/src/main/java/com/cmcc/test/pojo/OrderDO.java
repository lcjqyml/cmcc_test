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
package com.cmcc.test.pojo;

import java.util.Date;

/**
 * @date 2017-12-26 16:20
 */
public class OrderDO {

    private Long orderId;
    private String productName;
    private Integer statusCode;
    private Date createTime;
    private Date updateTime;


    /**
     * 订单编号，主键
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单产品名
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 订单状态码：1，已下单；2，已支付；3，已完成；4，已退货；5，已删除
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 订单更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
