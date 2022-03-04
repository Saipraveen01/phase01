package com.longestincreasesubsequence;

import java.util.Scanner;

class Longestincreasingsubsequence
{
	public int findLongestIncreasingSubsequence(int[] arr)
	{
		int index=1,len=arr.length,maxIncreasingSubsequenceValue=0;
		int[] lis = new int[len];
		for(int i=0;i<len;i+=1)
			lis[i]=1;// initializing all the elements of lis array to 1
			
		while(true)
		{
		   	if(index==len)
		   		break;
		   	int j=0;
		   	while(j<index)
		   	{
		   		if(arr[index]>arr[j] && lis[index]<=lis[j])
		   			lis[index]=lis[j]+1;
		   		j+=1;
		   	}
		   	
		   	if(maxIncreasingSubsequenceValue<lis[index])
		   		maxIncreasingSubsequenceValue = lis[index];
		   	index+=1;
		}
		
		return maxIncreasingSubsequenceValue;
	}
}
public class IncreasingSubsequence {

	public static void main(String[] args) {
		
		System.out.println("Find Longest Increasing subsequence from a given array");
		Scanner sc = new Scanner(System.in);
		Longestincreasingsubsequence lis = new Longestincreasingsubsequence();
        
		System.out.print("Enter array Length : ");
		int size = sc.nextInt();// Reading array length from user
		int[] array = new int[size];
		for(int i=0;i<size;i+=1)
		{
			System.out.print("Enter element "+(i+1)+" : ");
			int num = sc.nextInt();// reading elements of the array from the user one by one
			array[i]=num;
		}
		
		System.out.println("length of Longest Increasing subsequence from given array is "+lis.findLongestIncreasingSubsequence(array));// calling and lis() method of LIS class to display the length of longest increasing subsequence of the provided array
		
	}

}