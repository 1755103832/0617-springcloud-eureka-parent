package com.aaa.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zyb
 * @Date 2020/6/22
 * @Description
 **/
@Configuration
public class GatewayConfig {

    /**
     * @Author zyb
     * @Description 自己百度lamda表达式
     * routes():是一个list集合--->可以有多个route()，也就是说每一个route()方法就是一个路由的规则
     * route()方法中有两个参数:id:String(定义了该路由的唯一标识符，一个routes只能出现一次)
     * 第二个参数是具体实现规则的方式(通过lamda表达式实现路由的规则)
     * 需求:
     * 客户端发送了一个请求到达服务器端-->在到达服务器端之间先被gateway路由拦截-->然后把拦截的请求转发到百度上
     * p.path("/baidu")-->也就是说当该路径为/baidu的时候，路由才会拦截，其他的路径不拦截-->拦截之后要做什么需要使用过滤器实现
     * 该过滤器的实现就是为路径添加一个请求头--->addRequestHeader-->也就是当跳转到百度页面的时候携带请求头参数过去(key:name, value:zhangsan)
     * --->http://www.baidu.com?name=zhangsan--->搜索zhangsan--->最终uri(需要跳转到的地址)
     * servlet:
     * @WebServlet(urlPattern="/baidu")--->也就是说只有匹配到baidu这个路径才能进入到servlet中-->service(重定向--->百度首页)
     * @Date 2020/6/22 9:43
     * @Param [routeLocatorBuilder]
     * @Return org.springframework.cloud.gateway.route.RouteLocator
     **/
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("baidu-route",
                        p -> p.path("/baidu")
                                .filters(f -> f.addRequestHeader("name", "zhangsan")
                                ).uri("http://www.baidu.com"))
                .route("baidu-route2",
                        p -> p.path("/baidu2")
                                //localhost:5082/baidu2-->jd.com/baidu2?name=lisi
                                //jd.com/baidu2?name=lisi-->jd.com
                                .filters(f -> f.addRequestParameter("name", "lisi")
                                ).uri("http://www.jd.com"))
                .route("baidu-route3",
                        p -> p.path("/123")
                                .filters(f -> f.rewritePath("/all", "/allBooks")
                                        //必须要用域名，本机ip都不行
                                ).uri("http://localhost/127.0.0.1/本机ip都不行:5081")).build();
    }
}
