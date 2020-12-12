package model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Class {
	@Id
	@Column(name="classId")
	private int classId;
	
	@Column(name="className", length = 20)
	private String calssName;
	
	@Column(name="classAge")
	private int classAge;
	
	//@OneToMany(mappedBy="deptno")
	private List<Teacher> teachers;
	
	public int getTeacherCount() {
		return teachers.size();
	}
	
	
	
}
