package cn.luguangyi.dubbox.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {

    @Bean
    public Car instance() {
        return new Car();
    }
}
