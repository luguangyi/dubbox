package cn.luguangyi.dubbox.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "test.user")
//@PropertySource(value={"other.properties"}) // 配置则默认为：application.properties
public class Person {
    private String name;
    private String email;
    private Integer age;
}
