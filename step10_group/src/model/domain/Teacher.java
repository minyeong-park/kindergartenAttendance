package model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {

	 @Id
	   //@Column(name="empno")
	   private int teacherId;
	   
	  //@Column(name="ename", length=20, nullable=false)
	   private String teacherName;
	   
	  // @Column(name="Age", nullable=false)
	   private int age;
	   
	   private Class classId;	   //@ManyToOne(fetch = FetchType.LAZY) 
	  // @JoinColumn(name = "deptno") //Member table의 컬럼명 + 선언된 변수 타입의 pk와 연계되는 fk
	   //private Dept01 deptno;
	

		//@OneToMany(mappedBy="deptno")
		private List<Kid> kids;
		
		public int getKidsCount() {
			return kids.size();
		}
	
	
	
	
	
	
}
