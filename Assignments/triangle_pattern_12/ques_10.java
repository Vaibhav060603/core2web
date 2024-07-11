import java.io.*;

public class ques_10
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                int num = Integer.parseInt(br.readLine());

                int ascii = 97;
		int count =1;
                for(int i =1; i<=num; i++)
                {
                        for(int j =1; j<=i; j++)
                        {
				if(i%2 != 0)
				{
					System.out.print(count + " ");
				}

				else if(i%2 == 0)
				{
                                	System.out.print((char)(ascii+count-1) + " ");
				}
				count++;
			}
                        System.out.println();
                }
        }
}

