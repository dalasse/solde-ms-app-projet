package org.dgb.ds.employerservice.web;

import org.dgb.ds.employerservice.config.GlobalConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class ConfigTestController {
    @Autowired
    private GlobalConfig globalConfig;

    @Value("${employer.params.x}")
    private String x;
    @Value("${employer.params.y}")
    private String y;

    @GetMapping("/configTest")
    public Map<String, String> config(){
        return Map.of(
                "x",x,
                "y",y
        );
    }

    @GetMapping("/globalConfig")
    public GlobalConfig globalConfig(){
        return globalConfig;
    }
}