package com.cg.surveyportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.surveyportal.entities.Topic;
import com.cg.surveyportal.exceptions.SurveyorNotFoundException;
import com.cg.surveyportal.exceptions.TopicNotFoundException;
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
	private ResponseEntity<List<Topic>> getAllTopics()
	{
		return new ResponseEntity<>(topicService.getAllTopic(), HttpStatus.OK);
	}
	
	@GetMapping("/topicbyid/{id}")
	private ResponseEntity<Topic> getTopicById(@PathVariable("id") long id) throws TopicNotFoundException
	{
		return new ResponseEntity<>(topicService.getTopicDetails(id), HttpStatus.FOUND);
	}
	
	@GetMapping("/topicbyname/{name}")
	private ResponseEntity<List<Topic>> getTopicById(@PathVariable("name") String name) throws TopicNotFoundException
	{
		//return topicService.getTopicsDetails(name);
		return new ResponseEntity<>(topicService.getTopicsDetails(name), HttpStatus.FOUND);
	}
	
	@GetMapping("/topiccount")
	private ResponseEntity<Long> getTopicCount()
	{
		return new ResponseEntity<>(topicService.getTopicCount(), HttpStatus.OK);
	}
	
	@GetMapping("/surveycountontopic/{name}")
	private ResponseEntity<Long> getSurveyCountOnTopic(@PathVariable("name") String name) throws TopicNotFoundException
	{
		return new ResponseEntity<>(topicService.getSurveyCountOnTopic(name), HttpStatus.FOUND);
	}

	@PostMapping("/addtopic/{name}/{description}/{surveyorUsername}")
	private ResponseEntity<Topic> addNewTopic(@PathVariable("name") String name, @PathVariable("description") String description, @PathVariable("surveyorUsername") String surveyorUsername ) throws SurveyorNotFoundException
	{
		return new ResponseEntity<>(topicService.addTopic(name, description, surveyorUsername), HttpStatus.CREATED);
	}
	
	@PutMapping("/modify/name/{id}/{name}")
	private ResponseEntity<Topic> modifyTopicName(@PathVariable("id") long id, @PathVariable("name") String name) throws TopicNotFoundException
	{
		return new ResponseEntity<>(topicService.updateTopicName(id, name), HttpStatus.OK);
	}
	
	@PutMapping("/modify/description/{id}/{description}")
	private ResponseEntity<Topic> modifyTopicDescription(@PathVariable("id") long id, @PathVariable("description") String description) throws TopicNotFoundException
	{
		return new ResponseEntity<>(topicService.updateTopicDescription(id, description), HttpStatus.OK);
	}
	
	@DeleteMapping("/removetopic/{id}")
	private ResponseEntity<Topic> removeTopic(@PathVariable("id") long id) throws TopicNotFoundException
	{
		return new ResponseEntity<>(topicService.removeTopic(id), HttpStatus.OK);
	}

}
