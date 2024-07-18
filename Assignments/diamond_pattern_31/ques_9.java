import java.io.*;

public class ques_9
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("ENter the number of rows:");
                int row = Integer.parseInt(br.readLine());
                int count = row;
                int ascii = 65+row-1;

                for(int i=1; i<=(row*2)-1; i++)
                {
                        for(int j =1; j<=(row*2)-1; j++)
                        {
                                if(j >= count && j<= (2*row)-count)
                                {
                                        System.out.print((char)(ascii) + " ");
				}
				else
				{
					System.out.print(" ");
				}
			}

                        if(i<row)
                        {
                                count--;
				ascii--;
                        }
                        else
                        {
				ascii++;
                                count++;
                        }
                        System.out.println();
		}
	}
}
