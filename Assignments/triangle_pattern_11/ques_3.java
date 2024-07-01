import java.io.*;
public class ques_3
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                int row = Integer.parseInt(br.readLine());
		int ascii = 65;
                for(int i = 0; i<row; i++)
                {
                        for(int j =0; j<=i; j++)
                        {
                                System.out.print((char)(ascii+j) + " ");
			}
			ascii +=1;
                        System.out.println();
                }
        }


}                                                                              
