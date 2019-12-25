package ru.nik

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBKServerApplication

fun main(args: Array<String>) {
    runApplication<KotlinBKServerApplication>(*args)
}
