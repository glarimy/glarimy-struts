package com.glarimy.struts.directory.service;

import com.glarimy.struts.directory.api.Directory;
import com.glarimy.struts.directory.api.DuplicateEmployeeException;
import com.glarimy.struts.directory.api.Employee;
import com.glarimy.struts.directory.api.EmployeeNotFoundException;
import com.glarimy.struts.directory.api.InvalidEmployeeException;
import com.glarimy.struts.directory.db.EmployeeDAO;

public class SimpleDirectory implements Directory {
	private EmployeeDAO dao = new EmployeeDAO();

	@Override
	public void add(Employee employee) throws InvalidEmployeeException, DuplicateEmployeeException {
		if (employee == null || employee.getName() == null || employee.getName().getLastName() == null
				|| employee.getName().getLastName().trim().length() == 0 || employee.getPhoneNumber() < 0)
			throw new InvalidEmployeeException();
		if (dao.read(employee.getName().getLastName()) != null)
			throw new DuplicateEmployeeException();
		dao.create(employee);
	}

	@Override
	public Employee find(String lastName) throws EmployeeNotFoundException {
		Employee employee = dao.read(lastName);
		if (employee == null)
			throw new EmployeeNotFoundException();
		return employee;
	}

}
