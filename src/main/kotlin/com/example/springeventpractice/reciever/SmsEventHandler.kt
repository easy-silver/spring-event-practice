package com.example.springeventpractice.reciever

import com.example.springeventpractice.event.RegisteredEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.core.annotation.Order
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class SmsEventHandler {

    @Order(1)
    @Async
    @EventListener
    fun sendSms(event: RegisteredEvent) {
        logger.info("sendSms")
        println("${event.name}님에게 가입 축하 메시지를 전송했습니다.")
    }

    @Async
    @EventListener
    fun makeCoupon(event: RegisteredEvent) {
        logger.info("makeCoupon")
        println("${event.name}님에게 쿠폰을 전송했습니다.")
    }

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(this::class.java)
    }
}