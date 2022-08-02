package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Paciente1;

public interface IPacienteService1 {

	public void insertar(Paciente1 paciente);
	public Paciente1 buscar(Integer id);
	public void actualizar(Paciente1 paciente);
	public void eliminar(Integer id);
}
