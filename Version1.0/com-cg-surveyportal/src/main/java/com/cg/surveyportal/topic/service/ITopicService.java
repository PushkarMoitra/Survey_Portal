package com.cg.surveyportal.topic.service;

import java.util.List;

import com.cg.surveyportal.topic.entities.Topic;

public interface ITopicService {

	public Topic getTopicById(long id) ;
    public List<Topic> getTopicsByName(String name);
    public Topic addTopic(Topic newTopic);
    public Topic updateTopic(Topic topic);
    public Topic removeTopicById(long id);
    
    
    public List<Topic> getAllTopic();
    public void populateTopic();
    public long getTopicCount();
}
