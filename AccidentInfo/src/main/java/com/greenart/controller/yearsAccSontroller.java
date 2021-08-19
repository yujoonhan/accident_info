package com.greenart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class yearsAccSontroller {
    @GetMapping("/years")
    public String getMain() {
        return "/years/years";
    }
}
