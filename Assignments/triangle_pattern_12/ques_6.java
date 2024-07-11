import java.io.*;

public class ques_6
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                int num = Integer.parseInt(br.readLine());

                int ascii = 65;
		int count =0;
                for(int i =1; i<=num; i++)
                {
                        for(int j =1; j<=i; j++)
                        {
				if(i%2 ==0)
				{
                                	System.out.print((char)(ascii+count) + " ");
				}
				
				else if(i%2 != 0)
				{
					System.out.print(j + " ");
				}
				
				count++;
			}
                        System.out.println();
                }
        }
}

