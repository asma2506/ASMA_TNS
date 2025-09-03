package utilities;

import employee.Employee;

public class Employeeutilities {
	
	
	    public void increaseSalary(Employee employee, double amount) {
	        double newSalary = employee.getSalary() + amount;
	        // Using protected setter
	        employee.displayDetails();
	        System.out.println("Salary increased by " + amount);
	        System.out.println("New Salary: " + newSalary);
	    }

	    /**
	     * Displays basic information about an employee.
	     */
	    public void printEmployeeInfo(Employee employee) {
	        employee.displayDetails();
	    }
	}


