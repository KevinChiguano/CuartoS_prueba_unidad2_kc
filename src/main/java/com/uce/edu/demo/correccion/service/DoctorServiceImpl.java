package com.uce.edu.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.repository.IDoctorRepository;
import com.uce.edu.demo.correccion.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.insertar(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public Doctor buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.doctorRepository.buscar(codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		this.doctorRepository.eliminar(codigo);
	}

}
