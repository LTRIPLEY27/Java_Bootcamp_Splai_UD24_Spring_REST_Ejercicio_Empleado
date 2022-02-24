package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Empleado;
public interface IEmpleadoService {
	
	public List<Empleado> totalEmpleados();//REGISTRO TOTAL DE EMPLEADOS
	public List<Empleado> buscarEmpleado(int salario);//buscará por sueldo
}
