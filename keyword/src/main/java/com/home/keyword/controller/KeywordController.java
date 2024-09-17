package com.home.keyword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KeywordController {
	
	@GetMapping("/")
    public String main() {
        return "home"; // home.html 또는 home.jsp와 같은 뷰 페이지 이름
    }
}
