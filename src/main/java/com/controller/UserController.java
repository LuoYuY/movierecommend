package com.controller;


import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/allUser")
    public String list(Model model) {
        System.out.println("yes 1");
        List<User> list = userService.queryAllUser();
        model.addAttribute("list", list);
        System.out.println("yes"+list.get(0).getUsername());
        System.out.println("yes"+list.get(0).getId());
        return "jsp/addUser";
    }


}