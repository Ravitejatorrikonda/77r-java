package operators;

public class Student {
	
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
		id=sid;
	}
	public void setRollno(int sno) {
		rollno=sno;
	}
	public void setName(String sname) {
		name=sname;
	}
	
	
	public static Student getStudentDetails(int id, int rollno, String name) {
		
		Student st=new Student();
		st.setId(id);
		st.setRollno(rollno);
		st.setName(name);
		
		
		return st;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
