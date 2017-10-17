package com.poshist.baseRole.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by server on 17-5-9.
 */
@Controller("/")
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {

        return "/main";
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }

}
