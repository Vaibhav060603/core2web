import java.io.*;

public class ques_8
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                int num = Integer.parseInt(br.readLine());

                int ascii = 97;
		int count =0;
                for(int i =1; i<=num; i++)
                {
                        for(int j =1; j<=i; j++)
                        {
				if(j%2 ==0)
				{
                                	System.out.print((char)(ascii+count) + " ");
				}

				else if(j%2 != 0)
				{
					System.out.print(j + " ");
				}
				count++;
			}
                        System.out.println();
                	if(i%3 == 0)
			{
				count--;
			}       
		}
	}
}
