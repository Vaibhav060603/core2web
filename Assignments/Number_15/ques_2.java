import java.io.*;

public class ques_2
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
                                System.out.print(input + " is not a prime number. ");
                                break;
                        }
                        else if(i == input-1)
                        {
                                System.out.println(input + "is a prime number.");
                        }
                }
        }
}


