package com.makemytrip.stepdefinition;

import java.io.IOException;

import com.makemytrip.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("Scenario: " + name);
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {
		Status status = scenario.getStatus();
		System.out.println("      Status: " + status+"\n\n");

		if (scenario.isFailed()) {
			takeScreenShot(scenario.getName());
		}
	}
	
}
