package eu.sii.pl.cloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class EurekaApplication

fun main(args: Array<String>) {
    SpringApplication.run(EurekaApplication::class.java, *args)
}
