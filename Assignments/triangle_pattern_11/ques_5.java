import java.io.*;
public class ques_5
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                int row = Integer.parseInt(br.readLine());
                for(int i = 1; i<=row; i++)
                {
                        for(int j =1; j<=i; j++)
                        {
                                System.out.print(i*j + " ");
                        }
                        System.out.println();
                }
        }


}     
