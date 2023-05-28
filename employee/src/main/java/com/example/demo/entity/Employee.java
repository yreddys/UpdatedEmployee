package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String email;
private String department;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Employee(Long id, String name, String email, String department) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.department = department;
}

public Employee (){}
@Override
public String toString() {
	return "Expenditure [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
}

	
}
