package com.clear.service.impl;

import com.clear.dao.PaymentDao;
import com.clear.entities.Payment;
import com.clear.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName PaymentServiceImpl
 *
 * @author qml
 * Date 2020/11/1 0001 18:53
 * Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    /**
     * 新增
     *
     * @param payment
     * @return
     */
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}