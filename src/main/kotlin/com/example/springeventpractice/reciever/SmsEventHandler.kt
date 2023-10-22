package com.example.springeventpractice.reciever

import com.example.springeventpractice.event.RegisteredEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class SmsEventHandler {

    @EventListener
    fun sendSms(event: RegisteredEvent) {
        Thread.sleep(2000)
        println("${event.name}님에게 가입 축하 메시지를 전송했습니다.")
    }

    @EventListener
    fun makeCoupon(event: RegisteredEvent) {
        Thread.sleep(1000)
        println("${event.name}님에게 쿠폰을 전송했습니다.")
    }
}