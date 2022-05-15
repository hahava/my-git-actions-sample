package me.kalin.actionssample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class HomeController {
    @GetMapping("/v1/api/home")
    fun getHome(): String = LocalDateTime.now().toString()
}