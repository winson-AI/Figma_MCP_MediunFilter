package com.example.mediunfilter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform