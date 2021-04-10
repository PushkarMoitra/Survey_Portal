package com.cg.surveyportal.question.repository;

import com.cg.surveyportal.exceptions.InvalidQuestionTextException;

import com.cg.surveyportal.exceptions.QuestionNotFoundException;
import com.cg.surveyportal.question.entities.Option;
import com.cg.surveyportal.question.entities.Question;
import com.cg.surveyportal.survey.entities.Survey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IQuestionRepository extends CrudRepository<Question,Long> {

    Question findByQid(Long questionId) throws QuestionNotFoundException;

    Question add(Question question);

    void removeById(Long questionId) ;

    Question update(Question question) throws QuestionNotFoundException;

}
