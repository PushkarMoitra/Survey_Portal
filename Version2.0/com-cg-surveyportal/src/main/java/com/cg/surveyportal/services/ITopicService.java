package com.cg.surveyportal.services;

import java.util.List;

import com.cg.surveyportal.entities.Survey;
import com.cg.surveyportal.entities.Topic;

public interface ITopicService {

	public Topic getTopicDetails(long id) ;
    public List<Topic> getTopicsDetails(String name);
    public Topic removeTopic(long id);
    public Topic addTopic(String name, String description, String surveyorUsername);
    public Topic updateTopicName(long id, String name);
    public Topic updateTopicDescription(long id, String description);
    
    public List<Topic> getAllTopic();
    //public void populateTopic();
    public long getTopicCount();
	public void addSurveysToTopic(Survey survey, String name);
	
	
}
