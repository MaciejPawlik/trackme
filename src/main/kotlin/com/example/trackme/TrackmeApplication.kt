package com.example.trackme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrackmeApplication

fun main(args: Array<String>) {
	runApplication<TrackmeApplication>(*args)
}
