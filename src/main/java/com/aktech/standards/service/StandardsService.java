package com.aktech.standards.service;

import com.aktech.standards.model.Standard;
import com.aktech.standards.repository.StandardsRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StandardsService {

	@Autowired
	StandardsRepository standardsRepository;

	public Standard addStandard(Standard std) {
		log.info("inside service addStandard");
		try {
			Standard s =standardsRepository.save(std);
			log.info("Standard Added successfuly with id: "+s.getStandardId());
			return  s;
		}catch(Exception e){
			e.printStackTrace();
		}
		return new Standard();
	}

	public Standard getStandardDetails(long stdId) {
		log.info("inside getStandardDetails for stadId: "+stdId);
		try {
			return standardsRepository.getById(stdId);
		}catch(Exception e){
			e.printStackTrace();
		}
		return new Standard();
	}

	public List<Standard> getAllStandards() {
		try {
			return standardsRepository.findAll();
		}catch (Exception e){
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}
