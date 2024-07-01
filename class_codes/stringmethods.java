public class stringmethods
{
	public static void main(String args [])
	{
		String str1 = "hello";
		String str2 = "Vaibhav";
		String str3 = "hello";
		String str4 = "Hello";		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println("----------");
		System.out.println("1. concat:");
		String concatinated = str1.concat(str2);
		System.out.println(concatinated);

		
		System.out.println("----------");
		System.out.println("2. length:");
		int str1Length = str1.length();
		System.out.println(str1Length);


		System.out.println("----------");
		System.out.println("3. charAt:");
		char third = str1.charAt(3);
		System.out.println(third);


		System.out.println("----------");
		System.out.println("4. compareTo:");
		System.out.println(str1.compareTo(str2));
	       	System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));	

		
		System.out.println("----------");
		System.out.println("5. compareToIgnoreCase:");
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareToIgnoreCase(str3));
		System.out.println(str1.compareToIgnoreCase(str4));


		System.out.println("----------");
		System.out.println("6. equals:");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	
		
		System.out.println("----------");
                System.out.println("7. toCharArray:");
		char [] arr1 = str1.toCharArray();
		for(int i = 0; i< arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		
		System.out.println("----------");
                System.out.println("8. indexOf:");
		System.out.println(str1.indexOf('e',0));
		System.out.println(str1.indexOf('e',3));


		System.out.println("----------");
                System.out.println("9. lastIndexOf:");
		System.out.println(str1.lastIndexOf('e',0));
		System.out.println(str1.lastIndexOf('e',5));
	
	
		System.out.println("----------");
                System.out.println("10. replace:");
		String replaced = str2.replace('a','k');
		System.out.println(replaced);
	

		System.out.println("----------");
                System.out.println("11. substring:");
		String subString = str2.substring(2,6);
		System.out.println(subString);
			
	
	}

	
}
