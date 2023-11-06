/* Write a Program to Demonstrate StringBuffer Class Methods in Java. */


class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer S = new StringBuffer();

		System.out.println("\n\n Initial Capacity: " + S.capacity()  );

		// Append
		S.append("MORE");
		System.out.println("\n\n String Append: " + S );
		S.append(" ACADEMY");
		System.out.println("\n\n String Append: " + S );
		
		//  Length
		int len = S.length();
		System.out.println("\n\n String Length: " + len );

		// Insert
		S.insert( 4, "JAVA");
		System.out.println("\n\n String Insert: " + S );

		// Replace
		S.replace(4,8,"G");
		System.out.println("\n\n String Replace: " + S );

		// Delete
		S.delete(11,12);
		System.out.println("\n\n String Delete: " + S );

		// Char AT
		char ch = S.charAt(0);
		System.out.println("\n\n Char AT 0 : " + ch );
		
		// Delete Char
		S.deleteCharAt(10);
		System.out.println("\n\n Delete Char M: " + S );

		// Reverse
		S.reverse();
		System.out.println("\n\n String Reverse: " + S );

		// Convert to String Object
		String str = S.toString();
		System.out.println("\n\n String Object: " + str );
		
		// Index of
		int ind = S.indexOf("ABC");
		System.out.println("\n\n Index Of: " + ind );
	
		// Index of
		ind = S.indexOf("GEROM", 2);
		System.out.println("\n\n Index Of: " + ind );

		// Substring
		str  = S.substring(2);
		System.out.println("\n\n Substring: " + str );

		// Substring
		str  = S.substring(2,6);
		System.out.println("\n\n Substring: " + str );
	}
}