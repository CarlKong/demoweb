package com.app.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/3/14.
 */
@Controller
public class HelloCtl {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "RequestMapping Hello World!";
    }
    @GetMapping("/index")
    public ResponseEntity helloWord() {
        return ResponseEntity.ok("GetMapping hello word");
    }
}
