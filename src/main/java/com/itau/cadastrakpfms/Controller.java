package com.itau.cadastrakpfms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/controllers")
public class Controller {
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/{numA}")
    public int somaDois(@PathVariable int numA){
        return numA + 2;
    }
}
