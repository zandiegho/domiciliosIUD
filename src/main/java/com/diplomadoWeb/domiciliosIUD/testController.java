package com.diplomadoWeb.domiciliosIUD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping
    public Object test(){
        return "funciona";
    }
}
