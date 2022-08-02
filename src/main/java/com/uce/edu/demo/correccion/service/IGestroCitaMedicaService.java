package com.uce.edu.demo.correccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.correccion.repository.modelo.PacienteSencillo;

public interface IGestroCitaMedicaService {

	public void generarCita(String numero, LocalDateTime fechaCita, BigDecimal valor, String lugar, String cedulaPaciente, String cedulaDoctor);
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita);
	public List<PacienteSencillo> buscarFechaGenero(LocalDateTime fechaNacimiento, String genero);
}
