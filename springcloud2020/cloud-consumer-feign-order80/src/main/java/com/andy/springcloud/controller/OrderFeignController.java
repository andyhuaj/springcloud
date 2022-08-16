package com.andy.springcloud.controller;

import com.andy.springcloud.entities.CommonResult;
import com.andy.springcloud.entities.Payment;
import com.andy.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>> lai le ......");
        return paymentFeignService.getPaymentById(id);
    }
}

