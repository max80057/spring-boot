package com.example.demoindex.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Controller_a {

//    @RequestMapping("/MyFirstPage")
//    public String greeting(@RequestParam(value="title", required=false, defaultValue="哩勒工蝦咪?") String title) {
//        return title;
//    }

    @RequestMapping("/MyFirstPage")
    public String greeting(@RequestParam(value="title", required=false, defaultValue="哩勒工蝦咪") String title, Model model) {
        model.addAttribute("name", title);
        return "index";
    }
}
