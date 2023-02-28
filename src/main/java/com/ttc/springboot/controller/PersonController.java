package com.ttc.springboot.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @Sagrtc
 * @date 2021/12/10 - 10:50
 */
@Controller
public class PersonController {

    @RequestMapping("/user/index")
    public String index(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password, Model model, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }
    }

    @ResponseBody
    @RequestMapping("/admin/hello")
    public String admin() {
        return "admin";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
