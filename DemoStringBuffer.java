/* WAP to Demonstrate methods of String Buffer class in Java. */

class DemoStringBuffer
{
	public static void main(String args[])
	{
		StringBuffer s1;
		StringBuffer s2;

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		s1.append("Programming");
		System.out.println("\n\n Appends: "+s1);
	
	        s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		System.out.println("\n\n Length of String: "+s1.length());

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		System.out.println("\n\n CharAt: "+s1.charAt(1));

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		s1.setCharAt(1,'i');
		System.out.println("\n\n set CharAt: "+s1);

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		s1.insert(2,"Pro");
		System.out.println("\n\n Insert: "+s1);

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		s1.deleteCharAt(0);
		System.out.println("\n\n Delete CharAt: "+s1);

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		s1.delete(1,3);
		System.out.println("\n\n Delete: "+s1);

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		s1.replace(1,3,"aa");
		System.out.println("\n\n Replace: "+s1);

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		s1.reverse();
		System.out.println("\n\n Reverse: "+s1);

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		String str = s1.substring(1,3);
		System.out.println("\n\n SubString: "+s1.substring(1,3));

		s1 = new StringBuffer("Java");
		System.out.println("\n\n s1: "+s1);
		int x = s1.indexOf("Ja",1);
		System.out.println("\n\n IndexOf: "+s1.indexOf("Ja",1));

		s1 = new StringBuffer("Java");
		s2 = new StringBuffer("Programming");
		System.out.println("\n\n s1: " +s1+ "\n\n s2: "+s2);
     		boolean y = s1.equals("s2");
		System.out.println("\n\n Boolean Equals: "+s1.equals("s2"));

	}

}