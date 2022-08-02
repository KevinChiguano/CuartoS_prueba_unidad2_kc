package com.uce.edu.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.CitaMedica1;

public interface ICitaMedicaRepository1 {
	
	public void insertar(CitaMedica1 citaMedica);
	
	public int actualizar(String numero, String diagnostico, String receta, LocalDateTime fecha_control);
	
	public List<CitaMedicaSencillo1> buscarCitasMedicas(LocalDateTime fecha, BigDecimal costo);

}
