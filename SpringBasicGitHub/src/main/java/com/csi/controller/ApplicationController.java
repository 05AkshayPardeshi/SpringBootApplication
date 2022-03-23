package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {

    @GetMapping
    public String sayHi() {
        return "WELCOME TO CREDIT SYSTME INDIA PUNE ...!";
    }

    @GetMapping("/address")
    public String address() {
        return "INDIA | MAHARASHTRA | PUNE | PCMC | INSEPRIA MALL | FOURTH FLOAR ..!";
    }

}
