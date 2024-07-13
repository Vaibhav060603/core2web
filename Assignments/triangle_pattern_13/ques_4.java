import java.io.*;

public class ques_4
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number of rows:");
                int row = Integer.parseInt(br.readLine());
		int count = (row*(row+1))/2;

                for(int i =1; i<=row; i++)
                {
                        for(int j=i; j<=row; j++)
                        {
                                System.out.print((char)(65+(count-1)) + " ");
                        	count--;
			}
                        System.out.println();
                }
        }
}

