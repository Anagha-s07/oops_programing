import java.util.*;
class str_mani
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	String s=sc.nextLine();
	System.out.println("Strings in lowercase:"+s.toLowerCase());
	System.out.println("Strings in uppercase:"+s.toUpperCase());
	System.out.println("Length of the string:"+s.length());
	System.out.println("Substring:"+s.substring(1,5));
	System.out.println("character at position 6:"+s.charAt(6));
	System.out.println("Whether the given string contains string 'world':"+s.contains("world"));
	System.out.println("Whether the given string contains string 'Hai':"+s.contains("Hai"));
	System.out.println("string before replace:"+s);
	System.out.println("string after replacing:"+s.replace('e','a'));
	}
}
