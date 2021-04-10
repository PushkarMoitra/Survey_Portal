package com.cg.surveyportal.topic.repository;

import com.cg.surveyportal.exceptions.TopicNotFoundException;
import com.cg.surveyportal.topic.entities.Topic;

public interface ITopicRepository {

    Topic add(Topic topic);

    Topic findById(Long id) throws TopicNotFoundException;

    Topic findByName(String name)throws TopicNotFoundException;

    Topic update(Topic topic) throws TopicNotFoundException;

    Topic removeById(Long id) throws TopicNotFoundException;

    int countSurveysDoneForTopic(Topic topic);

}
