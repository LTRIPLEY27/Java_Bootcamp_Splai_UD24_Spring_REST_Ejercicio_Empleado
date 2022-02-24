package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServices implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO empleadoDAO;//LLAMAMOS A UNA INSTANCIA DE LA INTERFAZ DAO PARA HACER USO DE LOS MÉTODOS
	
	@Override
	public List<Empleado> totalEmpleados() {
		
		return empleadoDAO.findAll();
	}

	@Override
	public List<Empleado> buscarEmpleado(int salario) {
		return empleadoDAO.findBySalario(salario);
	}
	
	
}
