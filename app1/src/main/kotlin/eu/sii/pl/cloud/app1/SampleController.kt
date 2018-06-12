package eu.sii.pl.cloud.app1

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class SampleController(
        @Value("\${spring.application.name}") val name: String,
        @Value("\${node.idx}") val idx: String) {
    @GetMapping
    fun index(principal: Principal) = "I am a module: $name - idx: $idx, Hello ${principal.name}"
}