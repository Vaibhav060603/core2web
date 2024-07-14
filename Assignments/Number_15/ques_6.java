import java.io.*;

public class ques_6
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                String input = br.readLine();
                

                for(int i=input.length(); i>=Math.ceil((input.length()-1)/2); i--)
                {
			if(input.charAt(i-1) != input.charAt(input.length()-i))
			{
				System.out.println(input + " is not a palindrome number.");
				break;
			}
			else if(i == Math.ceil((input.length()-1)/2))
			{
				System.out.println(input + " is a palindrome number.");
			}			
		}
        }
}

