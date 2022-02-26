package com.example.demonginx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sa
 * @date 26.02.2022
 * @time 14:19
 */
@RestController
public class DemoController
{
    @Value("${server.port}")
    private int PORT;

    @GetMapping("api/port")
    public ResponseEntity<?> port()
    {
        return ResponseEntity.ok("Running port is : " + PORT);
    }

    @GetMapping("api/rewrite")
    public ResponseEntity<?> rewrite()
    {
        return ResponseEntity.ok("Rewrite path ");
    }
}
