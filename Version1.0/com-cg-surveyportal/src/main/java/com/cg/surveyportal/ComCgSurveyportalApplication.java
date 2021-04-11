package com.cg.surveyportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.surveyportal.topic.service.ITopicService;
import com.cg.surveyportal.topic.service.TopicServiceImpl;

@SpringBootApplication
public class ComCgSurveyportalApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(ComCgSurveyportalApplication.class, args);
	}

}
