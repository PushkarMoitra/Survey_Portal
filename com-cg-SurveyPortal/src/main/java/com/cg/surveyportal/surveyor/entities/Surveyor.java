package com.cg.surveyportal.surveyor.entities;

import com.cg.surveyportal.survey.entities.Survey;
import com.cg.surveyportal.topic.entities.Topic;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class Surveyor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy="surveyor")
    
    private List<Survey>createdSurveys;
    
    @OneToMany(mappedBy="surveyors")
    
    private List<Topic> topics;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Survey> getCreatedSurveys() {
        return createdSurveys;
    }

    public void setCreatedSurveys(List<Survey> createdSurveys) {
        this.createdSurveys = createdSurveys;
    }
}
