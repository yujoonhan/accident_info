package com.greenart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegionalAccController {
    @GetMapping("/regional")
    public String getMain() {
        return "/regional/regional";
    }
}
