package com.example.blog

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Schema(description = "Generic description")
data class KeyValue(
    val key: String,
    val value: String,
)

@Schema
data class SomeDTO(
    @Schema(description = "Description A", allOf = [KeyValue::class]) val field_a: KeyValue,
    @Schema(description = "Description B", allOf = [KeyValue::class]) val field_b: KeyValue,
)

@RestController
@RequestMapping("/test")
class TestController {

    @PostMapping("/test")
    fun create(@RequestBody some: SomeDTO) {

    }
}