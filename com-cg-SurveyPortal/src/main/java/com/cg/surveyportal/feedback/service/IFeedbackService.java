package com.cg.surveyportal.feedback.service;

import com.cg.surveyportal.exceptions.FeedbackNotFoundException;
import com.cg.surveyportal.exceptions.InvalidParticipantException;
import com.cg.surveyportal.exceptions.InvalidSurveyException;
import com.cg.surveyportal.feedback.entities.Feedback;
import com.cg.surveyportal.participant.entities.Participant;
import com.cg.surveyportal.question.entities.Option;
import com.cg.surveyportal.survey.entities.Survey;
import com.cg.surveyportal.surveyor.entities.Surveyor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface IFeedbackService {

    Feedback createFeedback(Survey survey, Participant participant, Map<Long, Option> answers)
            throws InvalidSurveyException, InvalidParticipantException;

    Feedback updateFeedback(Long feedbackId, Map<Long, Option> answers) throws FeedbackNotFoundException;

    List<Feedback>findFeedbacksForSurveyAfterDateTime(Survey survey, LocalDateTime dateTime);

    void removeByFeedbackById(Long feedbackId);

}
