public class multiArray5
{
	public static void main(String [] args)
	{
		// method 1
		int [][] arr1 = new int[3][];
		
		arr1[0] = new int []{1,2,3};
		arr1[1] = new int []{4,5,6};
		arr1[2] = new int []{7,8,9};

		for(int i = 0; i<arr1.length; i++)
		{
			for(int j = 0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j] + " ");		
			}
			System.out.println();
		}

		// method 2
		int [][] arr2 = new int[][]{{1,2,3},{4,5},{6}};

		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		// method 3
		int [][] arr3 = {{1,2,3},{4,5},{6}};

		for(int i=0; i<arr3.length; i++)
		{
			for(int j=0; j<arr3[i].length; j++)
			{
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	
	}


}
