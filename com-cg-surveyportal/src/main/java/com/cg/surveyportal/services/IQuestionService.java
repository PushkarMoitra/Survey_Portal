package com.cg.surveyportal.services;

import java.util.List;

import com.cg.surveyportal.entities.Question;


public interface IQuestionService {

    public Question getById(long id) ;
    public List<Question> getQuestionDetails();
    public Question removeById(Long questionId);
    public Question updateQuestion(long questionId,String questionText);
	public void populate();
	public Question addQuestion(String questionText, Long surveyId);
	public void setOptionDefault(Question question);
}