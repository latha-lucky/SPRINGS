package assignment;

public class Company {
	private int companyid;
	private String companyname;
	private String location;
	private Employee employee;
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", companyname=" + companyname + ", location=" + location
				+ ", employee=" + employee + "]";
	}
	
	

}
