import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		int i,a,b; 
		System.out.println("Prime Numbers from 1 to 10 are:");	
		for( a=1; a<= 10; a++)
		{
			b = 0;
		    for( i=2; i<=a/2; i++)
		    {
		    	if(a%i==0)
		    	{
		    		b++;
		    		break;
		    	}
		    }
		    if(b == 0 && a != 1 )
		    {
		    	System.out.print(a+" ");
		    }  
		}
	}
}
