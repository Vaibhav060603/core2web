import java.io.*;
import java.util.StringTokenizer;

public class string_tokenizer {
	
	public static void main(String [] args) throws IOException { 
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the society, wing, flat number:");

		String info = br.readLine();

		System.out.println(info);

		StringTokenizer st = new StringTokenizer(info, ",");

		String token1 = st.nextToken();
		String token2 = st.nextToken();
		String token3 = st.nextToken();

		System.out.println(token1);
		System.out.println(token2);
		System.out.println(token3);

	
	}


}
