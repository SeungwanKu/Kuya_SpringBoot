package com.springboot.kuya.app.web;

import com.springboot.kuya.app.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name,
                                             @RequestParam("contents") String contents,
                                             @RequestParam("amount") int amount,
                                             @RequestParam("iq") int iq
                                             ) {

        return new HelloResponseDto(name,contents,amount,iq);
    }
}
