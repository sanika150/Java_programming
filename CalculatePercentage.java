import java.util.Scanner;
class CalculatePercentage
{
	public static float Percentage(int Marks,int totalMarks)
	{
		float percentage = 0.0f;
		if(Marks > totalMarks || Marks < 0 ||(totalMarks < 0))
		{
			System.out.println("Invalid input:");
			return percentage;
		}
		percentage = (((float)Marks / (float)totalMarks)*100);
		return percentage;
		
}

	public static void main(String A[])
	{
		int Value1 = 0,Value2=0;
		float res = 0.0f;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter marks:");
		Value1 = sobj.nextInt();

		System.out.println("Enter total marks:");
		Value2 = sobj.nextInt();


		res = Percentage(Value1,Value2);

		System.out.println("Percentage is:"+res);

	}
}




