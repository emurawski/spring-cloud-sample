package eu.sii.pl.cloud.app1.security

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy


@EnableWebSecurity
class Security : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http.csrf().disable().httpBasic().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER).and()
                .authorizeRequests().anyRequest().authenticated()
    }
}

//@Component
//class RestUsernamePasswordAuthenticationFilter : AbstractPreAuthenticatedProcessingFilter() {
//    override fun getPreAuthenticatedCredentials(request: HttpServletRequest): Any {
//        val log4j = LogManager.getLogger(this.javaClass)
//        log4j.error("Session ${RequestContextHolder.currentRequestAttributes().sessionId}")
//        log4j.error("headers ${request.headerNames.toList().map { it to request.getHeader(it) }}")
//        log4j.error("cookies ${request.cookies?.map { it.name to it.value }}")
//
//        return "user"
//    }
//
//    override fun getPreAuthenticatedPrincipal(request: HttpServletRequest?): Any? = null
//}
