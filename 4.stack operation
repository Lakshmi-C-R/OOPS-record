package stack.operation;
import  java.io.*;
class StackOperation
{
    static int max=10,i,top,ch,item;
    static int a[]=new int[10];
    StackOperation()
    {
        top=-1;
    }
    public static void main(String args[])throws IOException
    {
        while((boolean)true)
        {
            System.out.println("1.Push \n2.Pop \n3.Display \n4.Exit");
            System.out.print("Enter choice:");
            try
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(br.readLine());
            }
            catch(Exception e) { }
            if(ch==4)
                break;
            else
            {
                switch(ch)
                {
                    case 1:
                        push();
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        display();
                        break;
                }
            }
        }
    }
    static void push()
    {
        if(top==max)
            System.out.println("stack is full");
        else
 
            try
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the element:");
                item=Integer.parseInt(br.readLine());
                a[++top]=item;
            }
            catch(Exception e) { }
            System.out.println(".....................");
    }
    static void pop()
    {
        if(top==-1)
            System.out.println("Stack is empty");
        else
            top--;
        System.out.println("Popped item:"+a[top]);
        System.out.println(".....................");
    }
    static void display()
    {
        System.out.println("The elements in stack are:");
        for(i=top; i>0; i--)
            System.out.println(a[i]);
        System.out.println(".....................");
    }
}
