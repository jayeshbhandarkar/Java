/* WAP to create an interface student having abstract method getdata() which should 
   accept details of students such as rollno, name and marks of 3 subjects. Define another
   interface sports. Declare method getsports() to accept marks of sports. Implement 
   class result from student and sports. Define a method cal() in result to calculate the 
   total and average of marks and display it. */

import java.util.Scanner ;

interface Student
{
	void getData();
	void putData();
}

interface Sports
{
	void getSports();
	void putSports();
}

class Result implements Student , Sports
{
	String name  ;
	int    rollno ;
	float  m1 , m2 , m3 ;

	float score ;
	float total , avg ;

	Scanner scan = new Scanner( System.in );

	public void getData()
	{
		System.out.print("\n\n Enter Name: ");
		name = scan.next();

		System.out.print("\n\n Enter RollNo: ");
		rollno = scan.nextInt();

		System.out.print("\n\n Enter Marks of 3 Subjects: ");
		m1 = scan.nextFloat();
		m2 = scan.nextFloat();
		m3 = scan.nextFloat();
	}

	public void putData()
	{
		System.out.println("\n\n Name   = " + name );
		System.out.println("\n\n RollNO = " + rollno );
		System.out.println("\n\n Marks of 3 Subjects");
		System.out.println("\n\n M1=" + m1 );
		System.out.println("\n\n M2=" + m2 );
		System.out.println("\n\n M3=" + m3 );
	}

	public void getSports()
	{
		System.out.print("\n\n Enter your Sports Marks: ");
		score = scan.nextFloat();
	}
	
	public void putSports()
	{
		System.out.println("\n\n Sports Marks: " + score );
	}

	void calculate()
	{
		total = m1+m2+m3;
		avg   = total/3 ;

		System.out.println("\n\n Total=" + total + " Average=" + avg);
	}
}

class StudentDemo1
{
	public static void main( String args[] )
	{
		Result R = new Result();

		System.out.println("\n\n Accept Students Details");
		R.getData();
		R.getSports();

		System.out.println("\n\n Display Students Details");
		R.putData();
		R.putSports();

		System.out.println("\n\n Result");
		R.calculate();
	}
}