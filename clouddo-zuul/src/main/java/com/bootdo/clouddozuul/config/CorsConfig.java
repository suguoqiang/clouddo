//package com.bootdo.clouddozuul.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
///**
// * @author george
// */
//@Configuration
//public class CorsConfig {
//    private CorsConfiguration buildConfig() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        // 允许cookies跨域
//        corsConfiguration.setAllowCredentials(true);
//        // #允许向该服务器提交请求的URI，*表示全部允许，在SpringMVC中，如果设成*，会自动转成当前请求头中的Origin
//        corsConfiguration.addAllowedOrigin("*");
//        // #允许访问的头信息,*表示全部
//        corsConfiguration.addAllowedHeader("*");
//        // 预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
//        corsConfiguration.setMaxAge(18000L);
//        // 允许提交请求的方法，*表示全部允许
//        corsConfiguration.addAllowedMethod("OPTIONS");
//        corsConfiguration.addAllowedMethod("HEAD");
//        corsConfiguration.addAllowedMethod("GET");
//        corsConfiguration.addAllowedMethod("PUT");
//        corsConfiguration.addAllowedMethod("POST");
//        corsConfiguration.addAllowedMethod("DELETE");
//        corsConfiguration.addAllowedMethod("PATCH");
//        return corsConfiguration;
//    }
//
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", buildConfig());
//        return new CorsFilter(source);
//    }
//}