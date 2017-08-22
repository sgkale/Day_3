package String;

import java.util.Scanner;

public class StringHandling {

    public static void main(String[] args) {

        String data="Hello im Prajakta Khedekar from Urali kanchan";
        Scanner sc=new Scanner(System.in);

        int option=0;
        do{
            System.out.println("1)To Find No of Occurance of letter 'a' and its location eg(Prajakta - location-2,4,7 and Occurance = 3)");
            System.out.println("2)Replace character 'a' with 's' and print the string");
            System.out.println("3)Switch Case of each character and print(If upper case then lower case and vise versa)");
            System.out.println("4)Reverse the string");
            System.out.println("5)Print word by word in reverse order (eg Hello im - olleH mi) Hint- Split the string");
            System.out.println("6)Print words starting with capital letter");
            System.out.println("7)Exit\nEnter option");
            option=sc.nextInt();
            switch (option){

                case 1:
                    //Body
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                    default:
                        break;

            }

        }while(option!=7);


    }
}
