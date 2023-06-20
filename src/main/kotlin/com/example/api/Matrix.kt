package com.example.api

import io.ktor.server.routing.*

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*


    data class Mat(val rows: String, val columns: Int)

    fun main() {
        embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
    }

    fun Application.module() {


    }
