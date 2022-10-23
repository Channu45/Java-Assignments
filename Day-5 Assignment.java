import java.util.*;  
public class SwappingNumbers {  
    public static void main(String[] args) {   
        System.out.println("Enter the values of a and b");  
        Scanner input = new Scanner(System.in);    
        int a = input.nextInt();  
        int b = input.nextInt();  
        System.out.println("Before Swapping: "+a+" "+b); 
        a = a+b;   
        b = a-b;   
        a = a-b;   
        System.out.println("After Swapping: "+a+" "+b);   
    }   
}