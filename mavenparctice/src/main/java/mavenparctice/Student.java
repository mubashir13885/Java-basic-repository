package mavenparctice;

public class Student {
String name;
int semester;
private int id;
	
	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

Student(String name,int semester){
	this.name = name;
	this.semester = semester;
	
	
}

void Display() {
	
	System.out.println(this.name);
	System.out.println(this.semester);
	System.out.println(this.getId());
	
}

	public static void main(String[] args) {

		Student std = new Student("Sham",5);
		std.setId(24);
		std.Display();
	
		
		
	}

}
