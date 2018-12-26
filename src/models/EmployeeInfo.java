package models;

public class EmployeeInfo {

	public int empid;
	public String empname;
	public int empsalary;
	public int empcontact;
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public int getEmpcontact() {
		return empcontact;
	}
	public void setEmpcontact(int empcontact) {
		this.empcontact = empcontact;
	}
	@Override
	public String toString() {
//		Integer.valueOf(i).toString()
		return "empid = "+getEmpid()+" empname = "+getEmpname()+" empsalary = "+Integer.valueOf(getEmpsalary())+ "empcontact =" +Integer.valueOf(empcontact);
    }
   }
