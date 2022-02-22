package com.teamsoft.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/places")
@Controller
public class PlaceController {

    @GetMapping("/")
    public String places() {
        return "place/index";
    }

    @GetMapping("/{placeId}")
    public String placeDetail(@PathVariable Long placeId) {
        System.out.println(placeId);
        return "place/detail";
    }
}
