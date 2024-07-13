import java.io.*;

public class ques_2
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number of rows:");
                int row = Integer.parseInt(br.readLine());
		int count =1;

                for(int i =0; i<row; i++)
                {
                        for(int j=i; j<row; j++)
                        {
                                System.out.print(2*count + " ");
                        	count++;
			}
                        System.out.println();
                }
        }
}
