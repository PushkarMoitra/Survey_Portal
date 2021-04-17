package com.cg.surveyportal.services;


import java.util.List;

import com.cg.surveyportal.entities.Feedback;
import com.cg.surveyportal.exceptions.ParticipantNotFoundException;


public interface IFeedbackService {
	
	public void populateFeedback() throws ParticipantNotFoundException;
	public List<Feedback> getAll();
	Feedback getById(long id) ;
	List<Feedback> getFeedbackDetails();
    Feedback removeById(Long feedbackId);
	Feedback updateFeedback(long feedbackId, String feedbackText);
	Feedback addFeedbackText (String text);
	public void populate();
	public void setOptionDefault(Feedback feedback);
}
