import java.util.*;
class UsernameExp extends Exception
{
UsernameExp(String s)
{
super(s);
}
}
class PasswordExp extends Exception
{
PasswordExp(String s)
{
super(s);
}
}
class authentication
{
public static void main(String args[])
{
String str1="Abc@123";
Scanner sc=new Scanner(System.in);
try
{
System.out.println("Enter the username : ");
String str=sc.nextLine();
if(str.length()<6)
{
throw new UsernameExp("Invalid Username");
}
try
{
System.out.println("Enter the password : ");
String str2=sc.nextLine();
if(str2.equals(str1))
{
System.out.println("Authentication successfull");
}
else
{
throw new PasswordExp("Invalid password");
}
}
catch(PasswordExp e)
{
System.out.println(e);
}
}
catch(UsernameExp e)
{
System.out.println(e);
}
}
}
