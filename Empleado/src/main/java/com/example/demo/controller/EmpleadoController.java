package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.EmpleadoServices;
import com.example.demo.dto.Empleado;

@RestController
@RequestMapping("/api") // APUNTAMOS A LA DIRECCION POSTMAN A LA QUE BUSCARA DENTRO DE UN STRING
public class EmpleadoController {

	//CREAMOS UNA INSTANCIA DE LA CLASE SERVICE PARA HACER LLAMADO DE SUS MÉTODOS
	@Autowired
	EmpleadoServices empleadoSERVICE;
	
	@GetMapping("/empleados")
	public List<Empleado> totalEmpleados(){
		return empleadoSERVICE.totalEmpleados();
	}
	
	@GetMapping("/empleados/salario/{salario}")
	public List<Empleado> buscarEmpleado(@PathVariable(name="salario") int salario){ //SERIARIZAMOS EL PARÁMETRO PARA QUE LA API RECONOZCA EL VALOR CPN PATH
		return empleadoSERVICE.buscarEmpleado(salario);
	}
}
