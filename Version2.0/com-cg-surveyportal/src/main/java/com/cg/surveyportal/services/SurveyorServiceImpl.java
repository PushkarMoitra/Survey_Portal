package com.cg.surveyportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.surveyportal.entities.Surveyor;
import com.cg.surveyportal.repositories.ISurveyorRepository;
@Service
public class SurveyorServiceImpl implements ISurveyorService {

	@Autowired
	ISurveyorRepository surveyorRepository;
	
	@Override
	public void populateSurveyor() {
		Surveyor serveyor = new Surveyor();
		serveyor.setFirstName("Jason");
		serveyor.setLastName("Browdy");
		serveyor.setUsername("jason_browdy");
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("Alex");
		serveyor.setLastName("Berk");
		serveyor.setUsername("berk_aleX");
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("Christopher");
		serveyor.setLastName("Haywire");
		serveyor.setUsername("hayChristo");
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
		serveyor = new Surveyor();
		serveyor.setFirstName("Monica");
		serveyor.setLastName("Williams");
		serveyor.setUsername("MonsWill");
		surveyorRepository.save(serveyor);
		/*----------------------------------------------*/
	}

	@Override
	public List<Surveyor> getAllSurveyor() {
		return surveyorRepository.findAll();
	}

	@Override
	public Surveyor getSurveyorDetails(String userName) {
		return surveyorRepository.findByUsername(userName);
	}
	
	public Surveyor getSurveyorDetails(long id) {
		return surveyorRepository.findById(id).get();
	}


}
