package com.cg.surveyportal.servicesimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.surveyportal.entities.Survey;
import com.cg.surveyportal.entities.Topic;
import com.cg.surveyportal.repositories.ITopicRepository;
import com.cg.surveyportal.services.ISurveyorService;
import com.cg.surveyportal.services.ITopicService;

@Service
public class TopicServiceImpl implements ITopicService {

	@Autowired
	private ITopicRepository topicRepository;
	@Autowired
	private ISurveyorService surveyorService;
	
	@Override
	public Topic getTopicDetails(long id) {
		Topic topicById = topicRepository.findById(id).get();
		return topicById;
	}

	@Override
	public List<Topic> getTopicsDetails(String name) {
		List<Topic> TopicsByName = topicRepository.findByName(name);
		return TopicsByName;
	}

	@Override
	public void populateTopic() {
		List<Topic> topicList = new ArrayList<>();
		
		Topic topic = new Topic();
		topic.setName("Movies");
		topic.setDescription("All surveys related to movies and flims will be found here.");
		topic.setSurveyor(surveyorService.getSurveyorDetails("hayChristo"));
		topicList.add(topic);
		//*************************************//
		topic = new Topic();
		topic.setName("TV Shows");
		topic.setDescription("All surveys related to TV Shows and Web Series will be found here.");
		topic.setSurveyor(surveyorService.getSurveyorDetails("berk_aleX"));
		topicList.add(topic);
		//*************************************//
		topic = new Topic();
		topic.setName("Gaming");
		topic.setDescription("All surveys related to video games and e-sports  will be found here.");
		topic.setSurveyor(surveyorService.getSurveyorDetails("jason_browdy"));
		topicList.add(topic);
		//*************************************//
		topic = new Topic();
		topic.setName("Litrature");
		topic.setDescription("All surveys related to Litrature and poetry will be found here.");
		topic.setSurveyor(surveyorService.getSurveyorDetails("MonsWill"));
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
		Topic updatedTopic = this.getTopicDetails(topic.getId());
		updatedTopic.setName(topic.getName());
		updatedTopic.setDescription(topic.getDescription());
		return topicRepository.save(updatedTopic);
	}

	@Override
	public Topic removeTopicById(long id) {
		Topic deletedTopic = this.getTopicDetails(id);
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
