package ru.mail.park

import java.io.IOException
import java.net.ServerSocket
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors


class Server(val port: Int,
             val threads: Int,
             val root: String) {
    val threadPool = if (threads > 0) {
        Executors.newFixedThreadPool(threads)
    } else {
        Executors.newCachedThreadPool()
    }

    fun start() {
        val socket = ServerSocket(port)
        println("Server started on port $port")
        while (true) {
            threadPool.submit(ClientRunnable(socket.accept(), root))
        }
    }
}