package com.jujuba.jujubab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AplicattionController {

    @GetMapping("/materiaprima")
    public String abrirPagina() {       
        return "materiaprima";
    }

    
}
