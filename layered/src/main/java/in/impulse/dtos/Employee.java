package in.impulse.dtos;
import java.time.LocalDate;
public class Employee {

	int EmpId;
	String Ename;
	String Email;
	 LocalDate CreateDate;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public LocalDate getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(LocalDate createDate) {
		CreateDate = createDate;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	String CreatedBy;
	

}
