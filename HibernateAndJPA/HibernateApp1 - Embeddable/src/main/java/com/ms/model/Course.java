package com.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
@Entity
@Table(name="course3")
public class Course {

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	//@GeneratedValue(strategy=GenerationType.TABLE,generator = "x") //IDENTITY,(hibernate_sequence)SEQUENCE// TABLE
	//@TableGenerator(name="x", table="courseid_generator2")

	Integer id;
	@Column
	String name;
	@Column
	Integer duration;
	
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
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
}
