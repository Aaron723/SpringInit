package com.example.springinit.hello;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "hello相关接口")
@RequestMapping("/hello")
public class HelloWorld {
    @GetMapping("hello-world")
    @ApiOperation("打印hello world")
    public String hello() {
        return "hello world";
    }
}
