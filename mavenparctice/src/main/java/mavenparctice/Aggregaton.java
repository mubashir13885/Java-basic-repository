package mavenparctice;

 class Adress {
	int strnum;
	String city;
	int pstcd;
	
	Adress(int strnum,String city,int pstcd){
		this.strnum = strnum;
		this.city = city;
		this.pstcd = pstcd;
		
		
	}
	
	
}
 
 class Employee{
   String Emp_name;
   int Emp_id;
   Adress adress;
   
   Employee(String Emp_name,int Emp_id,Adress adress){
	  this.Emp_name = Emp_name;
	  this.Emp_id = Emp_id;
	  this.adress=adress;
   }
   
   void Display() {
	   System.out.println(this.Emp_name);
	   System.out.println(this.Emp_id);
	   System.out.println(this.adress.strnum);
	   System.out.println(this.adress.city);
	   System.out.println(this.adress.pstcd);
   }
 }

public class Aggregaton {
	

	public static void main(String[] args) {
		Adress Adr = new Adress(1,"Banaglore",679331);
		Employee emp = new Employee("Shree",24,Adr);
		
		emp.Display();
		
	
		
	}

}
