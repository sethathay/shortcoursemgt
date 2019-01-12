package com.ckcc.shortcourse.models;

import javax.persistence.*;

@Entity
@Table(name = "tb_student")
public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int gender;
	private String pob, phone, email;
	
	public Student(){
		
	}
	
	public Student(int id, String name, int gender, String pob, String phone, String email) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.pob = pob;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Student [Id=" + id + ", name=" + name + ", gender=" + gender + ", pob=" + pob + ", phone=" + phone
				+ ", email=" + email + "]";
	}
}
