import java.util.Scanner;

class swap
{
	public static void main(String A[])
	{
		int Value1 = 0,Value2=0,Value3 = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the first number from user: ");
		Value1 = sobj.nextInt();
		System.out.println("Enter the second number from user: ");
		Value2 = sobj.nextInt();

		System.out.println("Before Swapping : "+Value1+" "+Value2);
		Value3 = Value1;
		Value1 = Value2;
		Value2 = Value3;

		System.out.println("After Swapping : "+Value1+" "+Value2);

	}
}
