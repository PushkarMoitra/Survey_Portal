package com.cg.surveyportal.question.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.surveyportal.exceptions.InvalidQuestionTextException;
import com.cg.surveyportal.exceptions.InvalidSurveyException;
import com.cg.surveyportal.exceptions.QuestionNotFoundException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.question.entities.Option;
import com.cg.surveyportal.question.entities.Question;
import com.cg.surveyportal.question.repository.IQuestionRepository;
import com.cg.surveyportal.survey.entities.Survey;

public class QuestionServiceImpl implements IQuestionService {
	
	@Autowired
	IQuestionRepository questionRepository;

	@Override
	public Question findById(Long questionId) throws QuestionNotFoundException {
    Question questionById = questionRepository.findById(questionId).get();
		
		return questionById;
	}

	@Override
	public Question createQuestion(Survey survey, String questionText, List<Option> options)
			throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException {
		
		Question newQuestion = new Question();
		newQuestion.setSurvey(survey);
		newQuestion.setQuestionText(questionText);
		newQuestion.setOptions(options);
		
		questionRepository.save(newQuestion);
		
		return newQuestion;
	}

	
    public Question updateQuestion(long questionId, Survey survey, String questionText, List<Option> options)
			throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException {
		    Question updateQuestion = questionRepository.findById(questionId).get();
		    updateQuestion.setSurvey(survey);
			updateQuestion.setQuestionText(questionText);
			updateQuestion.setOptions(options);
			
			questionRepository.save(updateQuestion);
		return updateQuestion;
	}

	@Override
	public Question removeById(Long questionId) {
		
		Question deletedQuestion = questionRepository.findById(questionId).get();
		questionRepository.deleteById(questionId);
		
		return deletedQuestion;
	}

}
