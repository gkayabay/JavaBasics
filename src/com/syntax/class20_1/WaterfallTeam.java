package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterfallTeam extends Employee {
	
	public static void main(String[] args) {
		
		WaterfallTeam wteam = new WaterfallTeam ();
		WaterfallTeam.company = "Syntax"; //can access
		wteam.empNumber = 124; //protected variable is visible to the child class in different package but default is not visible
		//wteam.salary //CE: default is not visible
		
	}
}
	
