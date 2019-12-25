package ru.nik

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBKClientApplication

fun main(args: Array<String>) {
    runApplication<KotlinBKClientApplication>(*args)
}
