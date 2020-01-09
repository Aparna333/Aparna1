public class Student {
	
	int studentId;
	String studentName;
	String studentDept;
	String studentCollege;
	String studentHousing;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String dept, String college, String housing) {
		
		this.studentId = id;
		this.studentName = name;
		this.studentDept = dept;
		this.studentCollege = college;
		this.studentHousing = housing;
	}
	public void showDetails() {
		System.out.println("Displaying student details");
	}
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", studentCollege=" + studentCollege + ", studentHousing=" + studentHousing + "]";
	}
}
public class DayScholar extends Student{
	
	public DayScholar() {
		
	}
	public DayScholar(int id,String name,String dept,String college, String housing) {
		super(id,name,dept,college,housing);
	}
	
	
	
}
public class Residential extends Student{
	
public Residential() {
	
		
	}

	public Residential(int id,String name,String dept,String college,String housing) {
		super(id,name,dept,college,housing);
	}

}
public class TestStudent {

	public static void main(String[] args) {
		DayScholar ds = new DayScholar(101,"Romu","CS","MIET","Day Scholar");
		Residential r = new Residential(102,"Ajay","IT","MIET","Hostel Residential");
		
		ds.showDetails();
		System.out.println(ds.toString());
		
		r.showDetails();
		System.out.println(r.toString());
		

	}

}