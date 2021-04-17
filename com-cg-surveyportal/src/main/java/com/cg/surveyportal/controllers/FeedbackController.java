package com.cg.surveyportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.surveyportal.entities.Feedback;
import com.cg.surveyportal.exceptions.ParticipantNotFoundException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.services.IFeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	IFeedbackService feedbackService; 
	
	@GetMapping("/populate")
	private void populate() throws ParticipantNotFoundException, SurveyNotFoundException
	{
		feedbackService.populateFeedback();
	}
	
	@GetMapping("/all")
	private List<Feedback> getAll()
	{
		return feedbackService.getAll();
	}
	
}
