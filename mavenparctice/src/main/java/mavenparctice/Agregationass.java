package mavenparctice;

public class Agregationass {

   
    static class DeptEmployee {
        private String name;
        private int employeeId;

        public DeptEmployee(String name, int employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }

        public String getName() {
            return name;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void displayEmployeeDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + name);
        }
    }

    static class Department {
        private String departmentName;
        private DeptEmployee employee; 

        public Department(String departmentName, DeptEmployee employee) {
            this.departmentName = departmentName;
            this.employee = employee;
        }

        public void displayDepartmentDetails() {
            System.out.println("Department: " + departmentName);
            System.out.println("--- Staff Details ---");
            if (employee != null) {
                employee.displayEmployeeDetails();
            } else {
                System.out.println("No employee assigned.");
            }
        }
    }

    public static void main(String[] args) {
        DeptEmployee emp = new DeptEmployee("Jane Doe", 101);
        Department dept = new Department("Software Engineering", emp);
        
        dept.displayDepartmentDetails();
    }
}