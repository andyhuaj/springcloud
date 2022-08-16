package com.andy.springcloud.service;

import com.andy.springcloud.entities.CommonResult;
import com.andy.springcloud.entities.Payment;

public interface PaymentService {

    CommonResult create(Payment payment);

    CommonResult getPaymentById(Long id);
}
