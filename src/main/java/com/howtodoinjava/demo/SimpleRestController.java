package com.howtodoinjava.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

	@Value("${country}")
	private String value;

	@Value("${player_lives}")
	private String player_lives;
	@Value("${PROPERTIES_FILE_NAME}")
	private String PROPERTIES_FILE_NAME;
	@Value("${base_properties}")
	private String base_properties;
	
	@GetMapping("/example")
	public String example() {
		return "Hello User !! " + new Date()+ value +" "+ player_lives +" "+ PROPERTIES_FILE_NAME+" " + base_properties;
	}

	public static void main(String[] args) {
		String text = "Lorem Ipsum is simply dummy text";
		String substring = text.substring(3);
		System.out.println(substring);
		System.out.println(substring.length());
		
		
		substring = text.substring(3, 10);
		System.out.println(substring);
		System.out.println(substring.length());
	}

}
