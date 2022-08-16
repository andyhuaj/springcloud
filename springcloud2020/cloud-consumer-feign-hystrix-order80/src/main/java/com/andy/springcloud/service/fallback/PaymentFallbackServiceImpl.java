package com.andy.springcloud.service.fallback;

import com.andy.springcloud.service.PaymentFeignHystrixService;
import org.springframework.stereotype.Component;

@Component //必须加 //必须加 //必须加
public class PaymentFallbackServiceImpl implements PaymentFeignHystrixService {

    @Override
    public String paymentInfoOk(Integer id) {
        return "====PaymentFeignHystrixService fall back paymentInfoOk，o(╥﹏╥)o====";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "====PaymentFeignHystrixService fall back paymentInfoTimeOut，o(╥﹏╥)o====";
    }
}
