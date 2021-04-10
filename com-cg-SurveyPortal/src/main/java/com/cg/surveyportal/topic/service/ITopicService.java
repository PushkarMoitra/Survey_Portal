package com.cg.surveyportal.topic.service;

import com.cg.surveyportal.exceptions.TopicNotFoundException;
import com.cg.surveyportal.surveyor.entities.Surveyor;
import com.cg.surveyportal.topic.entities.Topic;

public interface ITopicService {

    Topic createTopic(Surveyor surveyor, String topicName);

    Topic findById(Long id) throws TopicNotFoundException;

    Topic findByName(String topicName)throws TopicNotFoundException;

    Topic updateTopic(Long topicId, String topicName, String description) throws TopicNotFoundException;

    int countSurveysDoneForTopic(Topic topic);
}
