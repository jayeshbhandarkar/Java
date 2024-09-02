/* WAP to Calculate Area of Rectangle by using classes and objects. */

class Rectangle
{
	int length,width;

	void accept(int l, int w)
	{
		length = l;
		width  = w;
	}
	
	void display()
	{
		System.out.println("\n\n Length: "+length);
		System.out.println("\n\n Width : "+width );		
	}

	void area()
	{
		int ar = length*width;
		System.out.println("\n\n Area: "+ar);
	}	

	public static void main(String args[])
	{
		Rectangle R = new Rectangle();

		//Accept
		R.accept(10,20);

		//Display
		R.display();

		//Calculate
		R.area();
	}
}