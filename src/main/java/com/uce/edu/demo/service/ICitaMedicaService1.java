package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.CitaMedicaSencillo1;

public interface ICitaMedicaService1 {

	public void agendarCitaMedica(String numeroTurn, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita, String cedulaDoctor, String cedulaPaciente);
	
	public int actualizar(String numero, String diagnostico, String receta, LocalDateTime fecha_control);
	
	public List<CitaMedicaSencillo1> buscarCitasMedicas(LocalDateTime fecha, BigDecimal costo);
}
