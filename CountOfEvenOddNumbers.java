package Array;

import java.util.Scanner;

public class CountOfEvenOddNumbers {

	public static void main(String[] args) {
	int[] number= {2,3,6,18,12,17};

	int evencount =0;
	int oddcount=0;
	for(int num:number)
	{
		if(num%2==0)
		{
		 evencount++;
		}
		else
		{
			oddcount++;
		}
	}
	System.out.println("Count of even number is:" + evencount);
	System.out.println("Count of odd number is:" + oddcount);
			
	       	}

}
