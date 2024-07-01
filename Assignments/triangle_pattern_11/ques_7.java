import java.io.*;
public class ques_7
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                int row = Integer.parseInt(br.readLine());
                for(int i = row; i>=1; i--)
                {
                        for(int j =1; j<=i; j++)
                        {
                                System.out.print(j + " ");
                        }
                        System.out.println();
                }
        }


} 
