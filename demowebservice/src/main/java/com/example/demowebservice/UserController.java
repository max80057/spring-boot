package com.example.demowebservice;

import com.example.demowebservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        model.put("ID", userService.getMessage());
        return "index";
    }
}
