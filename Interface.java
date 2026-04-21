
import java.util.*;
interface Shape
{
public void area();
public void perimeter();
}
class Circle implements Shape
{
double r;
Circle(double r)
{
this.r=r; }
public void area()
{
double area=3.14*r*r;
System.out.println("Area of circle : "+area);
}
public void perimeter()
{
double peri=2*3.14*r;
System.out.println("Perimeter of circle : "+peri);
}
}
class Rectangle implements Shape
{
double l,b;
Rectangle(double l,double b)
{
this.l=l;
this.b=b;
}
public void area()
{
double area=l*b;
System.out.println("Area of rectangle : "+area);
}
public void perimeter()
{
double peri=2*(l+b);
System.out.println("Perimeter of rectangle : "+peri);
}
}
class Interface
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int ch;
do
{
System.out.println("... Choose any option ...");
System.out.println("1. To Find area and perimeter of a circle");
System.out.println("2. To find area and perimeter of rectangle");
System.out.println("0. Exit");
System.out.println("Enter your choice : ");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the radius :");
double r = in.nextDouble();
Circle c = new Circle(r);
c.area();
c.perimeter();
break;
case 2:
System.out.println("Enter the length and breadth :");
int l = in.nextInt();
int b = in.nextInt();
Rectangle re = new Rectangle(l, b);
re.area();
re.perimeter();
break;
case 0:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice");
break;
}
}while(ch!=0);
}
}
