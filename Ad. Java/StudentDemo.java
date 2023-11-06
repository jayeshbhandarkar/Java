
interface Student
{
	String name   = "ABC" ;
	int    rollno = 10    ;
	float m1=67.00F , m2=71.00F , m3=55.00F ;

	void putData();
}

interface Sports
{
	float score = 5.00F ;

	void putSports();
}

class Result implements Student , Sports
{
	float total , avg ;

	void calculate()
	{
		total = m1+m2+m3;
		avg   = total/3 ;

		System.out.println("\n\n Total=" + total + " Average=" + avg);
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
	
	public void putSports()
	{
		System.out.println("\n\n Sports Marks: " + score );
	}
}

class StudentDemo
{
	public static void main( String args[] )
	{
		Result R = new Result();

		System.out.println("\n\n Students Details");
		R.putData();
		R.putSports();

		System.out.println("\n\n Result");
		R.calculate();
	}
}