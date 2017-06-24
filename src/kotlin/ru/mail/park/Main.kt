package ru.mail.park

import java.lang.management.ManagementFactory
import java.text.SimpleDateFormat
import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var port = 80
    var root = "./"
    for (i in args.indices) {
        if ("-p" == args[i]) {
            port = args[i + 1].toInt()
            continue
        }
        if ("-r" == args[i]) {
            root = args[i + 1]
            continue
        }
        if ("-c" == args[i]) {
            setAffinity(args[i + 1].toInt())
        }
    }
    Server(port, root).start()
}

fun setAffinity(cores: Int) {
   
}

fun isWindows(systemName: String): Boolean = systemName.contains("win", true)

fun isLinux(systemName: String): Boolean = systemName.contains("nux", true)