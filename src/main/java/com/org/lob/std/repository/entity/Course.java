package com.org.lob.std.repository.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name = "COURSE")
public class Course extends Auditable {
	@Id
	@Column(name = "COURSE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long course_Id;
	@Column(name = "COURSEDETAILS")
	private String courseDetails;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_COURSE", joinColumns = @JoinColumn(name = "STUDENTID", referencedColumnName = "COURSE_ID"), inverseJoinColumns = @JoinColumn(name = "COURSE_ID", referencedColumnName = "STUDENTID"))
	private List<Student> students;

	public Long getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(Long course_Id) {
		this.course_Id = course_Id;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}
}