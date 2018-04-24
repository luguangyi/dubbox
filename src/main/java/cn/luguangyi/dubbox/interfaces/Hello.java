package cn.luguangyi.dubbox.interfaces;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public interface Hello {
    String say(String content);

    JSONObject test(String name);
}
