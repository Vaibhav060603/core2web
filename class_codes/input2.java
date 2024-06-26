import java.io.*;

public class input2{
	
	public static void main(String [] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		BufferedReader br2 = new BufferedReader(isr);

		String name = br.readLine();
		char wing = (char)br.read();
		br.skip(1);
	
		int flatNo = Integer.parseInt(br.readLine());
		
		br2.close();
		String name2 = br.readLine();


		System.out.println("Name of owner is:"+ name);
		System.out.println("wing is:"+ wing);
		System.out.println("flat Number is:"+ flatNo);
		System.out.println("br2 :"+name2);
	}
}
