/* WAP to demonstrate throw keyword in Java */

class ThrowDemo
{
	static void error()
	{
		try
		{
			throw new NumberFormatException();
		}

		catch(NumberFormatException e)
		{
			System.out.println("\n\n Error Caught in Error Method");
			throw e;
		}
	}

	public static void main(String args[])
	{
		System.out.println("\n\n Main Methods Starts");

		try
		{
			error();
		}

		catch(NumberFormatException e)
		{
			System.out.println("\n\n Error Caught in Main");
		}

		System.out.println("\n\n Main Methods Ends");
	}
}