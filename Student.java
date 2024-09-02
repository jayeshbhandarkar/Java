/* WAP to create a class student having methods getMarks( ) should accept rollNo, name & 
   marks of the student whereas the function putMarks( ) should display the students data */

class Student
{
	String name;
	int rollno;
	double marks;

	void getMarks(String n, int r, double m)
	{
		name   = n;
		rollno = r;
		marks  = m;
	}

	void putMarks()
	{
		System.out.print("\n\n Name  : "+name);
		System.out.print("\n\n RollNo: "+rollno);
		System.out.print("\n\n Marks : "+marks);
	}
	
	public static void main(String args[])
	{
		Student S = new Student();

		// Accept Data
		S.getMarks("ABC",10,80.00);

		// Display Data
		S.putMarks( );
	}
}