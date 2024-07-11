import java.io.*;

public class ques_5
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                int num = Integer.parseInt(br.readLine());

                int ascii = 65+num;
		int count =0; 
                for(int i =num; i>=1; i--)
                {
                        for(int j =num; j>=i; j--)
                        {
                                System.out.print((char)(ascii+count) + " ");
                        	count++;
			}
                        System.out.println();
                }
        }
}

