package com.cg.surveyportal.question.service;

import com.cg.surveyportal.exceptions.InvalidQuestionTextException;
import com.cg.surveyportal.exceptions.InvalidSurveyException;
import com.cg.surveyportal.exceptions.QuestionNotFoundException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.question.entities.Option;
import com.cg.surveyportal.question.entities.Question;
import com.cg.surveyportal.survey.entities.Survey;

import java.util.List;

public interface IQuestionService {

    Question findById(Long questionId) throws QuestionNotFoundException;

    Question createQuestion(Survey survey, String questionText, List<Option> options)
            throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException;

    

    Question removeById(Long questionId);

	Question updateQuestion(long questionId, Survey survey, String questionText, List<Option> options)
			throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException;

}
