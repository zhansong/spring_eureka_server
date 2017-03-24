package com.ks3.cdn;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZHANSONG on 2017/3/14.
 */
@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class EurekaServer2Turbine {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer2Turbine.class).properties(
                "spring.config.name:eureka", "logging.level.com.netflix.discovery:OFF")
                .run(args);
    }

}