package com.student.manage;

public class Student {
	
	private int Studentid;
	private String studentName;
	private String studentPhone;
	public int getStudentid() {
		return Studentid;
	}


	public void setStudentid(int studentid) {
		Studentid = studentid;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentPhone() {
		return studentPhone;
	}


	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}


	public String getStudentCity() {
		return studentCity;
	}


	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}


	private String studentCity;
	
	
	public Student(int studentid, String studentName, String studentPhone, String studentCity) {
		super();
		Studentid = studentid;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}


	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
	
	
	
	

}
