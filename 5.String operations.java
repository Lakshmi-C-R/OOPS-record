package arraylist;
import java.util.*;
import java.io.*;
public class Arraylist
{
    public static void main(String args[])throws IOException
    {   
        ArrayList<String> obj = new ArrayList<String>();
        DataInputStream in=new DataInputStream(System.in);
        int c,ch;
        int i,j;
        String str,str1; 
        do
        {
            System.out.println("STRING MANIPULATION");
            System.out.println(".....................");
            System.out.println(" 1.Append \n 2.Insert \n 3.Search \n 4.List string \n 5.Display");
            System.out.print("Enter the choice:");
            c=Integer.parseInt(in.readLine());
            switch(c)
            {	
               case 1:
                {
                   System.out.println("Enter the string:");
                   str=in.readLine();
                   obj.add(str);
                   break;
                }
               case 2:
               {
                   System.out.println("Enter the string:");
                   str=in.readLine();
                   System.out.println("Specify the index/position to insert:");
                   i=Integer.parseInt(in.readLine());
                   obj.add(i-1,str);
                   System.out.println("The array list has following elements:"+obj);
                   break;
               }
                case 3:
                {
                    System.out.println("Enter the string to search:");
                    str=in.readLine();
                    j=obj.indexOf(str);
                    if(j==-1)
                    System.out.println("Element not found");
                    else
                    System.out.println("Index of:"+str+" is"+j);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the character to List string:");
                    str=in.readLine();
                    for(i=0;i<(obj.size()-1);i++)
                    {
                        str1=obj.get(i);
                        if(str1.startsWith(str))
                        System.out.println(str1);
                    }	
                    break;
                }
                case 5:
                {
                    System.out.println("The array list has following elements:"+obj);
                    break;
                } 	
            }
            System.out.println("enter 0 to break and 1 to continue");
            ch=Integer.parseInt(in.readLine());
            System.out.println(".....................");
            }while(ch==1);
    }
}
