package com.cg.surveyportal.survey.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.surveyportal.survey.entities.Survey;
import com.cg.surveyportal.survey.service.ISurveyService;

@RestController
@RequestMapping("/survey")
public class SurveyControllers {
	
	@Autowired
	private ISurveyService surveyService;
	
	@GetMapping("/populate")
	private void populateSurvey() {
		surveyService.populateSurvey();
	}
	
	@GetMapping("/allsurveys")
	private List<Survey> getAllSurveys() {
		return surveyService.getAllSurveys();
	}

}
