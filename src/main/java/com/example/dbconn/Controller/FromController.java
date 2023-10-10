package com.example.dbconn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FromController {
    
    @GetMapping("/front")
    public String Form(){
        return "Form";
    }
}
