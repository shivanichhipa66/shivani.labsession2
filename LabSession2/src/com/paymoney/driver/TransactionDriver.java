package com.paymoney.driver;

import java.util.*;
import com.paymoney.transactionservice.*;

public class TransactionDriver {

	public static void main(String[] args) {

		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter the size of values of array");
		     
		     int size=sc.nextInt();
		     int arr[]= new int[size];
		
		System.out.println("Enter the values of array");
		
		     for(int i=0;i<size;i++) 
			   arr[i]=sc.nextInt();
			 
		 System.out.println("Enter the total no. of targets that needs to be achieved");
			 
			 int nooftargets = sc.nextInt();
			 
			TransactionServices tservices = new  TransactionServices();
			tservices.targetAchievementStatus(arr,nooftargets );
			
	

}
}