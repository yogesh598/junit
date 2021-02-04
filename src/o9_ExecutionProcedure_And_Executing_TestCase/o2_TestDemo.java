package o9_ExecutionProcedure_And_Executing_TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class o2_TestDemo {

	o1_Student s1,s2,s3,s4;
	
	@Before
	public void setUp() {
		System.out.println("----------------------------------------------------");
		System.out.println("In Before method");
		s1 = new o1_Student("Yogesh",337,35);
		s2 = new o1_Student("Kumar",335,50);
		s3 = new o1_Student("Naresh",322,60);
		s4 = new o1_Student("Narendra",341,70);
	}
	@Test
	public void testPass() {
		System.out.println("	In Pass Test method");
		s1.calculateGrade();
		assertEquals("Pass Class",s1.Grade);
		s1.display();
	}
	@Test
	public void testSecond() {
		System.out.println("	In SecondClass Test method");
		s2.calculateGrade();
		assertEquals("Second Class",s2.Grade);
		s2.display();
	}
	@Test
	public void testFirst() {
		System.out.println("	In FirstClass Test method");
		s3.calculateGrade();
		assertEquals("First Class",s3.Grade);
		s3.display();
	}
	@Test
	public void testDistionction() {
		System.out.println("	In DistionctionClass Test method");
		s4.calculateGrade();
		assertEquals("Distinction",s4.Grade);
		s4.display();
	}
	
}
