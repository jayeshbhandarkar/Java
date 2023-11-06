/* WAP to create a Class Student having data members as name, rollno and marks of 3 
   Subjects. The class should have a method getData() to accept the Students Details. 
   Extend class Student in another class Result. Define a method calculate() to 
   calculate total and average of the marks, and display them. */

import java.util.* ;

class Student
{
	String name   ;
	int    rollno ;
	float  m1 , m2 , m3 ;

	Scanner scan = new Scanner( System.in );

	void getData()
	{
		System.out.print("\n\n Enter Name: ");
		name = scan.next();

		System.out.print("\n\n Enter Rollno: ");
		rollno = scan.nextInt();

		System.out.print("\n\n Enter Marks of 3 Subjects: ");
		m1 = scan.nextFloat();
		m2 = scan.nextFloat();
		m3 = scan.nextFloat();
	}

	void putData()
	{
		System.out.print("\n\n Name   : " + name );
		System.out.print("\n\n Rollno : " + rollno );
		System.out.print("\n\n M1 : " + m1 );
		System.out.print("\n\n M2 : " + m2 );
		System.out.print("\n\n M3 : " + m3 );
	}
}

class Result extends Student
{
	float total , avg ;

	void calculate()
	{
		total = m1 + m2 + m3 ;
		avg = total/3.0F ;

		System.out.print("\n\n Total= " + total + " AVerage=" + avg );
	}
}

class StudentInform
{
	public static void main( String args[] )
	{
		Result R = new Result();
		
		R.getData();
		R.putData();

		R.calculate();
	}
}

