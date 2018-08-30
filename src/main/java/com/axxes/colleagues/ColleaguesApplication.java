package com.axxes.colleagues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.axxes.colleagues.service", "com.axxes.colleagues.dao", "com.axxes.colleagues.api"})
public class ColleaguesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColleaguesApplication.class, args);
    }
}
