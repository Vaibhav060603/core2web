import java.io.*;

public class ques_3
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                int num = Integer.parseInt(br.readLine());

		int ascii = 65;
                for(int i =num; i>=1; i--)
                {
                        for(int j =num; j>=i; j--)
                        {
                                System.out.print(((char)(ascii+(j-1))) + " ");
                        }
                        System.out.println();
                }
        }
}