package com.ems1.serviceImpl;

import com.ems1.dao.EmployeeDao;
import com.ems1.daoimpl.EmployeeDaoImpl;
import com.ems1.entity.Employee;
import com.ems1.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	public Employee createEmployee(Employee employee) 
	{
		
		return employeeDao.createEmployee(employee);
	}

}
