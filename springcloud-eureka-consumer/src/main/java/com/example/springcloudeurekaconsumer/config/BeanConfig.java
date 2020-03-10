package com.example.springcloudeurekaconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Mr.Kong
 * @Description
 * @Date 2020/3/10 10:50
 */
@Configuration
public class BeanConfig {

    /**
     * @Bean 将服务注册到Spring容器中
     * @LoadBalanced 实现负载均衡调用服务
     **/
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
