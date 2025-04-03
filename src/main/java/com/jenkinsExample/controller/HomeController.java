package com.jenkinsExample.controller;

import com.jenkinsExample.model.ServerInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Home");
        model.addAttribute("serverInfo", new ServerInfo());
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About");
        return "about";
    }
}
