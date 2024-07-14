import java.io.*;

public class ques_5
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                String input = br.readLine();
		StringBuffer reverse = new StringBuffer();

                for(int i=input.length()-1; i>=0; i--)
                {
                	reverse.append(input.charAt(i));
                }

		System.out.println("Reverse of " + input + " is " + reverse);
        }
}

