/* WAP to create a class student having data members as name, roll no and percentage. 
   Accept information of 5 Students and display it */

import java.util.*;
class Student
{
	String name;
	int rollno;
	float percentage;

	Scanner Scan = new Scanner(System.in);

	void accept()
	{
		System.out.print("\n\n Enter Name: ");
		name = Scan.next();

		System.out.print("\n\n Enter RollNo: ");
		rollno = Scan.nextInt();

		System.out.print("\n\n Enter Percentage: ");
		percentage = Scan.nextFloat();
	}

	void display()
	{
		System.out.print("\n\n Name = "+name);
		System.out.print("\n\n RollNo = "+rollno);
		System.out.print("\n\n Percentage = "+percentage);
	}
}

class StudentInfo
{
	public static void main(String args[])
	{
		Student S[] = new Student[5];

		for(int i=0; i<5; i++)
		{
			S[i] = new Student();
		}

		System.out.print("\n\n Enter Information of 5 Students");

		for(int i=0; i<5; i++)
		{
			System.out.print("\n\n Student: "+(i+1));
			S[i].accept();
		}

		System.out.print("\n\n Displaying Information of 5 Students");
		
		for(int i=0; i<5; i++)
		{
			System.out.print("\n\n Student: "+(i+1));
			S[i].display();
		}
	}
}