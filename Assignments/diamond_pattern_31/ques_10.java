import java.io.*;

public class ques_10
{
        public static void main(String [] args) throws IOException
        {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("ENter the number of rows:");
                int row = Integer.parseInt(br.readLine());
                int count = row;
                int ascii = 65;
		int number = 1;

		if(row %2 ==0)
		{
                for(int i=1; i<=(row*2)-1; i++)
                {
                        for(int j =1; j<=(row*2)-1; j++)
                        {
                                if(j >= count && j<= (2*row)-count)
                                {
					if(i%2==0)
					{
						if(j%2 == 0)
						{
							//System.out.print((char)(ascii++) + " ");
							if(j<row-1)
							{
								System.out.print((char)(ascii++) + " ");

								//ascii++;
							}
							else
							{
								System.out.print((char)(ascii--) + " ");

								//ascii--;
							}
						}
						else
						{
							//System.out.print(number + " ");
							if(j<row)
                                                        {
								System.out.print(number++ + " ");
                                                                //number++;
                                                        }
                                                        else
                                                        {
								System.out.print(--number + " ");
                                                                //number--;
                                                        }
						}
					}
					else
					{
						if(j%2 != 0)
						{
							//System.out.print((char)ascii + " ");
							if(j<row)
                                                        {
								System.out.print((char)(ascii--) + " ");
                                                                //ascii++;
                                                        }
                                                        else
                                                        {
								System.out.print((char)(++ascii) + " ");
								//ascii--;
                                                        }
						}
						else
						{
							//System.out.print(number + " ");
							if(j<row-1)
                                                        {
								System.out.print(number++ + " ");
                                                                //number++;
                                                        }
                                                        else
                                                        {
								System.out.print(number-- + " ");
                                                                //number--;
                                                        }						
						}
					}
				}
                                else
                                {
                                        System.out.print(" ");
                                }
                        }

                        if(i<row)
                        {
                                count--;
                        }
                        else
                        {
                                count++;
                        }
                        ascii = 65;
                        number = 1;
			System.out.println();
		}
		}
		else
		{
		for(int i=1; i<=(row*2)-1; i++)
               	{
                        for(int j =1; j<=(row*2)-1; j++)
                        {
                                if(j >= count && j<= (2*row)-count)
                                {
                                        if(i%2 !=0)
                                        {
                                                if(j%2 == 0)
                                                {
                                                        //System.out.print((char)(ascii++) + " ");
                                                        if(j<row)
                                                        {
                                                                System.out.print((char)(ascii++) + " ");

                                                                //ascii++;
                                                        }
                                                        else
                                                        {
                                                                System.out.print((char)(--ascii) + " ");

                                                                //ascii--;
                                                        }
                                                }
                                                else
                                                {
                                                        //System.out.print(number + " ");
                                                        if(j<row)
                                                        {
                                                                System.out.print(number++ + " ");
                                                                //number++;
                                                        }
                                                        else
                                                        {
                                                                System.out.print(number-- + " ");
                                                                //number--;
                                                        }
                                                }
                                        }
                                        else
                                        {
                                                if(j%2 != 0)
                                                {
                                                        //System.out.print((char)ascii + " ");
                                                        if(j<row)
                                                        {
                                                                System.out.print((char)(--ascii) + " ");
                                                                //ascii++;
                                                        }
                                                        else
                                                        {
                                                                System.out.print((char)(ascii++) + " ");
                                                                //ascii--;
                                                        }
                                                }
                                                else
                                                {
                                                        //System.out.print(number + " ");
                                                        if(j<row)
                                                        {
                                                                System.out.print(number++ + " ");
                                                                //number++;
                                                        }
                                                        else
                                                        {
                                                                System.out.print(--number + " ");
                                                                //number--;
                                                        }
                                                }
                                        }
                                }
                                else
                                {
                                        System.out.print(" ");
                                }
                        }

                        if(i<row)
                        {
                                count--;
                        }
                        else
                        {
                                count++;
                        }
                        ascii = 65;
                        number = 1;
                        System.out.println();
			}
			}	
		
		
		}
	}

