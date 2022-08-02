package com.uce.edu.demo.correccion.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.repository.modelo.Doctor;
import com.uce.edu.demo.correccion.repository.modelo.Paciente;
import com.uce.edu.demo.correccion.repository.modelo.PacienteSencillo;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(codigo));
	}
	
	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente> myQuery=this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula=:datoCedula", Paciente.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<PacienteSencillo> buscar(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		
		TypedQuery<PacienteSencillo> myQuery = this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.correccion.repository.modelo.PacienteSencillo(p.cedula, p.nombre, p.fechaNacimiento, p.genero) from Paciente p Where p.fechaNacimiento > :fecha and p.genero=:genero",PacienteSencillo.class);
		myQuery.setParameter("fecha", fecha);
		myQuery.setParameter("genero", genero);
		return myQuery.getResultList();
	}

}
