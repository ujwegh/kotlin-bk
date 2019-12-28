package ru.nik

import com.basrikahveci.p2p.PeerService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBKServerApplication

fun main(args: Array<String>) {
    runApplication<KotlinBKServerApplication>(*args)
    val service = PeerService(50670);
    service.createNewPeerLeader();
}

