/* WAP to implement the given inheritance in Java at Runtime Data */

import java.util.*;
class Person
{
	String name;
	int age;

	Scanner Scan = new Scanner(System.in);

	void accept1()
	{
		System.out.println("\n\n Enter Name and Age of a Person:");
		name = Scan.next();
		age = Scan.nextInt();
	}

	void display1()
	{
		System.out.println("\n\n Name = "+name);
		System.out.println("\n\n Age = "+age);
	}	
}  

class Teacher extends Person
{
	String college;
	String subject;

	void accept2()
	{
		System.out.println("\n\n Enter College Name and Subject of a Teacher:");
		college = Scan.next();
		subject = Scan.next();
	}

	void display2()
	{
		System.out.println("\n\n College = "+college);
		System.out.println("\n\n Subject = "+subject);
	}
}   

class Manager extends Person
{
	int id;
	int salary;

	void accept3()
	{
		System.out.println("\n\n Enter Id and Salary of a Manager:");
		id = Scan.nextInt();
		salary = Scan.nextInt();
	}

	void display3()
	{
		System.out.println("\n\n Id = "+id);
		System.out.println("\n\n Salary = "+salary);
	}
}        

class Heirarchical
{
	public static void main(String args[])
	{
		Teacher T = new Teacher();
		Manager M = new Manager();

		System.out.println("\n\n Accept Teacher Data");
		T.accept1();
		T.accept2();

		System.out.println("\n\n Display Teacher Data");
		T.display1();
		T.display2();

		System.out.println("\n\n Accept Manager Data");
		M.accept1();
		M.accept3();

		System.out.println("\n\n Display Manager Data");
		M.display1();
		M.display3();
	}
}         