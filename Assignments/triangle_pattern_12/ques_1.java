import java.io.*;

public class ques_1
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		System.out.println("Enter the number:");
		int num = Integer.parseInt(br.readLine());
	
		for(int i =1; i<=num; i++)
		{
			for(int j =1; j<=i; j++)
			{
				System.out.print(num*num + " ");
			}
			System.out.println();
		}
	}
}
