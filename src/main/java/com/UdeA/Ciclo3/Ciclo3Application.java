package com.UdeA.Ciclo3;

import com.UdeA.Ciclo3.modelos.Empleado;
import com.UdeA.Ciclo3.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class Ciclo3Application {
	@GetMapping("/hello")
	public String hello(){
		return "Hola ciclo 3";
	}

	@GetMapping("/testempr")
	public String testempr(){
		Empresa emp = new Empresa("Meter SAS","calle 6", "3232323","12345");
		return emp.getDireccion();
	}

	@GetMapping("/testempl")
	public String testempl(){
		Empleado empl = new Empleado("Jose","correo.correo@algo", "MeterSas","Soporte Técnico");
		return empl.getRolEmpleado();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);

	}

}
