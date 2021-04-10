package com.cg.surveyportal.surveyor.repository;

import com.cg.surveyportal.exceptions.SurveyorNotFoundException;
import com.cg.surveyportal.exceptions.TopicNotFoundException;
import com.cg.surveyportal.survey.entities.Survey;
import com.cg.surveyportal.surveyor.entities.Surveyor;
import com.cg.surveyportal.topic.entities.Topic;

public interface ISurveyorRepository {

    Surveyor add(Surveyor surveyor);

    Surveyor findById(Long id) throws SurveyorNotFoundException;

    Surveyor update(Surveyor surveyor) throws SurveyorNotFoundException;

}
