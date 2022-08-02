package com.uce.edu.demo.repository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaMedicaSencillo1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String numero;
	private LocalDateTime fechaCita;
	private BigDecimal costoCita;
	private LocalDateTime fechaControl;
	
	public CitaMedicaSencillo1() {
		

	}
	
	public CitaMedicaSencillo1(String numero, LocalDateTime fechaCita, BigDecimal costoCita,
			LocalDateTime fechaControl) {
		
		this.numero = numero;
		this.fechaCita = fechaCita;
		this.costoCita = costoCita;
		this.fechaControl = fechaControl;
	}
	@Override
	public String toString() {
		return "CitaMedicaSencillo [numero=" + numero + ", fechaCita=" + fechaCita + ", costoCita=" + costoCita
				+ ", fechaControl=" + fechaControl + "]";
	}
	//Set y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public BigDecimal getCostoCita() {
		return costoCita;
	}
	public void setCostoCita(BigDecimal costoCita) {
		this.costoCita = costoCita;
	}
	public LocalDateTime getFechaControl() {
		return fechaControl;
	}
	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}
	
	
	

}
