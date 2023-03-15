package com.example.test_kmm_lib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform