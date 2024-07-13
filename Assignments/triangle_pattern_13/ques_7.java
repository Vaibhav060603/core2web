import java.io.*;

public class ques_7
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number of rows:");
                int row = Integer.parseInt(br.readLine());
		int ascii = 97;
		int count = row;
			
                for(int i=row; i>0; i--)
                {
			count = i;
                        for(int j=row; j>row-i; j--)
                        {
				if(j%2 == 0)
				{
					System.out.print(count + " ");
				}
				else if(j%2 != 0)
				{
                                	System.out.print((char)(ascii+count-1) + " ");
				}
				count--;
			}
                        System.out.println();
                }
        }
}

