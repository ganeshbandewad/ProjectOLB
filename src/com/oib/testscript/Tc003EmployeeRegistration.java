package com.oib.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.oib.lib.CommunFunctions;

public class Tc003EmployeeRegistration {
	@Test
	public void employeeRegister() throws Exception{
	    DOMConfigurator.configure("log4j.xml");

		CommunFunctions obj=new CommunFunctions();
		obj.openApplication();
		obj.login();
		obj.registerEmployee();
		obj.closeApplication();
	}}

