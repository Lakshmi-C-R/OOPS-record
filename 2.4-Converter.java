package converter;
import java.util.*;
import java.io.*;
import converter.currency;
import converter.distance;
import converter.time;
class Converter
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int choice,ch;
    currency c=new currency();
    distance d=new distance();
    System.out.println("1.Dollar to rupee ");
    System.out.println("2.Rupee to dollar ");
    System.out.println("3.Euro to rupee ");
    System.out.println("4.Rupee to Euro ");
    System.out.println("5.Yen to rupee ");
    System.out.println("6.Rupee to Yen ");
    System.out.println("7.Meter to kilometer ");
    System.out.println("8.kilometer to meter ");
    System.out.println("9.Miles  to kilometer ");
    System.out.println("10.kilometer to miles");
    System.out.println("11.Hours to Minutes");
    System.out.println("12.Hours to Seconds");
    System.out.println("13.Seconds to Hours");
    System.out.println("14.Minutes to Hours");
    time t=new time();
    do
    {
        System.out.print("Enter ur choice:");
        choice=s.nextInt();
        if(choice>14)
            System.out.println("Wrong choice");
        else
        {
            switch(choice)
            {
            case 1:
            {
                c.dollartorupee();
                break;
            }
            case 2:
            {
                c.rupeetodollar();
                break;
            }
            case 3:
            {
                c.eurotorupee();
                break;
            }
            case 4:
            {
                c.rupeetoeuro();
                break;
            }
            case 5:
            {
                c.yentorupee();
                break;
            }
            case 6 :
            {
                c.rupeetoyen();
                break;
            }
            case 7  :
            {
                d.mtokm();
                break;
            }
            case 8  :
            {
                d.kmtom();
                break;
            }
            case 9  :
            {
                d.milestokm();
                break;
            }
            case 10  :
            {
                d.kmtomiles();
                break;
            }
            case 11 :
            {
                t.hourstominutes();
                break;
            }
            case 12 :
            {
                t.hourstoseconds();
                break;
            }
            case 13 :
            {
                t.secondstohours();
                break;
            }
            case 14 :
            {
                t.minutestohours();
                break;
            }
        }
    }
System.out.print("Enter 0 to  quit and 1 to continue :");
ch=s.nextInt();
}while(ch==1);
}
}
