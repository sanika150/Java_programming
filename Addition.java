import java.util.Scanner;



//main() is static, it cannot directly call a non-static method without creating an object.
//  A static method can be called directly from another static method in the same class.
class Addition
{
	static int Addition(int No1,int No2)
	{
		int ans = 0;
		ans = No1 + No2;
		return ans;
	}
	public static void main(String a[])
	{
		int Value1 = 0, Value2=0;
		int res = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first number :\n");
		Value1 = sobj.nextInt();

		System.out.println("Enter second number :\n");
		Value2 = sobj.nextInt();

		res = Addition(Value1,Value2);
		System.out.println("Result is : "+res);


	}
}


