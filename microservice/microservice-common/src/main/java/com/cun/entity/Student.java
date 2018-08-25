package com.cun.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_student")
public class Student implements Serializable { // 要序列化，否则分离后，作为数据的传输封装单位，传递不了数据
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id; // 编号

	@Column(length = 50)
	private String name; // 姓名

	@Column(length = 50)
	private String grade; // 年级

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
