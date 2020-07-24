package com.companyname.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import com.companyname.model.EmployeeModel;
import com.companyname.service.EmployeeServiceImpl;


@RestController
public class EmployeeController {
	
	EmployeeServiceImpl empServiceImpl=new EmployeeServiceImpl();

	@RequestMapping(value="/add-employee",method=RequestMethod.GET)
	public String add()
	{
		empServiceImpl.addEmployee();
		return "Added";
		
	}
	
	@RequestMapping(value="/show-employee",method=RequestMethod.GET)
	public String show()
	{
		return empServiceImpl.showEmployee();
	}
}
