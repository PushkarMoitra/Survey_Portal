package com.cg.surveyportal.survey.service;

import com.cg.surveyportal.exceptions.InvalidSurveyException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.participant.entities.Participant;
import com.cg.surveyportal.survey.entities.Survey;

import java.util.List;

public interface ISurveyService {
    Survey updateSurveyDescription(Long surveyId, String description) throws SurveyNotFoundException;

    Survey add(Survey survey) throws InvalidSurveyException;

    Survey findById(Long id) throws SurveyNotFoundException;

    void removeSurveyById(Long id) throws SurveyNotFoundException;

    /**
     *  finds all participants who participated in survey
     *
     * @param survey
     * @return list of participants
     */
     List<Participant>findParticipants(Survey survey) throws SurveyNotFoundException,InvalidSurveyException;

    /**
     *  calculates count of feedbacks posted in the survey
     *
     * @param survey
     * @return count of feedbacks posted in survey
     */
     int countFeedbacksInSurvey(Survey survey) throws SurveyNotFoundException,InvalidSurveyException;

    /**
     * close survey
     * @param survey
     */
     void close(Survey survey);

}
