package com.glarimy.struts.directory.api;

public interface Directory {
	public void add(Employee employee) throws InvalidEmployeeException, DuplicateEmployeeException;
	public Employee find(String lastName) throws EmployeeNotFoundException;
}
