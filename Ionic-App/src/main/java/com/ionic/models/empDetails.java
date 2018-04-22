package com.ionic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.ionic.models.empAccess;
import org.hibernate.annotations.Cascade;
import javax.persistence.CascadeType;

@Entity
@Table(name="emp_details")
public class empDetails {

	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "emp_mobileno")
	private int emp_mobileNo;

	@ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "access_id")
	private empAccess empAccess;
	
	@Column(name="emp_status")
	private String empStatus;
	
	
	

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public empAccess getEmpAccess() {
		return empAccess;
	}

	public empAccess getEmpAcess() {
		return empAccess;
	}

	public void setEmpAccess(empAccess empAccess) {
		this.empAccess = empAccess;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_mobileNo() {
		return emp_mobileNo;
	}

	public void setEmp_mobileNo(int emp_mobileNo) {
		this.emp_mobileNo = emp_mobileNo;
	}

	

	
	
	

	
}
