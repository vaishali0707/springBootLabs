package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Trainee;
import com.example.service.TraineeService;


@RestController
public class TraineeController {
	
	@Autowired
	TraineeService trainee_service;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/trainee")
	public ResponseEntity<Trainee> addTrainee(@RequestBody Trainee trainee) 
	{
		trainee_service.addTrainee(trainee);
		return new ResponseEntity<Trainee>(trainee,HttpStatus.OK);
	}
	
	@GetMapping("/trainees")
	public ResponseEntity<List<Trainee>> getAllTrainees()
	{
		List<Trainee> list=trainee_service.findAll();
		return new ResponseEntity<List<Trainee>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/trainees/{id}")
	public ResponseEntity<Trainee> getTraineeById(@PathVariable int id)
	{
		Trainee t=trainee_service.findById(id);
		if(t!=null)
		{
			return new ResponseEntity<Trainee>(t,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Trainee>(HttpStatus.NOT_FOUND);
		}	
	}	
	
	@GetMapping("delete/{traineeId}")
	public String deleteTraniee(@PathVariable int traineeId)
	{
		trainee_service.deleteById(traineeId);
		return "Trainee Deleted";
	}
	
	@PutMapping("trainee/{traineeId}")
	public ResponseEntity<Trainee> updateTrainee(@PathVariable int traineeId,@RequestBody Trainee trainee)
	{
		Trainee update_trainee=trainee_service.findById(traineeId);
		if(update_trainee==null)
		{
		return new ResponseEntity<Trainee>(HttpStatus.NOT_FOUND);
		}
		else
		{
			Trainee trnee=trainee_service.update(trainee,traineeId);
		return new ResponseEntity<Trainee>(trnee,HttpStatus.OK);
		}
	}
}
