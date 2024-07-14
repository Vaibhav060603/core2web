import java.io.*;

public class ques_1
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                int input = Integer.parseInt(br.readLine());

                for(int i=1; i<=input; i++)
                {
                        if(input % i == 0)
                        {
                                System.out.print(i + ", ");
                        }
                }
        }
}

