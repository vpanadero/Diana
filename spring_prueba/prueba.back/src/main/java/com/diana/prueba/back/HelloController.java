package com.diana.prueba.back;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import lombok.Data;

@RestController
public class HelloController {
	

    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }


    // SQL sample
    @RequestMapping("calc")
    String calc(@RequestParam int left, @RequestParam int right) {
    	return "esto funciona";
    }
}
