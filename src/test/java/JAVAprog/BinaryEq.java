package JAVAprog;
import java.util.*;
public class BinaryEq {
//int number;


public static void main(String args[])
{
	int number;
	int[] RemAr = new int[100];
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("Enter the decimal no");
	number = in.nextInt();
	
	// converting into binary
	int i=0;
	while(number!=0)
	{ 
	int rem = number % 2;
    RemAr[i] = rem;
    number = number / 2; 
    i++;
	}
	System.out.println(i);
	// reversing the array
	for(int j = i;j>=0;j--)
	{
		System.out.println(RemAr[j]);
	}
}


}
