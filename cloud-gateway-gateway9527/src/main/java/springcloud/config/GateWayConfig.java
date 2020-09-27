package springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route"
                , r->r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .build();
        routes.route("path_roter_nv",r->r.path("/lady").uri("http://news.baidu.com/nvren")).build();
        return routes.build();
    }
}
