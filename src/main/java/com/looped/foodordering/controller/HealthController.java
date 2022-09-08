package com.looped.foodordering.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * User: looped
 * DateTime: 2022/9/7 10:36
 * Description:
 * History:
 */
@Controller
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity health() {
        return ResponseEntity.ok().build();
    }
}
