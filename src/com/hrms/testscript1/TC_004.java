package com.hrms.testscript1;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib1.Genaral1;

@Test
public class TC_004 {

			//public static void main(String[] args) {
		public void tc_004()
		{
			DOMConfigurator.configure("log4j.xml");
			        //Test Steps
			Genaral1 obj = new Genaral1();
			obj.openApplication();
			obj.login();
			obj.enterFrame();
			obj.addNewEmp();
			obj.exitFrame();
			obj.logout();
			obj.closeApplication();

	}
}



