package com.cg.surveyportal.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.surveyportal.survey.entities.Survey;

public interface ISurveyRepository extends JpaRepository<Survey, Long> {

}
