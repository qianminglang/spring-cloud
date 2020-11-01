package com.clear.dao;

import com.clear.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName PaymentDao
 *
 * @author qml
 * Date 2020/11/1 0001 18:51
 * Version 1.0
 **/
@Mapper
public interface PaymentDao {
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
    Payment getPaymentById(@Param("id") Long id);
}