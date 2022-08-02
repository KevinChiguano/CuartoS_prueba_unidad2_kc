package com.uce.edu.demo.correccion.service;

import com.uce.edu.demo.correccion.repository.modelo.Doctor;

public interface IDoctorService {

	public void insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscar(Integer codigo);
	public void eliminar(Integer codigo);
	
}
