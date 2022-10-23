import java.io.*;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
         int A = input.nextInt();
        System.out.print("Enter 2nd Number:");
         int B = input.nextInt();
        System.out.print("Enter 3rd Number:");
         int C = input.nextInt();
        if(A>B && A>C)
          System.out.println("A is the Greatest Number");
        else if(B>C)
          System.out.println("B is the Greatest Number");
        else
          System.out.println("C is the Greatest Number");
    }
}