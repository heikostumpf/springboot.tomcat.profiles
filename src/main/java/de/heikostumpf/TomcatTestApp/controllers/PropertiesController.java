package de.heikostumpf.TomcatTestApp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${environment}")
    private String environment;

    @RequestMapping(value = "/properties", method = RequestMethod.GET, produces = "application/json")
    public String getAllProperties() {
        return environment;
    };

}
