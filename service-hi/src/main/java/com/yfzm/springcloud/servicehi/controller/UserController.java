//package com.yfzm.springcloud.servicehi.controller;
//
//
//import com.yfzm.springcloud.servicehi.domain.User;
//import com.yfzm.springcloud.servicehi.service.UserServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private UserServiceImpl userService;
//
//    @RequestMapping(value = "/registry", method = RequestMethod.POST)
//    public User createUser(@RequestParam("username") String username
//            , @RequestParam("password") String password) {
//        return userService.create(username, password);
//    }
//
//}
