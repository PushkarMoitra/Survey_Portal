package com.cg.surveyportal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	private String TOPIC_NOT_FOUND = "TOPIC_NOT_FOUND";
	private String INVALID_TOPIC_EXCEPTION = "INVALID_TOPIC_EXCEPTION";	
	private String SURVEYOR_NOT_FOUND = "SURVEYOR_NOT_FOUND";
	private String PARTICIPANT_NOT_FOUND = "PARTICIPANT_NOT_FOUND";
	private String INVALID_PARTICIPANT_EXCEPTION = "INVALID_PARTICIPANT_EXCEPTION";	
	@ExceptionHandler(TopicNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTopicNotFoundException(TopicNotFoundException topicNotFoundException, WebRequest request) {
		String details = topicNotFoundException.getLocalizedMessage();
        ErrorDetails error = new ErrorDetails(TOPIC_NOT_FOUND, details);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InvalidTopicNameException.class)
	public ResponseEntity<ErrorDetails> handleInvalidTopicException(InvalidTopicNameException invalidTopicException, WebRequest request) {
		String details = invalidTopicException.getLocalizedMessage();
        ErrorDetails error = new ErrorDetails(INVALID_TOPIC_EXCEPTION, details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(SurveyorNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleSurveyorNotFoundException(SurveyorNotFoundException surveyorNotFoundException, WebRequest request) {
		String details = surveyorNotFoundException.getLocalizedMessage();
        ErrorDetails error = new ErrorDetails(SURVEYOR_NOT_FOUND, details);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(ParticipantNotFoundException.class)
	public ResponseEntity<ErrorDetails> handelParticipantNotFoundException(ParticipantNotFoundException participantNotFoundException, WebRequest request) {
		String details = participantNotFoundException.getLocalizedMessage();
        ErrorDetails error = new ErrorDetails(PARTICIPANT_NOT_FOUND, details);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InvalidParticipantException.class)
	public ResponseEntity<ErrorDetails> handleInvalidParticipantException(InvalidParticipantException invalidParticipantException, WebRequest request) {
		String details = invalidParticipantException.getLocalizedMessage();
        ErrorDetails error = new ErrorDetails(INVALID_PARTICIPANT_EXCEPTION, details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
