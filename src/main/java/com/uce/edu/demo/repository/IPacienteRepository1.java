package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Paciente1;

public interface IPacienteRepository1 {

	public void insertar(Paciente1 paciente);
	public Paciente1 buscar(Integer id);
	public void actualizar(Paciente1 paciente);
	public void eliminar(Integer id);
	
	public Paciente1 buscarsPorCedula(String cedula);
	
}
