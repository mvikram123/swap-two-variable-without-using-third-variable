//swap two no. without using third variable

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        // int x=67;
        // int y=56;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swappping:" +x +" "+y);
        //System.out.println("Hello World");
    }
}
//input: 23 34
//output: 34 23