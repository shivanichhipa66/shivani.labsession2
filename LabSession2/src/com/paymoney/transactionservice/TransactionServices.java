package com.paymoney.transactionservice;
import java.util.Scanner;


public class TransactionServices {

	public void targetAchievementStatus(int[] arr, int nooftargets) {
		
		Scanner s = new Scanner(System.in);
		
		while(nooftargets-- != 0) {
			
			int flag = 0 ;
			 
			int target;
			
			System.out.println("Enter value of target");
			target = s.nextInt();
			
			int sum=0;
			
			for(int i=0; i< arr.length;i++) {      // linear Iteration, linear searching
				
				sum += arr[i];
				
				if (sum >= target) {
					
					System.out.println("Target achieved after " +" "+(i+1)+" " + "transactions");
					
					flag = 1;
					
					break;
				}
			}
			System.out.println();
			
				if(flag == 0) {
					System.out.println("Given target is not acieved");
				}
			}	
	}
}
