package com.leone.pay.entity;

import lombok.Data;

import java.util.Date;

/**
 * <p>
 *
 * @author leone
 * @since 2018-10-27
 **/
@Data
public class Order {

    private Long orderId;

    private Long userId;

    private String consignee;

    private Integer postFee;

    private Integer totalFee;

    private Byte status;

    private String remark;

    private String outTradeNo;

    private String transactionId;

    private String createIp;

    private Date createTime;

    private Date finishTime;

    private Date payTime;

}