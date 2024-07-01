//1. str1.concat(str2)
public class string1
{
	public static void main(String [] args)
	{
		String str1 = "Hello";
		String str2 = "Vaibhav";
		
	

		System.out.println(str1);  //Hello
		System.out.println(System.identityHashCode(str1)); //..1

		// .concat() creates new object
		// need to be stored
		str1 = str1.concat(str2);

		// (+) creates new object
		// need to be stored 
		// str1 = str1 + str2;
		
		//.append() (StringBuffer class) does not creates new object
		// need not be stored (automaticaly stores in previous variable)
		//str1.append(str2);
		
		System.out.println(str2);  //Vaibhav
		System.out.println(System.identityHashCode(str2)); //..2

		System.out.println(str1);  //HelloVaibhav
		System.out.println(System.identityHashCode(str1)); //..3
		System.out.println(System.identityHashCode(str1));
	}
}
