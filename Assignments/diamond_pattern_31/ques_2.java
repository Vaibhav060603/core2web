import java.io.*;

public class ques_2
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the number of rows:");
                int row = Integer.parseInt(br.readLine());
                int count = row;
		int number = 1;

                for(int i=1; i<=(row*2)-1; i++)
                {
                        for(int j =1; j<=(row*2)-1; j++)
                        {
                                if(j >= count && j<= (2*row)-count)
                                {
                                        System.out.print(number+" ");
					number++;
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

