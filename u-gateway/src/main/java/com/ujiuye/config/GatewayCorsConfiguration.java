package com.ujiuye.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;

@Configuration
public class GatewayCorsConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //配置跨域
        //允许所以请求头跨域
        corsConfiguration.addAllowedHeader("*");
        //允许所有请求方法跨域
        corsConfiguration.addAllowedMethod("*");
        //允许所有请求来源跨域
        corsConfiguration.addAllowedOriginPattern("*");
        //允许携带cookie跨域，否则跨域请求会丢失cookie信息
        corsConfiguration.setAllowCredentials(true);
        /**
         * 参数1：什么请求
         * 参数2：跨域配置
         */
        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }
}
