package com.cg.surveyportal.survey.entities;

import com.cg.surveyportal.question.entities.Question;
import com.cg.surveyportal.surveyor.entities.Surveyor;


import com.cg.surveyportal.topic.entities.Topic;



import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity

public class Survey {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String description;
    
    @ManyToOne
    private Topic topic;
    
    @ManyToOne
    private Surveyor surveyor;
    private LocalDateTime publishedDateTime;
    private LocalDateTime endDateTime;
    private Boolean active;
    
    @OneToMany(mappedBy="survey")
    
    private List<Question> questions; 
  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

   

    public Surveyor getSurveyor() {
		return surveyor;
	}

	public void setSurveyor(Surveyor surveyor) {
		this.surveyor = surveyor;
	}

	public LocalDateTime getPublishedDateTime() {
        return publishedDateTime;
    }

    public void setPublishedDateTime(LocalDateTime publishedDateTime) {
        this.publishedDateTime = publishedDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
