package com.cg.surveyportal.participant.repository;

import com.cg.surveyportal.exceptions.InvalidParticipantException;
import com.cg.surveyportal.exceptions.ParticipantNotFoundException;
import com.cg.surveyportal.feedback.entities.Feedback;
import com.cg.surveyportal.participant.entities.Participant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface IParticipantRepository {

    Participant add(Participant participant) ;

    Participant update(Participant participant) throws ParticipantNotFoundException;

    List<Feedback>findFeedbacksByParticipantAfterDateTime(Participant participant, LocalDateTime dateTime);

}
