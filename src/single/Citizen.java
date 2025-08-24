package single;

public class Citizen {
	private String name;
	private String aadharNo;
	private String address;

	public Citizen() {
		// TODO Auto-generated constructor stub
		System.out.println("citizen");
	}
	public Citizen(String name, String aadharNo, String address) {
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
public String toString() {
	return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + "]";
}
}
