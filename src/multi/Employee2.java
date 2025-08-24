package multi;
import java.util.Date;
public class Employee2 extends Employee {
	 private int noOfShares;
	    private String authority;
	    
	    public Employee2 () {}
	    
	    public Employee2 (String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary, int noOfShares, String authority) {
	    	super();
	        this.noOfShares = noOfShares;
	        this.authority=authority;
	    }

		public int getNoOfShares() {
			return noOfShares;
		}

		public void setNoOfShares(int noOfShares) {
			this.noOfShares = noOfShares;
		}

		public String getAuthority() {
			return authority;
		}

		public void setAuthority(String authority) {
			this.authority = authority;
		}

		@Override
		public String toString() {
			return "Employee2 ["+super.toString()+"noOfShares=" + noOfShares + ", authority=" + authority + "]";
		}   

}
