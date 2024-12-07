package com.example.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestApp

fun main(args: Array<String>) {
	runApplication<TestApp>(*args)
}
