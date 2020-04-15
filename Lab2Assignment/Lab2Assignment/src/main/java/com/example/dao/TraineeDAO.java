package com.example.dao;

import java.util.List;

import com.example.model.Trainee;

public interface TraineeDAO {
 void addTraineeDao(Trainee trainee);
 List<Trainee> findAll();
 Trainee findById(int id);
 void deleteById(int id);
 Trainee update(Trainee trainee, int traineeId);
 
}
