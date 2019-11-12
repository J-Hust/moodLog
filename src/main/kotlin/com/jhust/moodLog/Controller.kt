package com.jhust.moodLog

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HtmlController {

    @GetMapping("/")
    fun getMainForm(): String {
        println("on root page")
        return "welcome to the website"
    }

    @GetMapping("/wtf")
    fun okayThen(): String {
        println("on wtf page")
        return "why no work?"
    }
}