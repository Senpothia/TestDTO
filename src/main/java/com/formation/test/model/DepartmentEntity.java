package com.formation.test.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DepartmentEntity {
	
	 private int departmentId;
	    private String departName;

	    @Id
	    @Column(name = "DepartmentId")
	    public int getDepartmentId() {
	        return departmentId;
	    }

	    public void setDepartmentId(int departmentId) {
	        this.departmentId = departmentId;
	    }

	    @Basic
	    @Column(name = "DepartName")
	    public String getDepartName() {
	        return departName;
	    }

	    public void setDepartName(String departName) {
	        this.departName = departName;
	    }
	

}
