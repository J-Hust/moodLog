package com.jhust.moodLog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MoodLogApplication

fun main(args: Array<String>) {
	runApplication<MoodLogApplication>(*args)
}
