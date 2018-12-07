package eu.sii.pl.cloud.app1

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.session.data.redis.RedisFlushMode
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@EnableRedisHttpSession(redisFlushMode = RedisFlushMode.IMMEDIATE)
@EnableEurekaClient
@SpringBootApplication
class App1Application

fun main(args: Array<String>) {
    SpringApplication.run(App1Application::class.java, *args)
}
