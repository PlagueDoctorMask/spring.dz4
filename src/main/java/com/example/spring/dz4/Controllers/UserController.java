package com.example.spring.dz4.Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController{

    @GetMapping("/hello")
    public String HelloWorld(){

        return "HelloWorld";
    }

    @GetMapping("/hello/{name}")
    public String HelloNewUser(Model model, @PathVariable String name){
        model.addAttribute(name);
        return "Hello";
    }

    @PostMapping("/hello/{name}")
    public String HelloUser(Model model,String name){
        model.addAttribute("name",name);
        return "Hello";
    }
}
