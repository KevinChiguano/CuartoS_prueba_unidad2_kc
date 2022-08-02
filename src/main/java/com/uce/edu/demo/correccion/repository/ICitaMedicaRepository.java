package com.uce.edu.demo.correccion.repository;

import com.uce.edu.demo.correccion.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	
	public void insertar(CitaMedica citaMedica);
	
	public void actualizar(CitaMedica citaMedica);

	public CitaMedica buscarPorNumero(String numero);
}
