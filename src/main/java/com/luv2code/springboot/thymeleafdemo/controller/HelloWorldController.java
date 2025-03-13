package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "helloworld";
    }

//    @RequestMapping("/process-form-version-two")
//    public String letsShoutDude(HttpServletRequest request, Model model) {
//
//       // read the request parameter from the HTML form
//        String name = request.getParameter("studentName");
//
//       // convert the data to all caps
//        name = name.toUpperCase();
//
//       // create the message
//        String result = "Yo! " + name;
//
//       // add message to the model
//        model.addAttribute("message", result);
//        return "helloworld";
//   }

    @RequestMapping("/process-form-version-three")
    public String processFormVThree(@RequestParam("studentName") String name, Model model) {

        // convert the data to all caps
        name = name.toUpperCase();

        // create the message
        String result = "Hey there " + name;

        // add message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }
}
