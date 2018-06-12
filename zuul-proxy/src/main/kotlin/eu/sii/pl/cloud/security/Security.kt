package eu.sii.pl.cloud.security

import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.Authentication
import org.springframework.security.core.authority.SimpleGrantedAuthority


@EnableWebSecurity
class Security : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
        http
                .authenticationProvider(SimpleAuthenticationProvider())
                .csrf().disable().httpBasic().and().authorizeRequests().anyRequest().authenticated()
    }
}

class SimpleAuthenticationProvider : AuthenticationProvider {
    override fun authenticate(authentication: Authentication?): Authentication = authentication!!.let {
        UsernamePasswordAuthenticationToken(it.principal, "", listOf(SimpleGrantedAuthority("USER")))
    }

    override fun supports(authentication: Class<*>?) = true
}
