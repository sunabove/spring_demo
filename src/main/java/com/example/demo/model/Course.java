package com.example.demo.model;

import java.util.Set;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
class Course {
	@Id
	private Long id;
	
	@ManyToMany
	@JoinTable(name = "course_student") 
	private Set<Student> students;
	
	public Course() {
	}
}