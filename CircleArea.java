import java.util.Scanner;
class CircleArea
{
    public static float Area(float Radius)
    {
        float Ans = 0.0f;
        float PI= (float) 3.14;
        Ans = PI * Radius * Radius;
        return Ans;

    }
    public static void main(String A[])
    {
        float Value = 0.0f;
        float Res = 0.0f;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the radius:");
        Value = sobj.nextInt();

        Res = Area(Value);
        System.out.println("Area of circle is :" + Res);
    
    }
}


