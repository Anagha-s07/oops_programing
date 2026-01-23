import java.io.*;
import java.util.Scanner;
class product
{
	int p_code;
	String p_name;
	int price;

	void read()
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter product code:");
	this.p_code=sc.nextInt();
	System.out.print("Enter product name:");
	this.p_name=sc.next();
	System.out.print("Enter product price:");
	this.price=sc.nextInt();
	}
	
	public static void main(String[] args)
	{
		product obj1=new product();
		obj1.read();
		product obj2=new product();
		obj2.read();
		product obj3=new product();
		obj3.read();
	
		if(obj1.price < obj2.price && obj1.price<obj3.price)
		{
		System.out.println("Lowest product:"+obj1.p_name);
		}
		else if(obj2.price < obj1.price) {
		System.out.println("Lowest product:"+obj2.p_name);
		}
		else{
		System.out.println("Lowest product:"+obj3.p_name);
		}
	}	
}
	
	
	
		

