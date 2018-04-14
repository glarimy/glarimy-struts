package com.glarimy.struts.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.glarimy.struts.directory.api.Directory;
import com.glarimy.struts.directory.api.Employee;
import com.glarimy.struts.directory.api.EmployeeNotFoundException;
import com.glarimy.struts.directory.service.SimpleDirectory;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class FindEmployeeAction {
	Logger logger = LogManager.getLogger(FindEmployeeAction.class);
	private String lastName;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String find() {
		logger.debug("finding employee " + lastName);
		Directory directory = new SimpleDirectory();
		try {
			employee = directory.find(lastName);
			logger.debug(
					"found employee " + employee.getName().getFirstName() + " " + employee.getName().getLastName());
			return Action.SUCCESS;
		} catch (EmployeeNotFoundException e) {
			logger.debug("employee " + lastName + " not found");
			return Action.SUCCESS;
		}
	}
}
