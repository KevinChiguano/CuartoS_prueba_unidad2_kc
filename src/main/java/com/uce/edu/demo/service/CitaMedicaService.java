package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.CitaMedicaSencillo;
import com.uce.edu.demo.repository.ICitaMedicaRepository;
import com.uce.edu.demo.repository.IDoctorRepository;
import com.uce.edu.demo.repository.IPacienteRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;

@Service
public class CitaMedicaService implements ICitaMedicaService{

	@Autowired
	ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	IDoctorRepository doctorRepository;
	
	@Autowired
	IPacienteRepository pacienteRepository;
	
	@Override
	public void agendarCitaMedica(String numeroTurn, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		
		Doctor doctor = this.doctorRepository.buscarsPorCedula(cedulaDoctor);
		Paciente paciente = this.pacienteRepository.buscarsPorCedula(cedulaPaciente);
		
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumeroCita(numeroTurn);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		
		this.citaMedicaRepository.insertar(citaMedica);
	}

	@Override
	public int actualizar(String numero, String diagnostico, String receta, LocalDateTime fecha_control) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.actualizar(numero, diagnostico, receta, fecha_control);
	}

	@Override
	public List<CitaMedicaSencillo> buscarCitasMedicas(LocalDateTime fecha, BigDecimal costo) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.buscarCitasMedicas(fecha, costo);
	}
	
	
	

}
