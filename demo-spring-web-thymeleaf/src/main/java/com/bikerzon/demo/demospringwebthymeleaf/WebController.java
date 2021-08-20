package com.bikerzon.demo.demospringwebthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/go")
    public String getResult(Model model) {
        return "result";
    }
}
