import java.io.*;

public class ques_6
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number of rows:");
                int row = Integer.parseInt(br.readLine());
		int ascii = 97;
		int count = 0;

                for(int i =0; i<row; i++)
                {
                        for(int j=1; j<=row-i; j++)
                        {
				if(j%2 == 0)
				{
					System.out.print((char)(ascii+count) + " ");
					count++;
				}
				else if(j%2 != 0)
				{
                                	System.out.print(count+1 + " ");
				}
			}
			count=0;
                        System.out.println();
                }
        }
}
