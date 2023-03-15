package net.ajakka.kmmlib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform