/* WAP to Accept Marks of 3 Subjects as Command Line Arguments. Find its Sum
   and Average and Display them on output Screen */

class Students
{
	public static void main(String args[])
	{
		float m1,m2,m3,sum,avg;

		//Accepting Marks form Command Line
		m1=Float.parseFloat(args[0]);
		m2=Float.parseFloat(args[1]);
		m3=Float.parseFloat(args[2]);

		//Calculate Sum and Avg
		sum=m1+m2+m3;
		avg=sum/3;

		//Display
		System.out.println("\n\n Sum= "+sum);
		System.out.println("\n\n Average= "+avg);
	}
}