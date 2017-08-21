package FileHandlinf;

import java.io.*;

public class Example1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("abc.txt");  //if single bacslash it uses as escape character
            String name="This is file handling";
            byte b[]=name.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("file created");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
