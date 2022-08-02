package com.uce.edu.demo.correccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.repository.ICitaMedicaRepository;
import com.uce.edu.demo.correccion.repository.IDoctorRepository;
import com.uce.edu.demo.correccion.repository.IPacienteRepository;
import com.uce.edu.demo.correccion.repository.modelo.CitaMedica;
import com.uce.edu.demo.correccion.repository.modelo.Doctor;
import com.uce.edu.demo.correccion.repository.modelo.Paciente;

@Service
public class GestorCitaMedicaImpl implements IGestroCitaMedicaService{

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Autowired 
	private IDoctorRepository doctorRepository;
	
	@Override
	public void generarCita(String numero, LocalDateTime fechaCita, BigDecimal valor, String lugar,
			String cedulaPaciente, String cedulaDoctor) {
		// TODO Auto-generated method stub
		
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumero(numero);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setValor(valor);
		citaMedica.setLugar(lugar);
		
		Doctor miDoctor = this.doctorRepository.buscarPorCedula(cedulaDoctor);
		Paciente miPaciente = this.pacienteRepository.buscarPorCedula(cedulaPaciente);
		
		citaMedica.setPaciente(miPaciente);
		citaMedica.setDoctor(miDoctor);
		
		this.citaMedicaRepository.insertar(citaMedica);
	}

	@Override
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		
		CitaMedica cita = this.citaMedicaRepository.buscarPorNumero(numero);
		cita.setDiagnostico(diagnostico);
		cita.setFechaProximaCita(fechaProximaCita);
		cita.setReceta(receta);
		
		this.citaMedicaRepository.actualizar(cita);
	}

}
