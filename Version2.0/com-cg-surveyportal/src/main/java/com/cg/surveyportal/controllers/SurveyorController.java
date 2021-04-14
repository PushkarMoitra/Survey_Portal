package com.cg.surveyportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.surveyportal.entities.Surveyor;
import com.cg.surveyportal.services.ISurveyorService;

@RestController
@RequestMapping("/surveyor")
public class SurveyorController {

	@Autowired
	ISurveyorService surveyorService;
	
	@GetMapping("/populate")
	private void populate()
	{
		surveyorService.populateSurveyor();
	}
	
	@GetMapping("/allsurveyors")
	private List<Surveyor> getAllSurveyors()
	{
		return surveyorService.getAllSurveyor();
	}
	
	@GetMapping("/findbyid/{id}")
	private Surveyor getSurveyorById(@PathVariable("id") long id)
	{
		return surveyorService.getSurveyorDetails(id);
	}
}
