package ru.mail.park

import java.lang.management.ManagementFactory
import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    var port = 80
    var threads = 10
    var root = "./"
    for (i in args.indices) {
        if ("-p" == args[i]) {
            port = args[i + 1].toInt()
            continue
        }
        if ("-r" == args[i]) {
            root = args[i + 1]
        }
        if ("-c" == args[i]) {
            threads = args[i + 1].toInt()
        }
    }
    Server(port, threads, root).start()
}