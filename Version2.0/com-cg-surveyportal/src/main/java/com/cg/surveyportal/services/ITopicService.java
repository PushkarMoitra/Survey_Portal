package com.cg.surveyportal.services;

import java.util.List;

import com.cg.surveyportal.entities.Survey;
import com.cg.surveyportal.entities.Topic;

public interface ITopicService {

	public Topic getTopicDetails(long id) ;
    public List<Topic> getTopicsDetails(String name);
    public Topic addTopic(Topic newTopic);
    public Topic updateTopic(Topic topic);
    public Topic removeTopicById(long id);
    
    
    public List<Topic> getAllTopic();
    public void populateTopic();
    public long getTopicCount();
	public void addSurveysToTopic(Survey survey, String name);
}
