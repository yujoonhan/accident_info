package com.greenart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrafficController {
    @GetMapping("/traffic")
    public String getMain() {
        return "/traffic/traffic";
    }
}
