package com.rt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // Default home page
    @RequestMapping("/")
    public String home() {
        return "index";   // index.jsp open होईल
    }

    // Another test page
    @RequestMapping("/home")
    public String homePage() {
        return "home";    // home.jsp open होईल
    }
}
