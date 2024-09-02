/* WAP to create a class Student having data members has name, rollno and marks of 3 
   subjects. The class should have the method getData() & putData() to accept & display
   students details extend class student by class sports. Define method getScore() to 
   accept the score of the sports extend class sports in another class result and define
   method calculate to find the total and average of the marks and display it. */

import java.util.*;
class Student
{
	String name   ;
	int    rollno ;
	float  m1 , m2 , m3;

	Scanner scan = new Scanner(System.in);

	void getData()
	{
		System.out.print("\n\n Enter Name , Rollno and Marks of 3 Subjects: ");
		name = scan.next();
		rollno = scan.nextInt();
		m1 = scan.nextFloat();
		m2 = scan.nextFloat();
		m3 = scan.nextFloat();
	}

	void putData()
	{
		System.out.println("\n\n Name  ="+ name  );
		System.out.println("\n\n RollNo="+ rollno);
		System.out.println("\n\n M1 ="+ m1 );
		System.out.println("\n\n M2 ="+ m2 );
		System.out.println("\n\n M3 ="+ m3 );
	}
}

class Sports extends Student
{
	float score ;
	
	void getScore()
	{
		System.out.print("\n\n Enter Your Sports Marks: ");
		score = scan.nextFloat();
	}

	void putScore()
	{
		System.out.println("\n\n Your Sports Marks: " + score );
	}
}

class Result extends Sports
{
	float total , avg ;

	void calculate()
	{
		total = m1 + m2 + m3 + score ;
		System.out.println("\n\n Total = " + total );

		avg = (m1+m2+m3)/3.0F ;
		System.out.println("\n\n Average = " + avg );
	}
}

class StudentSport
{
	public static void main( String args[] )
	{
		Result R = new Result();

		// Get Data
		System.out.println("\n\n Enter the following Students Details");
		R.getData();
		R.getScore();

		// display
		System.out.println("\n\n Displaying Students Details");
		R.putData();
		R.putScore();

		// Result
		System.out.println("\n\n Result ");
		R.calculate();
	}
}