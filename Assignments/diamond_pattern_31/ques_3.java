import java.io.*;

public class ques_3
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                int row = Integer.parseInt(br.readLine());
                int count = row;


                for(int i=1; i<=(row*2)-1; i++)
                {
                        for(int j =1; j<=(row*2)-1; j++)
                        {
                                if(j >= count && j<= (2*row)-count)
                                {
					if(j<=row)
					{
						System.out.print(row-j+1 + " ");
					}
					else
					{
                                        	System.out.print(j-row+1 + " ");                                 			   }
				}
				else
                                {
                                        System.out.print(" ");
                                }
                        }
                        if(i<row)
                        {
                                count--;
                        }
                        else
                        {
                                count++;
                        }
                        System.out.println();
                }
        }
}

