import java.io.*;

public class ques_3
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the number:");
                int input = Integer.parseInt(br.readLine());

                for(int i=2; i<input; i++)
                {
                        if(input % i == 0)
                        {
                                System.out.print(input + " is a composite number. ");
				break;
			}
			else if(i == input-1)
			{
				System.out.println(input + " is not a composite number.");
			}
				

		}
        }
}

