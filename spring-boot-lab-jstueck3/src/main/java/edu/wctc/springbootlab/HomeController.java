package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   @RequestMapping("/forward-me")
    public String doForward(){return "forward:/redirect-me";}

    @RequestMapping("/redirect-me")
    public String doRedirect() {
        return "/";
//
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}

