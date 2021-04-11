package com.cg.surveyportal.survey.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cg.surveyportal.topic.entities.Topic;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table
public class Survey {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column( length = 200)	
    private String description;
	@Column
    private LocalDateTime publishedDateTime;
	@Column
    private LocalDateTime endDateTime;
	@Column
    private Boolean isActive;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "topic")
    private Topic topic;
//  @ManyToOne
//  private Surveyor surveyor;
//  @OneToMany(mappedBy="survey")
//  private List<Question> questions; 
	
	
	//Constructors
	public Survey() {
	}
	public Survey(Long id, String description, LocalDateTime publishedDateTime, LocalDateTime endDateTime, Boolean isActive, Topic topic) {
	super();
	this.id = id;
	this.description = description;
	this.publishedDateTime = publishedDateTime;
	this.endDateTime = endDateTime;
	this.topic = topic;
	}
	
	//Getters and setters
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
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	@Override
	public String toString() {
		return "Survey [id=" + id + ", description=" + description + ", publishedDateTime=" + publishedDateTime
				+ ", endDateTime=" + endDateTime + ", isActive=" + isActive + ", topic=" + topic + "]";
	}
}
