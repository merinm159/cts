package sampleCC2;

import java.util.List;

public class School extends Thread{
	private String studentCategory;
	private int count;
	private List<Student>studentList;
	public School(String studentCategory, List<Student> studentList) {
		super();
		this.studentCategory = studentCategory;
		this.studentList = studentList;
	}
	public String getStudentCategory() {
		return studentCategory;
	}
	public void setStudentCategory(String studentCategory) {
		this.studentCategory = studentCategory;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void run() {
		int c=0;
		for(Student s:studentList) {
			if(s.getStudentCategory().equals(this.studentCategory))
				c+=1;
		}
		this.count=c;
		System.out.println(this.studentCategory+":"+this.count);
	}
}
