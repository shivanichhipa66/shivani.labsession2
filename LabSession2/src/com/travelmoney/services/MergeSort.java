package com.travelmoney.services;

public class MergeSort {
	public void sort(int arr[], int left,int right) {
		 
		if(left<right) {
			//find the middle element
			int mid = (left+right)/2;
			
			//sort right and left subarray
			sort( arr, left, mid);
			sort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	public void merge (int arr[],int left, int mid, int right) {
		
		//find the size of two subarrays
		int n1 = mid-left+1;
		int n2 = right - mid;
		
		//create sub arrys
		int leftArray[]= new int[n1];
		int rightArray[] =new int [n2];
		
		//copy data to temp. array
		for(int i=0; i<n1;i++)
			leftArray[i] = arr[ left+i];
		for(int j=0; j<n2;j++)
			rightArray[j] = arr[ mid+1+j];
		 
		//merge temp arrays
		
	    int i = 0, j = 0;
	    
	    int k = left;
	    
	    while(i< n1 && j< n2) {
	    	if(leftArray[i]>= rightArray[j]) {
	    		arr[k]= leftArray[i];
	    		i++;
	    	}else {
	    		arr[k]= rightArray[j];
    			j++;
	    	}
	    	k++;
	    }
	    
	    //copy remaining elements of left array if present
	 /*	while( i < n1 || j< n2 ) {
	    		
	    		if(leftArray[i]>= rightArray[j]) {
	    			arr[k] = leftArray[i];
	    		}else {
	    			arr[k]= rightArray[j];
	    			j++;
	    		}
	    		k++;
	    	}
	    	*/
	    
	    	while( i < n1) {
	    		arr[k] = leftArray[i];
	    		i++;
	    		k++;
	    	}
	    	 //copy remaining elements of right array if present
	    	while( j < n2) {
	    		arr[k] = rightArray[j];
	    		j++;
	    		k++;
	    	}
}
}
