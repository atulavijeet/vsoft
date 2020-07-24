package com.companyname.dao;

import com.companyname.model.EmployeeModel;

public class EmployeeDaoImpl implements EmployeeDao{
	
	EmployeeModel empModel= new EmployeeModel();
	
	@Override
	public void addEmployee() {
		empModel.setEmployeeId(1020);
		empModel.setEmployeeName("James");
		empModel.setSalary(6000000.00);
		empModel.setEmailId("james@gmail.com");
		///
		
		
		
		
		
		
	}

	@Override
	public String showEmployee() {
		return empModel.getEmployeeId()+"\t"+ empModel.getEmployeeName() +"\t" +empModel.getSalary()+"\t"+empModel.getEmailId();
		
	}

	@Override
	public void editEmployee() {
		
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}
