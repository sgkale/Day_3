package String;

public class string_demo {

    public static void main(String[] args) {
        String str="My name is Shubham Kale";
        String str2="";
        String str3="";
        int len=str.length();
        int count=0;

        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='a')
            {
                str2=str.replace(str.charAt(i),'c');
                count++;
            }
        }

        System.out.println("\nOccurance of a="+count);

        System.out.println("Switch case of character");
        for (int i=0;i<len;i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            }
            else
                System.out.print(Character.toUpperCase(str.charAt(i)));
        }




        System.out.println("\nReplace character a with c = "+str2);
        System.out.println(str3);
        System.out.println("Print in reverse");
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

        System.out.println("\nword by word in reverse order");
        String[] words=str.split(" ");
        for(String w: words)
        {
            for (int i=w.length()-1;i>=0;i--)
            {
                System.out.print(w.charAt(i));
            }
            System.out.println();
        }

        System.out.println("print words startingg from capital letter");
        int length=words.length;
        for(int i=0;i<length;i++)
        {
            if(Character.isUpperCase(words[i].charAt(0)))   //compare ascii
            {
                System.out.println(words[i]);
            }
        }
    }
}
