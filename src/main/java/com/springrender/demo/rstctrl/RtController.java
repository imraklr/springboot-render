package com.springrender.demo.rstctrl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class RtController {
    @GetMapping("/")
    public String getStringFromSimpleEndpoint() {
        return "Hey, hi from Docker online me why hello bye bye";
    }
}
