package cn.luguangyi.dubbox;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @EnableDubboConfiguration 开启 dubbo 服务
 * telnet localhost 20880
 * ls
 * invoke cn.luguangyi.dubbox.interfaces.Hello.test('muqing')
 *
 * 参考：https://github.com/alibaba/dubbo-spring-boot-starter/blob/master/README_zh.md
 */
@SpringBootApplication(
        scanBasePackages = {"cn.luguangyi.dubbox.*"}
)
@EnableDubboConfiguration
@EnableScheduling
@EnableAsync
public class DubboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboxApplication.class, args);
    }
}
