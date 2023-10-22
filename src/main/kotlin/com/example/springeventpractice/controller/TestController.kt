package com.example.springeventpractice.controller

import com.example.springeventpractice.service.RegisterService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val registerService: RegisterService,
) {

    @GetMapping("/register/{name}")
    fun test(@PathVariable name: String) {
        registerService.registerUser(name)
        println("회원 가입을 완료했어요.")
    }
}