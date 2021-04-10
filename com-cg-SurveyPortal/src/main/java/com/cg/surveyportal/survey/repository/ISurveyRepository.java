package com.cg.surveyportal.survey.repository;

import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.exceptions.SurveyorNotFoundException;
import com.cg.surveyportal.survey.entities.Survey;

public interface ISurveyRepository {

    Survey add(Survey survey);

    Survey findById(Long surveyId) throws SurveyNotFoundException;

    Survey update(Survey survey) throws SurveyorNotFoundException;

    Survey removeById(Long surveyId) throws SurveyorNotFoundException;

    int countFeedbacksInSurvey(Survey survey);

}
