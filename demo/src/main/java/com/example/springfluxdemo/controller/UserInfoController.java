package com.example.springfluxdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ASUS
 * Created at 23:12.2019/12/19
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class UserInfoController {

    @GetMapping
    public Map<String, Object> getUserInfo() {
        Map<String, Object> param = new HashMap<>(10);
        param.put("value", 1);
        log.info(param.toString());
        return param;

    }
}
