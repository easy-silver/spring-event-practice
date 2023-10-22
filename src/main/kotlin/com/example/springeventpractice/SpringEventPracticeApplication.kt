package com.example.springeventpractice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@SpringBootApplication
class SpringEventPracticeApplication

fun main(args: Array<String>) {
    runApplication<SpringEventPracticeApplication>(*args)
}
