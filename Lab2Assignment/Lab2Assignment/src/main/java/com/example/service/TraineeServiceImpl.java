package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.TraineeDAO;
import com.example.model.Trainee;


@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDAO trainee_dao;

	@Override
	public void addTrainee(Trainee trainee) {
		trainee_dao.addTraineeDao(trainee);
	}

	@Override
	public List<Trainee> findAll() {
		return trainee_dao.findAll();
	}

	@Override
	public Trainee findById(int id) {
		return trainee_dao.findById(id);
	}

	@Override
	public void deleteById(int id) {
		 trainee_dao.deleteById(id);
	}

	@Override
	public Trainee update(Trainee trainee,int traineeId) {
		return trainee_dao.update(trainee,traineeId);
		
	}
	
}
