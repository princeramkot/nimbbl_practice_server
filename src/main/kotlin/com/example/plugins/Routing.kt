package com.example.plugins

import com.example.exception.CustomException
import com.example.model.Matrix
import com.example.service.Practice
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        fun Route.listOrdersRoute() {
            get("/demo") {
                call.respond("works boi")
            }
        }

        post("/calculate") {

            val matrix = call.receive<Matrix>()
            val practice = Practice(matrix.rows,matrix.columns)

            matrix?.let {
                if(it.rows!=it.columns)
                    throw CustomException("rows should be equal to columns")
                if(it.rows!=null)
                    practice.calculate()
            }
            call.respond(practice.calculate())
        }

    }
}
