package eu.sii.pl.cloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.session.data.redis.RedisFlushMode
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@EnableEurekaClient
@EnableRedisHttpSession(redisFlushMode = RedisFlushMode.IMMEDIATE)
@EnableZuulProxy
@SpringBootApplication
class ZuulProxyApplication

fun main(args: Array<String>) {
    SpringApplication.run(ZuulProxyApplication::class.java, *args)
}
