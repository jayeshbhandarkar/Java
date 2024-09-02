/* WAP to create a class Account having data members as account no (acc_no), name & 
   balance. Accept & display the data of one account */

class Account
{
	long accno;
	String name;
	double balance;

	void accept(long a, String n, double b)
	{
		accno  = a;
		name   = n;
		balance= b;
	}

	void display()
	{
		System.out.print("\n\n Account No. :"+accno);
		System.out.print("\n\n Name :"+name);
		System.out.print("\n\n Balance :"+balance);
	}

	public static void main(String args[])
	{
		Account A = new Account();
		
		// Accept
		A.accept(1234,"ABC",1000.00);

		// Display
		A.display();
	}
} 