package com.currency.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by l on 18-7-1.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

}
