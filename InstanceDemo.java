/* WAP to demonstrate instanceof Operator in java */

class InstanceDemo
{
	public static void main(String args[])
	{
		InstanceDemo S = new InstanceDemo();
		boolean flag;
		flag = S instanceof InstanceDemo;
		
		if(flag==true)
		{
			System.out.println("\n\n S is an object of class InstanceDemo");
		}
		else
		{
			System.out.println("\n\n S is not an object of class InstanceDemo");
		}
	}
}