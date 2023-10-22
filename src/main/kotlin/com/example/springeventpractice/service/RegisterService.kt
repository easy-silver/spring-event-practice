package com.example.springeventpractice.service

import com.example.springeventpractice.event.RegisteredEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class RegisterService(
    private val publisher: ApplicationEventPublisher,
) {

    fun registerUser(name: String) {
        println("회원 추가 완료")
        publisher.publishEvent(RegisteredEvent(name))
    }
}