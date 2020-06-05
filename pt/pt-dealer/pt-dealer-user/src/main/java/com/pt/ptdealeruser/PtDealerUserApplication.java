package com.pt.ptdealeruser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.pt"})
public class PtDealerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PtDealerUserApplication.class, args);
    }

}
