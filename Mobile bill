package mobile.bill;
import java.util.Scanner;
class local_call
{
	public void loc(int call)
	{
		float rate;
		rate=call*0.10f;
		System.out.println("Amount To be payed:"+rate);
	}
}
class ISD_call
{
	public void ISD(int call)
	{
		float rate;
		rate=call*1;
		System.out.println("Amount To be payed:"+rate);
	}
}
class Net_pack
{
	public void Net_pa(float usage)
	{
		float rate;
		rate=usage*500;
		System.out.println("Amount To be payed:"+rate);
	}
}
public class MobileBill
{
	public static void main(String args[])
	{
		System.out.println("\nMobile Bill Calculation menu\n");
		System.out.println("\n1.Local Call\n2.ISD call\n3.Net_Pack(In GB");
		System.out.println("Enter the Choice:");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the Number of calls called");
			int call=scan.nextInt();
			local_call obj=new local_call();
			obj.loc(call);
		
		}
		if(choice==2)
		{
			System.out.println("Enter the Number of calls called");
			int call=scan.nextInt();
			ISD_call obj=new ISD_call();
			obj.ISD(call);
		}
		if(choice==3)
		{
			System.out.println("Enter the Data usage");
			int usage=scan.nextInt();
			Net_pack obj=new Net_pack();
			obj.Net_pa(usage);
		}
	}
}
