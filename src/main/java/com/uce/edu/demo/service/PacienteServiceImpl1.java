package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPacienteRepository1;
import com.uce.edu.demo.repository.modelo.Paciente1;

@Service
public class PacienteServiceImpl1 implements IPacienteService1{

	@Autowired
	private IPacienteRepository1 pacienteRepository;
	
	@Override
	public void insertar(Paciente1 paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public Paciente1 buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscar(id);
	}

	@Override
	public void actualizar(Paciente1 paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(id);
	}

}
