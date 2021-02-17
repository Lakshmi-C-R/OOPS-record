package sum.of.two.three;
import java.util.Scanner;
abstract class SumofTwo 
{
    int a, b, s;
    abstract void add1();
    abstract void result1();
    Scanner sc = new Scanner(System.in);
}
abstract class SumofThree
{
    int a, b, c, s;
    abstract void add2();
    abstract void result2();
    Scanner sc = new Scanner(System.in);
}
class two extends SumofTwo 
{
	void input1() 
	{
        	System.out.println("Enter two numbers:");
        	a = sc.nextInt();
        	b = sc.nextInt();
    	}
	void add1() 
	{
        	s = a + b;
    	}
	void result1() 
	{
        	System.out.println("Sum of two numbers:" + s);
    	}
}
class three extends SumofThree 
{
	void input2() 
	{
        	System.out.println("Enter three numbers:");
        	a = sc.nextInt();
        	b = sc.nextInt();
		c = sc.nextInt();
    	}
	void add2() 
	{
        	s = a + b + c;
    	}
	void result2() 
	{
        	System.out.println("Sum of three numbers:" + s);
    	}
}
class SumOfTwoThree
{
	public static void main(String args[]) 
	{
        	two m1 = new two();
        	m1.input1();
        	m1.add1();
        	m1.result1();
		
		three m2 = new three();
        	m2.input2();
        	m2.add2();
        	m2.result2();
    	}
}
