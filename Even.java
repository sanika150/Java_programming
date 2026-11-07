import java.util.Scanner;
class Even
{
	public static boolean Even(int No1)
		{
			if ((No1 % 2) == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	public static void main(String A[])
	{
		int Value1 = 0;
		boolean res = false;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number:\n");
		Value1 = sobj.nextInt();
		res = Even(Value1);
		if (res == true)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}

