package com.aktech.standards.controller;

import com.aktech.standards.model.Standard;
import com.aktech.standards.service.StandardsService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/standards")
@Slf4j
public class StandardsController {

	@Autowired
	StandardsService standardsService;

	@PostMapping("/")
	public Standard addStandard(@RequestBody Standard std){
		log.info("Received request for adding new standard:");
	try {
		return standardsService.addStandard(std);
	}catch (Exception e){
		e.printStackTrace();
	}
		return new Standard();
	}

	@GetMapping("/{id}")
	public Standard getStandardDetails(@PathVariable("id") long stdId){
		log.info("Received request for stdId:"+stdId);
		try {
			return standardsService.getStandardDetails(stdId);
		}catch (Exception e){
			e.printStackTrace();
		}
		return new Standard();
	}

	@GetMapping("/")
	public List<Standard> getAllStandards(){
		log.info("Received request for getting all standards: ");
		try {
			return standardsService.getAllStandards();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}
