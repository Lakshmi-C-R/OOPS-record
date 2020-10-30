import java.io.*;
public class FileInfo
{      
    public static void main(String[] args) throws IOException    
    {          
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));         
        System.out.print("\nEnter A File Name:"); 
        String fName = br.readLine();      
        File f = new File(fName);       
        String result = f.exists() ? "exists." : "does not exist.";      
        System.out.println("\nThe given file " + result);      
        if(f.exists())       
        {          
            result = f.canRead() ? "readable." : "not readable.";          
            System.out.println("The given file is " + result);        
            result = f.canWrite() ? "writable." : "not writable.";      
            System.out.println("The given file is " + result);        
            if (fName.endsWith(".jpg") || fName.endsWith(".gif") || fName.endsWith(".png"))             
                System.out.println("The given file is an image file......");    
            else if (fName.endsWith(".exe"))                        
                System.out.println("The given file is an executable file.....");     
            else if (fName.endsWith(".txt"))         
                System.out.println("The given file is a text file......");
            else if(fName.endsWith(".html"))
                System.out.println("The given file is a HTML file......");
            else           
                System.out.println("The file type is unknown....");              
        }   
  } 
}

