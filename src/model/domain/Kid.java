package model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Kid {

	   @Id
	   //@Column(name="empno")
	   private int kidId;
	   
	  //@Column(name="ename", length=20, nullable=false)
	   private String kidName;
	   
	  // @Column(name="Age", nullable=false)
	   private int age;
	   
	   private char gender; 
	   
	   private Teacher teacherId;	   //@ManyToOne(fetch = FetchType.LAZY) 
	  // @JoinColumn(name = "deptno") //Member table의 컬럼명 + 선언된 변수 타입의 pk와 연계되는 fk
	   //private Dept01 deptno;
}
