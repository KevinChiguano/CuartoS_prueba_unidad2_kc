package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.correccion.repository.IPacienteRepository;
import com.uce.edu.demo.correccion.repository.modelo.Doctor;
import com.uce.edu.demo.correccion.repository.modelo.Paciente;
import com.uce.edu.demo.correccion.service.IDoctorService;
import com.uce.edu.demo.correccion.service.IGestroCitaMedicaService;

@SpringBootApplication
public class PruebaUnidad2KcApplication implements CommandLineRunner{
	
	private static final Logger LOGGER = Logger.getLogger(PruebaUnidad2KcApplication.class);

	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteRepository pacienteRepository;
	
	
	@Autowired
	private IGestroCitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2KcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Doctor doc1 = new Doctor();
		doc1.setNombre("Edison");
		doc1.setApellido("Cayambe");
		doc1.setCedula("1234");
		doc1.setFechaNacimiento(LocalDateTime.now());
		doc1.setNumeroConsultorio("A234");
		doc1.setCodigoSenescyt("123123123");
		doc1.setGenero("M");
		
		Doctor doc2 = new Doctor();
		doc2.setNombre("Kevin");
		doc2.setApellido("Correa");
		doc2.setCedula("1478");
		doc2.setFechaNacimiento(LocalDateTime.now());
		doc2.setNumeroConsultorio("A789");
		doc2.setCodigoSenescyt("456456456");
		doc2.setGenero("M");
		
		//this.doctorService.insertar(doc1);
		//this.doctorService.insertar(doc2);
		
		Paciente paci1 = new Paciente();
		paci1.setNombre("Hugo");
		paci1.setApellido("Teran");
		paci1.setCedula("3698");
		paci1.setFechaNacimiento(LocalDateTime.of(1990, 12, 2, 8, 56));
		paci1.setCodigoSeguro("237884");
		paci1.setEstatura(new Double("170"));
		paci1.setPeso(new Double("100"));
		paci1.setGenero("M");
		
		Paciente paci2 = new Paciente();
		paci2.setNombre("Daniela");
		paci2.setApellido("Teran");
		paci2.setCedula("4826");
		paci2.setFechaNacimiento(LocalDateTime.of(1020, 10, 5, 4, 56));
		paci2.setCodigoSeguro("59152348");
		paci2.setEstatura(new Double("165"));
		paci2.setPeso(new Double("80"));
		paci2.setGenero("F");
		
		//this.pacienteRepository.insertar(paci1);
		//this.pacienteRepository.insertar(paci2);
		
		
		//this.citaMedicaService.generarCita("12231", LocalDateTime.now(), new BigDecimal(40), "Inca", "3698", "1478");
		this.citaMedicaService.actualizarCita("12231", "Covid", "Pastillas", LocalDateTime.now());
		
		
	}

}
