public class array3
{
	void func1(float [] arr)
	{
		for(int j = 0; j<arr.length; j++)
		{
			arr[j] += 10.0;
			System.out.print(arr[j] + " ");
		}
		System.out.println();

	}

	static void func2(int p)
	{
		p += 10;
		System.out.println(p);
	}

	public static void main(String [] args)
	{
		float [] arr = {10,20,30,40};
		

		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");  // 10,20,30,40
		}
		System.out.println();

		// whenever an array is passed as parameter to a function, then it's address is passed, and not the values, and so if try to access the array again, then we will get the new changed array.  
		
		array3 obj = new array3();
		obj.func1(arr);
		
		for(int i = 0; i<arr.length; i++) // 20,30,40,50
		{
			System.out.print(arr[i] + " ");  // 20,30,40,50
		}	
		System.out.println();
		
		
		// the address passing works only for array and not the individual variables
		int p = 10;
		
		System.out.println(p)
			;
		func2(p);
	

		System.out.println(p);


	
	}


}
