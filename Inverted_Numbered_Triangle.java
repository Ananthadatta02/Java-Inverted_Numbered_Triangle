package number_patterns;

import java.util.Scanner;

/*
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
*/
public class Inverted_Numbered_Triangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		for(int i=0;i<=n;i++)
		{
			int num = n;
			for(int j=i;j<n;j++)
			{
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
	}
}
