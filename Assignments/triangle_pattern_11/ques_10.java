import java.io.*;
public class ques_10
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                int row = Integer.parseInt(br.readLine());
                int ascii = 65;
		for(int i = row; i>=1; i--)
                {
                        for(int j =1; j<=i; j++)
                        {
				if(j%2 ==0)
				{
					System.out.print((char)(ascii+(j-1)) + " ");
				}
				else
				{
                                	System.out.print(ascii+(j-1) + " ");
				}
			}
			ascii++;
                        System.out.println();
                }
        }


} 
