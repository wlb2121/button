package com.tts.anotherawesomeproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/tts")
	public String tts() {
		return "index";
	
	
	}
	@RequestMapping("/beep")
	public String beep() {
		return "index2";
}
}