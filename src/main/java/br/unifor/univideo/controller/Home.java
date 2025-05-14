package br.unifor.univideo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Home {

    @GetMapping
    public String getHome() {
        return "Seja bem-vindo(a) ao site";
    }
    
}
