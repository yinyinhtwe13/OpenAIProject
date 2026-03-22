package com.yinyinhtwe.OpenAIProject;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TimeZone;

@SpringBootApplication
@RestController

public class OpenAiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenAiProjectApplication.class, args);
	}

    @GetMapping
    public String helloWorld(){
        return "Hello World Spring Boot";
    }

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Yangon"));
    }

}
