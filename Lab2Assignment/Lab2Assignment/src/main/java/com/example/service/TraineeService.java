package com.example.service;

import java.util.List;

import com.example.model.Trainee;

public interface TraineeService {
	void addTrainee(Trainee trainee);
	List<Trainee> findAll();
	Trainee findById(int id);
	void deleteById(int id);
	Trainee update(Trainee trainee, int traineeId);
	
}
