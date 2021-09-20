package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name", length = 50, nullable = false, unique = false)
	private String name;
	@Transient
	private Integer age;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
}