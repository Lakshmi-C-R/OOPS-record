package array.operation;
import java.util.Scanner;
public class ArrayOperation
{
   public static void main(String args[])
   {
	int counter, i=0, j=0, temp;
	int number[] = new int[100];
	Scanner scanner = new Scanner(System.in);
	System.out.print("Total number of elements: ");
	counter = scanner.nextInt();
        System.out.print("Enter elements:");
	for(i=0; i<counter; i++)
	    number[i] = scanner.nextInt();
	j = i - 1;     
	i = 0;         
	scanner.close();
	while(i<j)
	{
  	   temp = number[i];
	   number[i] = number[j];
	   number[j] = temp;
	   i++;
	   j--;
	}
	System.out.print("Reversed array: ");
	for(i=0; i<counter; i++)
	{
	   System.out.print(number[i]+ "  ");
	}       
   }
}
