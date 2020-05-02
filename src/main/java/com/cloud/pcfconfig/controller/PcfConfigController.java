package com.cloud.pcfconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PcfConfigController {

    @Value("${app.name:none}")
    private String name;

    @RequestMapping("/getPropertyFromConfigServer")
    public String getPropertyValue() {
        return name;
    }
}
