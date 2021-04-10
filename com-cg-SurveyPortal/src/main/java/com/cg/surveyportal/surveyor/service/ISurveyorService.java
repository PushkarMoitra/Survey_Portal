package com.cg.surveyportal.surveyor.service;

import com.cg.surveyportal.exceptions.InvalidSurveyorException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.survey.entities.Survey;
import com.cg.surveyportal.surveyor.entities.Surveyor;
import com.cg.surveyportal.topic.entities.Topic;

import java.util.List;

public interface ISurveyorService {

    Surveyor register(Surveyor surveyor) throws InvalidSurveyorException;

    Surveyor authenticate(String username, String password);

    Surveyor findById(Long surveyorId) throws SurveyNotFoundException;

    Surveyor update(Surveyor surveyor)throws InvalidSurveyorException,SurveyNotFoundException;


}
