package cn.luguangyi.dubbox.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World! ---> " + appName;
    }
}
