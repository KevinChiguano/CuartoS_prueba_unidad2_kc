package com.uce.edu.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	
	public void insertar(CitaMedica citaMedica);
	
	public int actualizar(String numero, String diagnostico, String receta, LocalDateTime fecha_control);
	
	public List<CitaMedicaSencillo> buscarCitasMedicas(LocalDateTime fecha, BigDecimal costo);

}
