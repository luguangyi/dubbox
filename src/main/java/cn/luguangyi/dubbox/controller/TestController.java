package cn.luguangyi.dubbox.controller;


import cn.luguangyi.dubbox.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private Environment env;

    public void getValueFromEnv() {
        String name = env.getProperty("test.user.name");
        System.out.println(name);
    }

    @Autowired
    private Person person;

    @RequestMapping("/home")
    @ResponseBody
    Person home() {
        System.out.println(appName);
        getValueFromEnv();
        return person;
    }
}
