package com.uce.edu.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.repository.IPacienteRepository;
import com.uce.edu.demo.correccion.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public Paciente buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscar(codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(codigo);
	}

}
