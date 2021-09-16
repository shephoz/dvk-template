package jp.wozniak.project

import io.ktor.application.*
import jp.wozniak.project.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureHTTP()
    configureSecurity()
}
