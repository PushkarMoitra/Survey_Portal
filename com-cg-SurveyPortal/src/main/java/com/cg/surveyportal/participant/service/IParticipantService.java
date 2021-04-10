package com.cg.surveyportal.participant.service;

import com.cg.surveyportal.exceptions.InvalidParticipantException;
import com.cg.surveyportal.feedback.entities.Feedback;
import com.cg.surveyportal.participant.entities.Participant;

import java.util.List;

public interface IParticipantService {

    Participant register(Participant participant) throws InvalidParticipantException;

    Participant authenticate(String username, String password) ;

    Participant update(Participant participant) throws InvalidParticipantException;

    /**
     *  finds count of surveys participant participated in
     *
     * @param participant
     * @return count of surveys participated in
     */
    int countParticipations(Participant participant) throws InvalidParticipantException;

}
