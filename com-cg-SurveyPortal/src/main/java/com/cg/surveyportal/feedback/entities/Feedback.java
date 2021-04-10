package com.cg.surveyportal.feedback.entities;

import com.cg.surveyportal.participant.entities.Participant;
import com.cg.surveyportal.question.entities.Option;
import com.cg.surveyportal.survey.entities.Survey;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * represents the survey response
 */
public class Feedback {

    private Long id;

    private Survey survey;

    private LocalDateTime postedDateTime;

    private Participant participant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public LocalDateTime getPostedDateTime() {
        return postedDateTime;
    }

    public void setPostedDateTime(LocalDateTime postedDateTime) {
        this.postedDateTime = postedDateTime;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    //map of question id Long key and option as value
    // read about @ElementCollection
    private Map<Long,Option>chosenAnswers;

    public Map<Long, Option> getChosenAnswers() {
        return chosenAnswers;
    }

    public void setChosenAnswers(Map<Long, Option> chosenAnswers) {
        this.chosenAnswers = chosenAnswers;
    }


}
