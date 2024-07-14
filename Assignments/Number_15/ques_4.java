import java.io.*;

public class ques_4
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the number:");
                int input = Integer.parseInt(br.readLine());
		//int factorial = input;

                for(int i=input-1; i>0; i--)
                {
			 input *= i; 
                }

		System.out.println("Factorial of " + input + " is " + input);
        }
}

