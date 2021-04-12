package com.cg.surveyportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.surveyportal.entities.Topic;
import com.cg.surveyportal.services.ITopicService;

@RestController
@RequestMapping("/topic")
public class TopicController {

	@Autowired
	private ITopicService topicService;
	
//	@GetMapping("/populate")
//	private void populate()
//	{
//		topicService.populateTopic();
//	}
	
	@GetMapping("/alltopics")
	private List<Topic> getAllTopics()
	{
		return topicService.getAllTopic();
	}
	
	@GetMapping("/topicbyid/{id}")
	private Topic getTopicById(@PathVariable("id") long id)
	{
		return topicService.getTopicDetails(id);
	}
	
	@GetMapping("/topicbyname/{name}")
	private List<Topic> getTopicById(@PathVariable("name") String name)
	{
		return topicService.getTopicsDetails(name);
	}
	
	@GetMapping("/topiccount")
	private long getTopicCount()
	{
		return topicService.getTopicCount();
	}

	@PostMapping("/addtopic/{name}/{description}/{surveyorUsername}")
	private Topic addNewTopic(@PathVariable("name") String name, @PathVariable("description") String description, @PathVariable("surveyorUsername") String surveyorUsername )
	{
		return topicService.addTopic(name, description, surveyorUsername);
	}
	
	@PutMapping("/modify/name/{id}/{name}")
	private Topic modifyTopicName(@PathVariable("id") long id, @PathVariable("name") String name)
	{
		return topicService.updateTopicName(id, name);
	}
	
	@PutMapping("/modify/description/{id}/{description}")
	private Topic modifyTopicDescription(@PathVariable("id") long id, @PathVariable("description") String description)
	{
		return topicService.updateTopicDescription(id, description);
	}
	
	@DeleteMapping("/removetopicbyid/{id}")
	private Topic removeTopicById(@PathVariable("id") long id)
	{
		return topicService.removeTopic(id);
	}
}
