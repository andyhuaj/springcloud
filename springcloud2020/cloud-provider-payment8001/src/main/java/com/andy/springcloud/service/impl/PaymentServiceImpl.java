package com.andy.springcloud.service.impl;

import com.andy.springcloud.dao.PaymentDao;
import com.andy.springcloud.entities.CommonResult;
import com.andy.springcloud.entities.Payment;
import com.andy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

//    @Override
//    public int create(Payment payment) {
//        return paymentDao.create(payment);
//
//    }
//
//    @Override
//    public Payment getPaymentById(Long id) {
//        return paymentDao.getPaymentById(id);
//    }

    @Value("${server.port}")
    private String serverPort;

    @Override
    public CommonResult create(Payment payment) {
        int result = paymentDao.create(payment);
        log.info("*****插入操作返回结果:{}",result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功 serverPort:"+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败 serverPort:"+serverPort, null);
        }
    }

    @Override
    public CommonResult getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        log.info("*****查询结果:{}", payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功 serverPort:"+serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id + " serverPort:"+serverPort, null);
        }
    }

}
