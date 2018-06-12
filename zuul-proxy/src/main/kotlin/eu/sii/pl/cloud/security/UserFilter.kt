package eu.sii.pl.cloud.security

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.springframework.stereotype.Component


@Component
class UserFilter : ZuulFilter() {
    override fun filterType() = "pre"

    override fun filterOrder() = 1

    override fun shouldFilter() = true

    override fun run(): Any? {
        val context = RequestContext.getCurrentContext()
        context.addZuulRequestHeader("X-Auth-Token", context.request.session.id)
        context.addZuulRequestHeader("Cookie", "SESSION=${context.request.session.id}")
        return null
    }
}
