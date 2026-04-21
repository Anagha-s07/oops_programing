import java.util.*;
class NegExp extends Exception
{
NegExp(String s)
{
super(s);
}
}
class AvgException
{
static void avgexp()throws NegExp
{
throw new NegExp("Invalid input.Enter positive integers...");
}
public static void main(String args[])
{
int num[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit : ");
int n=sc.nextInt();
try
{
int sum=0;
System.out.println("Enter positive integers : ");
for(int i=0;i<n;i++)
{
num[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(num[i]>0)
{
sum=sum+num[i];
}
else
{
avgexp();
}
}
float avg=sum/n;
System.out.println("Average of given positive integers are : "+avg);
}
catch(NegExp e)
{
System.out.println(e);
}
}
}
