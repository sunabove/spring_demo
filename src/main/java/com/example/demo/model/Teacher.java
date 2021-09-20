package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table( name = "teacher")
public class Teacher extends Person {
	@Column(name="school_name", length=50, nullable=false, unique=true)
	private String schoolName ;
}