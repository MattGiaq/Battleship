package com.example.finalproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MathController {
    @PostMapping(path = "/add")
    public @ResponseBody String add(@RequestParam float num1, @RequestParam float num2){
        float result = num1 + num2;

        return String.valueOf(result);
    }

}
