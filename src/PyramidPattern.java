
public class PyramidPattern {
public static void pyramid()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=3;j>=i;j--)
			System.out.print(" ");
		for(int k=1;k<=i;k++)
			System.out.print("* ");
		System.out.println();
	}
	
}
public static void pyramid2()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
			System.out.print(" ");
		for(int k=4;k>=i;k--)
			System.out.print("* ");
		System.out.println();
	}
	
}
public static void pyramid3()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=6;j>=i;j--)
		System.out.print(" ");
		for(int k=1;k<i*2;k++)
		System.out.print("*");
		//for(int l=2;l<=i;l++)
	 //   System.out.println("*");
		System.out.println();
	}
	//System.out.println();
}
public static void pyramid4()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
			System.out.print(" ");
		for(int k=1;k<=i;k++)
			System.out.print("* ");
		System.out.println();
	}
	
}
}
