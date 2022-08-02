package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.CitaMedicaSencillo1;
import com.uce.edu.demo.repository.ICitaMedicaRepository1;
import com.uce.edu.demo.repository.IDoctorRepository1;
import com.uce.edu.demo.repository.IPacienteRepository1;
import com.uce.edu.demo.repository.modelo.CitaMedica1;
import com.uce.edu.demo.repository.modelo.Doctor1;
import com.uce.edu.demo.repository.modelo.Paciente1;

@Service
public class CitaMedicaService1 implements ICitaMedicaService1{

	@Autowired
	ICitaMedicaRepository1 citaMedicaRepository;
	
	@Autowired
	IDoctorRepository1 doctorRepository;
	
	@Autowired
	IPacienteRepository1 pacienteRepository;
	
	@Override
	public void agendarCitaMedica(String numeroTurn, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		
		Doctor1 doctor = this.doctorRepository.buscarsPorCedula(cedulaDoctor);
		Paciente1 paciente = this.pacienteRepository.buscarsPorCedula(cedulaPaciente);
		
		CitaMedica1 citaMedica = new CitaMedica1();
		citaMedica.setNumeroCita(numeroTurn);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		System.out.println(citaMedica);
		this.citaMedicaRepository.insertar(citaMedica);
	}

	@Override
	public int actualizar(String numero, String diagnostico, String receta, LocalDateTime fecha_control) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.actualizar(numero, diagnostico, receta, fecha_control);
	}

	@Override
	public List<CitaMedicaSencillo1> buscarCitasMedicas(LocalDateTime fecha, BigDecimal costo) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.buscarCitasMedicas(fecha, costo);
	}
	
	
	

}
