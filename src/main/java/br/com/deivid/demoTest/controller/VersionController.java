package br.com.deivid.demoTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "versao")
public class VersionController {

    @GetMapping(produces = "application/json")
    public String getVersion(){
        return "1.0.0";
    }

    @GetMapping(value = "/too", produces = "application/json")
    public String getVersionToo() {
        return "2.0.0";
    }
}
