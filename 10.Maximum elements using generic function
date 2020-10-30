package generics;
import java.util.Scanner;
public class Generics
{
    public static <E extends Comparable<E>>E max(E[]list)
    {
        E max=list[0];
        for(int i=1;i<list.length;i++)
        {
            if(list[i].compareTo(max)>0)
            max=list[i];
        }
        return max;
    }
    public static void main(String arg[])
    {
        Integer []a={45,20,63,732};
        Double []b={0.56,0.52,1.03,45.0};
        Generics g=new Generics();
        System.out.println("The maximum element in Integer is:"+g.max(a));
        System.out.println("The maximum element in Double is:"+g.max(b));
    }   
}



