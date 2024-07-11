import java.io.*;

public class ques_4
{
        public static void main(String args[]) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter the number:");
                int num = Integer.parseInt(br.readLine());

                int ascii = 97;
		//int ASCII = 65;
                for(int i =num; i>=1; i--)
                {
                        for(int j =num; j>=i; j--)
                        {
				if(i%2 == 0)
				{			
             				System.out.print(((char)(ascii+(j-1))) + " ");       				 }

				else if(i%2 != 0)
				{
					System.out.print((char)(ascii+(j-1)-32)+ " ");
				}
			}
                        System.out.println();
                }
        }
}
