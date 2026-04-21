import java.util.*;
class Fibonacci implements Runnable{
int n;
public Fibonacci(int n)
{
this.n = n;
}
public void run(){
int a = 0, b = 1;
System.out.println("Fibonacci numbers are : ");
for(int i = 0; i < n; i++)
{
System.out.println(a);
int next = a + b;
a = b;
b = next;
}
}
}
class Even implements Runnable{
int n;
public Even(int n){
this.n = n;
}
public void run(){
System.out.println("Even numbers are : ");
for(int i = 0; i < n; i++){
if(i%2==0){
System.out.println(i);
}
}
}
}
public class fibthread
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit : ");
int n=sc.nextInt();
Fibonacci p=new Fibonacci(n);
Thread t1=new Thread(p);
t1.start();
try
{
t1.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
Even m=new Even(n);
Thread t2=new Thread(m);
t2.start();
}
}

