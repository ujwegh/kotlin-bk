package ru.nik

import io.libp2p.core.Host
//import io.libp2p.core.dsl.HostBuilder
import io.libp2p.core.multiformats.Multiaddr
import io.libp2p.protocol.Ping
import io.libp2p.protocol.PingController

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBKServerApplication

fun main(args: Array<String>) {
    runApplication<KotlinBKServerApplication>(*args)

//    createNode();
}
//
//fun createNode() {
//    // Create a libp2p node and configure it
//    // to accept TCP connections on a random port
//    val node: Host = HostBuilder()
//        .protocol(Ping())
//        .listen("/ip4/127.0.0.1/tcp/0")
//        .build()
//
//    // start listening
//    // start listening
//    node.start().get()
//
//    print("Node started and listening on ")
//    System.out.println(node.listenAddresses())
//
//    val address: Multiaddr = args.get(0)
//    val pinger: PingController = Ping().dial(
//        node,
//        address
//    ).getController().get()
//
//    println("Sending 5 ping messages to $address")
//    for (i in 1..5) {
//        val latency = pinger.ping().get()
//        println("Ping " + i + ", latency " + latency + "ms")
//    }
//
//    node.stop().get()
//}

