package com.cube.web.modules.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("generator")
public class GeneratorController {

    @RequestMapping("index")
    public String index(){
        return "pages/test";
    }
}
