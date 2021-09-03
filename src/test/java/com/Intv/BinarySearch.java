package com.Intv;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {8,12,34,56,78,89,104,123};
		int key = 31;
		int lb = 0;
		int ub = a.length-1;
		boolean flag = false;
		while(lb<=ub)
		{
			int mid = (lb+ub)/2;
			if(a[mid]==key)
			{
				System.out.println("Element Found!");
				flag = true;
				break;
			}
			if(a[mid]<key)
			{
				lb=mid+1;
				
			}
			if(a[mid]>key)
			{
				ub=mid-1;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element Not Found!");
		}
			
	}

}
