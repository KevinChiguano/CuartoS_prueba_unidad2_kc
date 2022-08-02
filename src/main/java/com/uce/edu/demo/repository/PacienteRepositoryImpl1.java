package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Doctor1;
import com.uce.edu.demo.repository.modelo.Paciente1;

@Repository
@Transactional
public class PacienteRepositoryImpl1 implements IPacienteRepository1{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Paciente1 paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente1 buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente1.class, id);
	}

	@Override
	public void actualizar(Paciente1 paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Paciente1 paciente = this.buscar(id);
		this.entityManager.remove(paciente);
	}

	@Override
	public Paciente1 buscarsPorCedula(String cedula) {
		// TODO Auto-generated method stub
		
		TypedQuery<Paciente1> myQuery = this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula =:datoCedula",Paciente1.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
		
	}

}
