package com.cg.surveyportal.services;

import java.util.List;

import com.cg.surveyportal.entities.Surveyor;

public interface ISurveyorService {

	public void populateSurveyor();
	public Surveyor getSurveyorDetails(long id);
	public List<Surveyor> getAllSurveyor();
	public Surveyor getSurveyorDetails(String userName);
}
