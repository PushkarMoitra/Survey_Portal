package com.cg.surveyportal.topic.controllers;

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

import com.cg.surveyportal.topic.entities.Topic;
import com.cg.surveyportal.topic.service.ITopicService;

@RestController
@RequestMapping("/topic")
public class TopicController {

	@Autowired
	private ITopicService topicService;
	
	@GetMapping("/populate")
	private void populate()
	{
		topicService.populateTopic();
	}
	
	@GetMapping("/alltopics")
	private List<Topic> getAllTopics()
	{
		return topicService.getAllTopic();
	}
	
	@GetMapping("/topicbyid/{id}")
	private Topic getTopicById(@PathVariable("id") long id)
	{
		return topicService.getTopicById(id);
	}
	
	@GetMapping("/topicbyname/{name}")
	private List<Topic> getTopicById(@PathVariable("name") String name)
	{
		return topicService.getTopicsByName(name);
	}
	
	@PostMapping("/addtopic")
	private Topic addNewTopic(@RequestBody Topic topic)
	{
		return topicService.addTopic(topic);
	}
	
	@PutMapping("/modifytopic")
	private Topic modifyTopic(@RequestBody Topic topic)
	{
		return topicService.updateTopic(topic);
	}
	
	@DeleteMapping("/removetopicbyid/{id}")
	private Topic removeTopicById(@PathVariable("id") long id)
	{
		return topicService.removeTopicById(id);
	}
	
	@GetMapping("/topiccount")
	private long getTopicCount()
	{
		return topicService.getTopicCount();
	}
}
