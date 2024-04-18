package com.von.userbackend.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {
    @Bean
    public String datePattern() {
        return "yyyy-MM-dd'T'HH:mm:ss.XXX";
    }

//    @Bean
//    public DateFormatter defaultDateFormatter(){
//        return new DateFormatter(datePattern()); //return 다음 new나오면 Factory패턴
//    };

}
