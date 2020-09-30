package com.pluralsight.conferencedemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value="/app")
public class PrincipalController {

    @RequestMapping(value = "/main")
    public String home(Map<String, Object> model) {
        model.put("obj", "Goncalo");
        return "test";
    }

}
