public class stringBufferMethods
{
	public static void main(String args[])
	{
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("vaibhav");
		StringBuffer sb = new StringBuffer();	

		
		System.out.println(sb1);
		System.out.println(sb2);
		

		System.out.println();
		System.out.println("1. capacity:");
		System.out.println(sb.capacity()); //16
		System.out.println(sb1.capacity()); //21
		sb1.append(" how ");
		System.out.println(sb1.capacity());  //44


		System.out.println();		
		System.out.println("2. append:");
                sb1.append(sb2);  
		System.out.println(sb1); //hello how vaibhav  
		String o = " my friend  ";
		sb1.append(o);  
		System.out.println(sb1); //hello how vaibhav my friend
 

		System.out.println();
                System.out.println("3. insert:");
		sb1.insert(9, " are you ");
		System.out.println(sb1); //hello how are you vaibhav my friend
					 

		System.out.println();
                System.out.println("4. delete:");
		sb1.delete(6,9); //6 to 9-1=8
		System.out.println(sb1); //hello  are you vaibhav my friend
	
	
		System.out.println();
                System.out.println("5. reverse:");
		sb1.reverse();
		System.out.println(sb1);
	
	
	}


}
