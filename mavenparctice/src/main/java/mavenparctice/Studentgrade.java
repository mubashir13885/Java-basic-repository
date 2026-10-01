package mavenparctice;

public class Studentgrade {
	private String name;
    private int rollNo;
    private final int MAX_MARKS = 500;

    public Studentgrade(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public double calculatePercentage(double obtainedMarks) {
        return (obtainedMarks / MAX_MARKS) * 100.0;
    }

    public void displayStudentReport(double obtainedMarks) {
        System.out.println("--- Student Academic Report ---");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Marks Scored: " + obtainedMarks + " / " + MAX_MARKS);
        System.out.println("Percentage  : " + calculatePercentage(obtainedMarks) + "%");
    }

	public static void main(String[] args) {
Studentgrade student = new Studentgrade("Alex Mercer", 101);
        
        double marksScored = 435.5;
        student.displayStudentReport(marksScored);
	}
	
}
