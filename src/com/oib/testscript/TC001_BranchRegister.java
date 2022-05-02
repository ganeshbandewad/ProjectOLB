package com.oib.testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.oib.lib.CommunFunctions;

public class TC001_BranchRegister   {
	@Test
	public void branchRegister() throws Exception{
	    DOMConfigurator.configure("log4j.xml");

		CommunFunctions obj=new CommunFunctions();
		obj.openApplication();
		obj.login();
		obj.branchRegister();
		obj.closeApplication();
	
	
}
}
