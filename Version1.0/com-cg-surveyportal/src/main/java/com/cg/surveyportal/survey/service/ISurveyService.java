package com.cg.surveyportal.survey.service;

import java.util.List;

import com.cg.surveyportal.survey.entities.Survey;

public interface ISurveyService {

	public void populateSurvey();
	public List<Survey> getAllSurveys();
	public Survey getSurveyById(long id);
}
