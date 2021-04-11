package com.cg.surveyportal.topic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.surveyportal.survey.entities.Survey;
import com.cg.surveyportal.survey.service.ISurveyService;
import com.cg.surveyportal.topic.entities.Topic;
import com.cg.surveyportal.topic.repository.ITopicRepository;

@Service
public class TopicServiceImpl implements ITopicService {

	@Autowired
	private ITopicRepository topicRepository;
	
	@Override
	public Topic getTopicById(long id) {
		Topic topicById = topicRepository.findById(id).get();
		return topicById;
	}

	@Override
	public List<Topic> getTopicsByName(String name) {
		List<Topic> TopicsByName = topicRepository.findByName(name);
		return TopicsByName;
	}

	@Override
	public void populateTopic() {
		List<Topic> topicList = new ArrayList<>();
		
		Topic topic = new Topic();
		topic.setName("Movies");
		topic.setDescription("All surveys related to movies and flims will be found here.");
		topicList.add(topic);
		//*************************************//
		topic = new Topic();
		topic.setName("TV Shows");
		topic.setDescription("All surveys related to TV Shows and Web Series will be found here.");
		topicList.add(topic);
		//*************************************//
		topic = new Topic();
		topic.setName("Gaming");
		topic.setDescription("All surveys related to video games and e-sports  will be found here.");
		topicList.add(topic);
		//*************************************//
		topic = new Topic();
		topic.setName("Litrature");
		topic.setDescription("All surveys related to Litrature and poetry will be found here.");
		topicList.add(topic);
		//*************************************//
		topicRepository.saveAll(topicList);
	}

	@Override
	public List<Topic> getAllTopic() {
		return topicRepository.findAll();
	}

	@Override
	public Topic addTopic(Topic newTopic) {
		topicRepository.save(newTopic);
		return newTopic;
	}

	@Override
	public Topic updateTopic(Topic topic) {
		Topic updatedTopic = this.getTopicById(topic.getId());
		updatedTopic.setName(topic.getName());
		updatedTopic.setDescription(topic.getDescription());
		return topicRepository.save(updatedTopic);
	}

	@Override
	public Topic removeTopicById(long id) {
		Topic deletedTopic = this.getTopicById(id);
		topicRepository.deleteById(id);
		return deletedTopic;
	}

	@Override
	public long getTopicCount() {
		return topicRepository.count();
	}

	
	@Override
	public void addSurveysToTopic(Survey survey, String name) {
		Topic addSurveyTo = topicRepository.findByName(name).get(0);
		addSurveyTo.getSurveys().add(survey);
	}

}
