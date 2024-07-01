public class array7
{
	public static void main(String args [])
	{
		int arr1[] = {10,200};
		int arr2[] = {10,200};
		Integer arr3[] = {10,200};

		System.out.println(System.identityHashCode(arr1[0])); //1
		System.out.println(System.identityHashCode(arr1[1])); //2
		System.out.println(System.identityHashCode(arr2[0])); //1
		System.out.println(System.identityHashCode(arr2[1])); //3
		System.out.println(System.identityHashCode(arr3[0])); //1
		System.out.println(System.identityHashCode(arr3[1])); //4

		System.out.println(System.identityHashCode(arr1[1])); //5
		System.out.println(System.identityHashCode(arr2[1])); //6
		System.out.println(System.identityHashCode(arr3[1])); //7

		int x = 2388;
		int y = 2388;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
