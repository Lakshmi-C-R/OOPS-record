import java.util.Scanner;
public class Main
{
	int EB_no;
	String name;
	int previous_month_reading;
	int current_month_reading;
	int units_consumed;
	double charge;
	int type;
	void getCustomerDetails()
    {
	    System.out.print("Enter consumer name:");
	    Scanner obj=new Scanner(System.in);
	    name=obj.nextLine();
	    System.out.print("Enter EB number:");
	    EB_no=obj.nextInt();
	    System.out.print("Enter Previous number EB reading:");
	    previous_month_reading=obj.nextInt();
	    System.out.print("Enter current month read:");
	    current_month_reading=obj.nextInt();
	    System.out.print("Enter type(Domestic-1,commercial-2):");
	    type=obj.nextInt();
    }
    void eBillCal()
    {
        units_consumed = current_month_reading - previous_month_reading;
        if(type==1)
        {
            if (type == 1)
                charge = units_consumed * 1;
            else if (units_consumed > 100 && units_consumed < 201)
                charge = 100 + (units_consumed - 100) * 2.5;
            else if (units_consumed > 200 && units_consumed < 501)
                charge = 100 + 100 * 2.5 + (units_consumed - 200) * 4;
            else
                charge = 100 + 100 * 2.5 + 300 * 4 + (units_consumed - 500) * 6;
        }
        else
        {
            if(units_consumed<101)
                charge=units_consumed*2;
            else if (units_consumed>100&&units_consumed<201)
                charge=100+(units_consumed-100)*4.5;
            else if (units_consumed>200&&units_consumed<501)
                charge=100+100*4.5+(units_consumed-200)*6;
            else
                charge=100+100*2.5+300*4+(units_consumed-500)*7;
        }
    }
    void display()
    {
        String connection=(type==1)?"Domestic":"Commercial";
        System.out.println("...BILL DETAILS...");
        System.out.println("Customer name:"+name);
        System.out.println("EB number:"+EB_no);
        System.out.println("Previous month reading:"+previous_month_reading);
        System.out.println("Current month reading:"+current_month_reading);
        System.out.println("Number of units consumed:"+units_consumed);
        System.out.println("Type of EB connection:"+type);
        System.out.println("EB charge:"+charge);
    }
    public static void main(String[]args)
    {
        Main e=new Main();
        e.getCustomerDetails();
        e.eBillCal();
        e.display();
    }
}
