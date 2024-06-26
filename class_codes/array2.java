public class array2
{
	public static void main(String [] args)
	{
		// same integer value has same identity HashCode (for integers between -128 to 127)

		byte x = 1;  
		byte y = 1;
		
		boolean i = true;
		boolean j = true;

		int [] arr = {1,2,3};

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	
		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(j));
	
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr[0]));

	}


}
