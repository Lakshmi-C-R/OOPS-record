package mark.system;
import java.util.Scanner;
class Internals
{
    String studentname;
    String register;
    int totaldays;
    int presentdays;
    int percentage;

    void input_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        studentname = sc.nextLine();
        System.out.print("Enter resgister number: ");
        register = sc.next();
        System.out.print("Enter Total no of working days: ");
        totaldays = sc.nextInt();
        System.out.print("Enter no of present days: ");
        presentdays = sc.nextInt();
        sc.close();
    }

    void calculate_Internal()
    {
        int internals;
        percentage = (presentdays * 100) / totaldays;
        if (percentage >= 90)
        {
            internals = 5;
        }
        else if (percentage >= 80 && percentage < 90)
        {
            internals = 4;
        }
        if (percentage >= 75 && percentage < 80)
        {
            internals = 3;
        }
        else
        {
            internals = 0;
        }
        System.out.println("..............................");
        System.out.println("Internal marks based on attendance percentage");
        System.out.println("Student name:"+studentname);
        System.out.println("Register number:"+register);
        System.out.println("Attendance percentage:"+percentage);
        System.out.println("Internals:"+internals);
    }
}
public class MarkSystem
{
    public static void main(String args[])
    {
        String studentname;
        String register;
        int totaldays;
        int presentdays;
        Internals obj=new Internals();
        obj.input_data();
        obj.calculate_Internal();
    }
}
