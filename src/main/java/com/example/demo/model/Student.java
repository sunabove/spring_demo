package com.example.demo.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "STUDENT_NAME", length = 50, nullable = false, unique = false)
	private String name;
	@Transient
	private Integer age;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@ManyToMany(mappedBy = "students", targetEntity=Course.class)
	private Set<Student> courses;
}
