package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.CitaMedicaSencillo;
import com.uce.edu.demo.repository.IDoctorRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.service.ICitaMedicaService;
import com.uce.edu.demo.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2KcApplication implements CommandLineRunner{
	
	private static final Logger LOGGER = Logger.getLogger(PruebaUnidad2KcApplication.class);
	
	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2KcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Doctor doctor = new Doctor();
		doctor.setCedula("123456789");
		doctor.setNombre("Saul");
		doctor.setApellido("Arguello");
		doctor.setFechaNacimiento(LocalDateTime.of(2000, 11,11, 0, 0));
		doctor.setNumeroConsultorio("123");
		doctor.setTitulo("Cirujano");
		doctor.setSalario(new BigDecimal(100));
		
		Doctor doctor2 = new Doctor();
		doctor2.setCedula("789456123");
		doctor2.setNombre("Paul");
		doctor2.setApellido("Mendoza");
		doctor2.setFechaNacimiento(LocalDateTime.of(1998, 10,10, 0, 0));
		doctor2.setNumeroConsultorio("123");
		doctor2.setTitulo("Pediatra");
		doctor2.setSalario(new BigDecimal(200));
		
		//this.doctorRepository.insertar(doctor);
		//this.doctorRepository.insertar(doctor2);
		
		Paciente paciente = new Paciente();
		paciente.setCedula("147258369");
		paciente.setNombre("Diego");
		paciente.setApellido("Caiza");
		paciente.setFechaNacimiento(LocalDateTime.of(2001, 1, 1, 1, 0));
		paciente.setCodigoIess("12378945612");
		paciente.setEstatura(new BigDecimal(72.8));
		paciente.setPeso(new BigDecimal(90.7));
		paciente.setGenero("M");
		
		Paciente paciente2 = new Paciente();
		paciente2.setCedula("1593572846");
		paciente2.setNombre("Carmen");
		paciente2.setApellido("Chiguano");
		paciente2.setFechaNacimiento(LocalDateTime.of(2009, 2, 2, 2, 0));
		paciente2.setCodigoIess("12378945612");
		paciente2.setEstatura(new BigDecimal(65.5));
		paciente2.setPeso(new BigDecimal(70.7));
		paciente2.setGenero("F");
		
		//this.pacienteService.insertar(paciente);
		//this.pacienteService.insertar(paciente2);
		
		//this.citaMedicaService.actualizar("4", "Tos", "pastillas", LocalDateTime.now());
		//this.citaMedicaService.actualizar("4", "Fiebre", "Jarabe", LocalDateTime.now());
		
		List<CitaMedicaSencillo> citaMedicas= this.citaMedicaService.buscarCitasMedicas(LocalDateTime.now(), new BigDecimal(50));
		for(CitaMedicaSencillo item: citaMedicas) {
			LOGGER.info(item);
		}
	}

}
