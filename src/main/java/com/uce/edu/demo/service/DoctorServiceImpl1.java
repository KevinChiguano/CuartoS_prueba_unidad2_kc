package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IDoctorRepository1;
import com.uce.edu.demo.repository.modelo.Doctor1;

@Service
public class DoctorServiceImpl1 implements IDoctorService1{

	@Autowired
	private IDoctorRepository1 doctorRepository;
	
	@Override
	public void insertar(Doctor1 doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.insertar(doctor);
	}

	@Override
	public Doctor1 buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepository.buscar(id);
	}

	@Override
	public void actualizar(Doctor1 doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepository.eliminar(id);
	}

}
