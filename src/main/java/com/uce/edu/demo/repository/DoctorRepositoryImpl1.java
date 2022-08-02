package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Doctor1;

@Repository
@Transactional
public class DoctorRepositoryImpl1 implements IDoctorRepository1{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor1 doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public Doctor1 buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor1.class, id);
	}

	@Override
	public void actualizar(Doctor1 doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Doctor1 doctor = this.buscar(id);
		this.entityManager.remove(doctor);
	}

	@Override
	public Doctor1 buscarsPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor1> myQuery = this.entityManager.createQuery("SELECT d FROM Doctor d WHERE d.cedula =:datoCedula",Doctor1.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

}
