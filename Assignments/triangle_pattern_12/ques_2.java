import java.io.*;

public class ques_2
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                int num = Integer.parseInt(br.readLine());

		int ascii = 97;
                for(int i =1; i<=num; i++)
                {
			if(i % 2 ==0)
			{
				for(int k = 0; k<i; k++)
				{
					System.out.print("$ ");
				}
			}

			else if(i % 2 != 0)
			{
                        	for(int j =0; j<i; j++)
                        	{
                                	System.out.print((char)(ascii+j) + " ");
                        	}
			}
                        System.out.println();
                }
        }
}
