import java.io.*;

public class ques_5
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number of rows:");
                int row = Integer.parseInt(br.readLine());
		int ascii = 65;

                for(int i =0; i<row; i++)
                {
                        for(int j=0; j<row-i; j++)
                        {
				if(i%2 == 0)
				{
					System.out.print((char)(ascii+j) + " ");
				}
				else if(i%2 != 0)
				{
					System.out.print((char)(ascii+j+32) + " ");
				}
                        }
                        System.out.println();
                }
        }
}

