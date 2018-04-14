package com.glarimy.struts.directory.db;

import java.util.HashMap;
import java.util.Map;

import com.glarimy.struts.directory.api.Employee;
import com.glarimy.struts.directory.api.Name;

public class EmployeeDAO {
	private static Map<String, Employee> staff = new HashMap<>();

	public EmployeeDAO() {
		staff.put("koyya", new Employee(new Name("Krishna Mohan", "Koyya"), 9731423166L));
	}

	public void create(Employee employee) {
		staff.put(employee.getName().getLastName(), employee);
	}

	public Employee read(String lastName) {
		return staff.get(lastName);
	}
}
