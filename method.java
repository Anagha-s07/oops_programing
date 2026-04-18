import java.util.Scanner;
class mo
{
	void area(int l,int b)
	{
		System.out.println("Area of rectangle:"+l*b);
	}
	void area(float r)
	{
		System.out.println("ARea of circle:"+3.14*r*r);
	}
	void area(double s)
	{
		System.out.println("Area of square:"+s*s);
	}
}
class method
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
mo m=new mo();
System.out.println("Enter the length and breadth:");
int l=sc.nextInt();
int b=sc.nextInt();
m.area(l,b);
System.out.println("Enter the radius:");
float r=sc.nextFloat();
m.area(r);
System.out.println("Enter the side of square:");
double s=sc.nextDouble();
m.area(s);
}}
		
