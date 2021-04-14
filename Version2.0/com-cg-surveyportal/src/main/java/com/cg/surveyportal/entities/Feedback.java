package com.cg.surveyportal.entities;

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

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column
    private LocalDateTime postedDateTime;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
	private Survey survey;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
    private Participant participant;
	
	
	public Feedback() {
	}
	public Feedback(Long id, LocalDateTime postedDateTime, Survey survey, Participant participant) {
		super();
		this.id = id;
		this.postedDateTime = postedDateTime;
		this.survey = survey;
		this.participant = participant;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getPostedDateTime() {
		return postedDateTime;
	}
	public void setPostedDateTime(LocalDateTime postedDateTime) {
		this.postedDateTime = postedDateTime;
	}
	public Survey getSurvey() {
		return survey;
	}
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", postedDateTime=" + postedDateTime + ", survey=" + survey + ", participant="
				+ participant + "]";
	}
}
