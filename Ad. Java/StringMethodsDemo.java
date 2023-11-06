/* WAP to demonstrate methods of String Class in Java */

class StringMethodsDemo
{
	public static void main( String args[] )
	{
		String S1 = "Java" ;
		String S2 = "Programming" ;

		System.out.print("\n\n Given String S1=" + S1 );
		System.out.print(" S2=" + S2 ); 

		System.out.print("\n\n char at index 1 : " + S1.charAt(1) );

		System.out.print("\n\n Length of String-1 : " + S1.length() );

		System.out.print("\n\n Substring-1 : " + S2.substring(3) );

		System.out.print("\n\n Substring-2 : " + S2.substring(3,7) );

	        System.out.print("\n\n Starts With : " + S2.startsWith("Pro"));
		
		System.out.print("\n\n Ends With : " + S2.endsWith("ing"));

		System.out.print("\n\n Equals : " + S1.equals( S2 ) );

                System.out.print("\n\n Equals Ignore Case : "+S1.equalsIgnoreCase(S2));

		System.out.print("\n\n Compare To : " + S1.compareTo(S2) ); 

		System.out.print("\n\n Index Of : " + S1.indexOf('a') );

	        System.out.print("\n\n Last Index Of : " + S1.lastIndexOf('a') );
		
		System.out.print("\n\n Concat : " + S1.concat(S2) );

		System.out.print("\n\n Lower case : " + S1.toLowerCase() );

		System.out.print("\n\n Upper case : " + S1.toUpperCase() );

		System.out.print("\n\n Replace : " + S1.replace('a','i') );

		System.out.print("\n\n Contains : " + S2.contains("Pro") );

		System.out.print("\n\n Trim : " + S1.trim() );
	}
}