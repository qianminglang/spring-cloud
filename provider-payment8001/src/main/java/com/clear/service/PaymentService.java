package com.clear.service;

import com.clear.entities.Payment;

/**
 * ClassName PaymentService
 *
 * @author qml
 * Date 2020/11/1 0001 18:52
 * Version 1.0
 **/

public interface PaymentService {
    /**
     * 新增
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}