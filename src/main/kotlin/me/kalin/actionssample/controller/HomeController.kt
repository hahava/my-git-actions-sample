package me.kalin.actionssample.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class HomeController {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/v1/api/home")
    fun getHome(): String {
        logger.info("hello")
        return LocalDateTime.now().toString()
    }
}