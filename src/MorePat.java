
public class MorePat {
public static void pattern13()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i>=2 && j>=2 && i<4 && j<4)
				System.out.print(" ");
			else
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void pattern14()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=1;j--)
		{
			if(i==j)
				System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
	}
	}
public static void pattern15()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i==j)
				System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
public static void pattern16()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		
		for(int k=9;k>i*2;k--)
		{
		System.out.print("*");
		
		}
		System.out.println();
	}
}
public static void pattern17()
{
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=4;j++)
		{
			if(i==j ||i+j==4 )
			System.out.print("*");
			else
				System.out.print(" ");
		}
		
		
		System.out.println();
	}
}
public static void pattern20()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		
		for(int k=1;k<i*2;k++)
		{
			if(k>1 && k<((i*2)-1))
				System.out.print(" ");
			else
		System.out.print("*");
		
		}
		System.out.println();
	}
}
public static void pattern47()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		
		for(int k=9;k>i*2;k--)
		{
			if(k>8 || k<((2*i)-1))
				System.out.print(" ");
			else
		System.out.print("*");
		
		}
		System.out.println();
	}
}
}
