import java.io.*;

public class ques_10
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number of rows:");
                int row = Integer.parseInt(br.readLine());
		int ascii = 65;
                int count = row;

                for(int i=0; i<row; i++)
                {
                        count = row-i;
                        for(int j=i; j<row; j++)
                        {
                                if(i%2 != 0)
                                {
                                        System.out.print((char)(ascii+count-1+32) + " ");
                                        count--;
                                }
                                else
                                {
                                        System.out.print((char)(ascii+count-1) + " ");
                                        count--;
                                }
                        }
                        System.out.println();
                }

        }
}

