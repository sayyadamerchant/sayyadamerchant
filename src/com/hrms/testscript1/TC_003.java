package com.hrms.testscript1;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib1.Genaral1;

public class TC_003 {
	@Test
	public void tc_003() {
//public static void main (String [] args) {
		DOMConfigurator.configure("log4j.xml");
			        //Test Steps
			        Genaral1 obj = new Genaral1();
			        obj.openApplication();
			        obj.login();
			        obj.logout();
			        obj.closeApplication();

	}
}

