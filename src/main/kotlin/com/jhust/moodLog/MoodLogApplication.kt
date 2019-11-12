package com.jhust.moodLog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class MoodLogApplication

fun main(args: Array<String>) {
	runApplication<MoodLogApplication>(*args)
}
