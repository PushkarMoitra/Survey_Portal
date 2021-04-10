package com.cg.surveyportal.feedback.repository;

import com.cg.surveyportal.exceptions.FeedbackNotFoundException;
import com.cg.surveyportal.feedback.entities.Feedback;

import java.util.List;

public interface IFeedbackRepository {

   Feedback findById(Long feedbackId) throws FeedbackNotFoundException;

   Feedback add(Feedback feedback);

   Feedback update(Feedback feedback) throws FeedbackNotFoundException;;

   void removeByFeedbackId(Long feedbackId) ;



}
