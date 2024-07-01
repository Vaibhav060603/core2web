public class array6
{
	public static void main(String args [])
	{
		int arr1[][] = {{},{},{}};  // subarray also initialized and empty
		int arr2[][] = new int[3][];  // subarray not yet initialized

	
		System.out.println(arr1.length);   //3
		System.out.println(arr1[0].length);   //0

		System.out.println(arr2.length);   //3
		System.out.println(arr2[0].length);   //null pointer exception

	}

}
