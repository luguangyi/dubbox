package cn.luguangyi.dubbox.services;

import cn.luguangyi.dubbox.interfaces.Hello;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Service(interfaceClass = Hello.class)
@Component
public class HelloService implements Hello {
    @Override
    public String say(String content) {
        System.out.println("say : " + content);
        return "hello, " + content;
    }

    @Override
    public JSONObject test(String name) {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("age", "25");
        json.put("gender", "man");
        return json;
    }
}
