package com.uce.edu.demo.correccion.repository;

import com.uce.edu.demo.correccion.repository.modelo.Doctor;

public interface IDoctorRepository {

	public void insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscar(Integer codigo);
	public void eliminar(Integer codigo);
	
	public Doctor buscarPorCedula(String cedula);
	
}
