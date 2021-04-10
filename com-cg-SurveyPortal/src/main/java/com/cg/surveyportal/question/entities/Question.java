package com.cg.surveyportal.question.entities;

import com.cg.surveyportal.survey.entities.Survey;


import com.cg.surveyportal.topic.entities.Topic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Question {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	

    private Long id;

	@Column(name = "QuestionText" , nullable = false, length = 200)
	
	
    private String questionText;

    @ManyToOne
    
    private Survey survey;

    // read about @ElementCollection
    
    @ElementCollection
    
    private List<Option> options;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }


    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }


    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
}
