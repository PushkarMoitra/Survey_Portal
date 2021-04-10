package com.cg.surveyportal.topic.entities;

import com.cg.surveyportal.survey.entities.Survey;

import com.cg.surveyportal.surveyor.entities.Surveyor;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

    private Long id;

    private String topicName;

    private String topicDescription;
    
    @OneToMany(mappedBy="topic")

    private List<Survey>surveys;

    //topic created by
    @ManyToOne
    private Surveyor surveyors;

    public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public Surveyor getSurveyor() {
		return surveyors;
	}

	public void setSurveyor(Surveyor surveyor) {
		this.surveyors = surveyor;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public List<Survey> getSurveys() {
        return surveys;
    }

    public void setSurveys(List<Survey> surveys) {
        this.surveys = surveys;
    }

   
}
