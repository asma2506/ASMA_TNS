package assignment;

import employee.Developer;
import employee.Manager;
import utilities.Employeeutilities;

public class main {
	
	    public static void main(String[] args) {
	        
	        Manager manager = new Manager("Alice", 101, 75000, "Sales");
	        Developer developer = new Developer("Bob", 102, 60000, "Java");

	       
	        Employeeutilities util = new Employeeutilities();

	        System.out.println("-------- Manager Details----------");
	        util.printEmployeeInfo(manager);

	        System.out.println("\n----- Developer Details ----");
	        util.printEmployeeInfo(developer);

	        System.out.println("\n------- Salary Update -----");
	        util.increaseSalary(developer, 5000);
	    }
	}


