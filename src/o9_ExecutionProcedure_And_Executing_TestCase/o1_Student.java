//		Scenario
//		<35				Fail
//		>=35 and <50	Pass Class
//		>=50 and <60 	Second Class
//		>=60 and <70	First Class
//		>70				Distinction
package o9_ExecutionProcedure_And_Executing_TestCase;

public class o1_Student {

	private String Name;
	private int RollNumber;
	
	private double Percentage;
	String Grade;
	
	public o1_Student(String n,int rn,double p) {
		this.Name = n;
		this.RollNumber = rn;
		this.Percentage = p;
	}
	public String calculateGrade() {
		if(Percentage < 35) {
			Grade = "Fail";
		}
		else if(Percentage<50) {
			Grade = "Pass Class";
		}
		else if(Percentage<60) {
			Grade = "Second Class";
		}
		else if(Percentage<70) {
			Grade = "First Class";
		}
		else{
			Grade = "Distinction";
		}
		return Grade;
	}
	public void display() {
		System.out.println("Name        : "+Name);
		System.out.println("RollNumber  : "+RollNumber);
		System.out.println("Percentage  : "+Percentage);
		System.out.println("Grade 		: "+Grade);
	}
}
