import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class input {

	public static void main(String [] args) throws IOException  {
		
//              // method 1
//		Scanner sc = new Scanner(System.in);		
//		String str1 = sc.next();
//		sc.nextLine();
//		String str2 = sc.nextLine();
//		int integer1 = sc.nextInt();
//		float float1 = sc.nextFloat();
//		char char1 = sc.next().charAt(0);
	
//		System.out.println(str1); 
//		System.out.println(str2);
//		System.out.println(integer1);
//		System.out.println(float1);
//		System.out.println(char1);





		// method 2
		// isr can read only 1 character and by default it convert it to its ASCII value

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);


//		int integer2 = isr.read();
//		char character2 = (char) isr.read();


//		System.out.println(integer2);
//		System.out.println(character2);


		String batter = br.readLine();
		int ascii = br.read();
		br.readLine();
		String inttt = br.readLine();
		int inttt2 = Integer.parseInt(br.readLine());
		float floattt = Float.parseFloat(br.readLine());

		System.out.println("name of batter: "+batter);
		System.out.println("ASCII code: "+ascii);
		System.out.println("integer is (String variable):"+inttt);
		System.out.println("integer is (int variable):"+inttt2);
		System.out.println("float value: "+ floattt);



	}
}

