package com.uce.edu.demo.correccion.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.correccion.repository.modelo.Paciente;
import com.uce.edu.demo.correccion.repository.modelo.PacienteSencillo;

public interface IPacienteRepository {

	public void insertar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscar(Integer codigo);
	public void eliminar(Integer codigo);
	
	public Paciente buscarPorCedula(String cedula);
	public List<PacienteSencillo> buscar(LocalDateTime fecha, String genero);
}
