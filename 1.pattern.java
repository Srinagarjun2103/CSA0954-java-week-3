import java.util.*;
public class pattern 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n,a;
		System.out.print("Enter the number to be printed: ");
		if(!sc.hasNextInt())
		{
			System.out.println("Invalid enter only integers");
			return;
		}
		a=sc.nextInt();
		System.out.print("Max Number of time printed: ");
		if(!sc.hasNextInt())
		{
			System.out.println("Invalid enter only integers");
			return;
		}
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
Footer
