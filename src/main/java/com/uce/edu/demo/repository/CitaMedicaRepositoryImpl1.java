package com.uce.edu.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CitaMedica1;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl1 implements ICitaMedicaRepository1{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica1 citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public int actualizar(String numero, String diagnostico, String receta, LocalDateTime fecha_control) {
		// TODO Auto-generated method stub
		
		Query myQuery =this.entityManager.createQuery("UPDATE CitaMedica cm SET cm.diagnostico =:datoDiagnostico, cm.receta =:datoReceta, cm.fechaControl =:datoFecha WHERE cm.numeroCita =:datoNumero");
		myQuery.setParameter("datoDiagnostico", diagnostico);
		myQuery.setParameter("datoReceta", receta);
		myQuery.setParameter("datoFecha", fecha_control);
		myQuery.setParameter("datoNumero", numero);
		
		return myQuery.executeUpdate();
	}

	@Override
	public List<CitaMedicaSencillo1> buscarCitasMedicas(LocalDateTime fecha, BigDecimal costo) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedicaSencillo1> myQuery = this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.repository.CitaMedicaSencillo(cd.numeroCita,cd.fechaCita,cd.costoCita,cd.fechaControl) FROM CitaMedica cd",CitaMedicaSencillo1.class);
		
		return myQuery.getResultList();
	}

	

}
