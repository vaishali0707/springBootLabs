package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Trainee;

@Repository
@Transactional
public class TraineeDAOImpl implements TraineeDAO {

	@Autowired
	EntityManager em;

	@Override
	public void addTraineeDao(Trainee trainee) {
		em.persist(trainee);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Trainee> findAll() {
		 Query query = em.createQuery("SELECT t FROM Trainee as t");	
		 List<Trainee> all=query.getResultList();
		return all;
	}

	@Override
	public Trainee findById(int id) {
		return em.find(Trainee.class,id);	 
	}

	@Override
	public void deleteById(int id) {
		Trainee t=em.getReference(Trainee.class, id);
		em.remove(t);
	}

	@Override
	public Trainee update(Trainee trainee,int traineeId) {
		Trainee update_trainee=em.find(Trainee.class, traineeId);
		update_trainee.setTraineeName(trainee.getTraineeName());
		update_trainee.setTraineeDomain(trainee.getTraineeDomain());
		return update_trainee;
	}
}
