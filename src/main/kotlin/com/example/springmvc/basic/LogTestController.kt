package com.example.springmvc.basic

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

val logger = KotlinLogging.logger {}

@RestController
class LogTestController {

    @RequestMapping("/log-test")
    fun logTest(): String {
        val name = "String"
        println("name = $name")

        logger.trace { "trace log=$name" }
        logger.debug { "debug log=$name" }
        logger.info { "info log=$name" }
        logger.warn { "warn log=$name" }
        logger.error { "error log=$name" }

        return "ok"
    }
}