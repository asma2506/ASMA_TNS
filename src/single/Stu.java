package single;

public class Stu extends Citizen {
	private int rollNo;
	private String collegeName;

public Stu() {
	super();
}

public Stu(String name, String aadharNo, String address, int rollNo, String collegeName) {
	super(name, aadharNo, address); //accessing parent class constructor
	this.rollNo = rollNo;
	this.collegeName = collegeName;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

public String toString() {
	return "Stu [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
			+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() +  "]";
}
}