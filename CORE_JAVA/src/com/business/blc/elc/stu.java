package com.business.blc.elc;

public class stu {
   int id;
   int rollno;
   String name;
   public int getId() {
	return id;
   }
   public int getRollno() {
	return rollno;
   }
   public String getName() {
	return name;
   }
   
   
   public void setId(int sid) {
	id = sid;
   }
   public void setRollno(int srollno) {
	rollno = srollno;
   }
   public void setName(String sname) {
	name = sname;
   }
   public static stu displaydata(int id, int rollno,String name) {
	  stu student=new stu();
	  student.setId(id);
	  student.setRollno(rollno);
	  student.setName(name);
	  return student;
	  
   }
   
	
}
