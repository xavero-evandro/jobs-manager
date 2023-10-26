package com.xavero.jobs_manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JobsManagerApplication

fun main(args: Array<String>) {
    runApplication<JobsManagerApplication>(*args)
}
