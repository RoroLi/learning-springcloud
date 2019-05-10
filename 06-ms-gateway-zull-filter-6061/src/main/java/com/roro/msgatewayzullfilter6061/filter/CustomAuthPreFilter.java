package com.roro.msgatewayzullfilter6061.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Component
public class CustomAuthPreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        /**
         * zuul过滤器的类型
         * PRE：这种过滤器在请求被路由之前调用。我们可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等
         *ROUTING：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用Apache
         *  POST：这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等
         * ERROR：在其他阶段发生错误时执行该过器。除了默认的过滤器类型微服务
         */
        return "pre";
    }

    @Override
    public int filterOrder() {
        /**
         * 表示此过滤器的执行顺序或优先级
         * 项目中肯定会有N多过滤器
         * */
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        /**
         * 过滤器开关
         * */
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        log.info("请求的方法:{},请求的路径:{}",request.getMethod(),request.getRequestURL().toString());
        String accessToken = request.getHeader("accessToken");
        if(StringUtils.isEmpty(accessToken)) {
            //不进行路由
            requestContext.setSendZuulResponse(false);
            //设置返回码
            requestContext.setResponseStatusCode(401);
            //设置返回体
            requestContext.setResponseBody("权限不够");
            requestContext.set("isSuccess",false);
        }
        return null;
    }
}
