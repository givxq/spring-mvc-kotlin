package com.example.springmvc.basic

import com.example.springmvc.logger
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LogTestController {
    val log = logger()

    @RequestMapping("/log-test")
    fun logTest(): String {
        val name = "String"
        println("name = $name")

        log.trace("trace log=$name")
        log.debug("debug log=$name")
        log.info("info log=$name")
        log.warn("warn log=$name")
        log.error("error log=$name")

        return "ok"
    }
}