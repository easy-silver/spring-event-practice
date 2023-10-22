package com.example.springeventpractice.reciever

import com.example.springeventpractice.event.RegisteredEvent
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class SmsEventHandler {

    @Async
    @EventListener
    fun sendSms(event: RegisteredEvent) {
        println("${event.name}님에게 가입 축하 메시지를 전송했습니다.")
    }

    @Async
    @EventListener
    fun makeCoupon(event: RegisteredEvent) {
        Thread.sleep(500)
        throw RuntimeException("쿠폰 발행 에러 발생")
        println("${event.name}님에게 쿠폰을 전송했습니다.")
    }
}