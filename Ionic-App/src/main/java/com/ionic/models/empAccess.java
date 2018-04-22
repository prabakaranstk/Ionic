package com.ionic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="emp_access")
public class empAccess {

   @Id
    @Column(name="access_id")
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long accessId;
   
	private boolean admin;
	private boolean histry;
	private boolean camera;
	
	
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public boolean isHistry() {
		return histry;
	}
	public void setHistry(boolean histry) {
		this.histry = histry;
	}
	public boolean isCamera() {
		return camera;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	
	

	
}
