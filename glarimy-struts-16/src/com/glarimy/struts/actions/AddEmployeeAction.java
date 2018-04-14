package com.glarimy.struts.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.glarimy.struts.directory.api.Directory;
import com.glarimy.struts.directory.api.DuplicateEmployeeException;
import com.glarimy.struts.directory.api.Employee;
import com.glarimy.struts.directory.api.InvalidEmployeeException;
import com.glarimy.struts.directory.service.SimpleDirectory;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddEmployeeAction extends ActionSupport {
	private Logger logger = LogManager.getLogger(AddEmployeeAction.class);
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String add() {
		logger.debug("adding " + employee.getName().getLastName());
		Directory directory = new SimpleDirectory();
		try {
			directory.add(employee);
			logger.debug("added " + employee.getName().getLastName());
			return Action.SUCCESS;
		} catch (DuplicateEmployeeException dee) {
			logger.debug("found duplicate " + employee.getName().getLastName());
			addActionError(getText("error.employee.exist"));
			return Action.INPUT;
		} catch (InvalidEmployeeException ive) {
			logger.debug("invalid " + employee.getName().getLastName());
			addActionError(getText("error.employee.invalid"));
			return Action.INPUT;
		}
	}
}
