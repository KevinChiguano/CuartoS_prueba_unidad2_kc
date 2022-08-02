package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Doctor1;

public interface IDoctorRepository1 {
	
	public void insertar(Doctor1 doctor);
	public Doctor1 buscar(Integer id);
	public void actualizar(Doctor1 doctor);
	public void eliminar(Integer id);
	
	public Doctor1 buscarsPorCedula(String cedula);

}
