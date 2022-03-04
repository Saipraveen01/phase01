package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileOperations {

	static void append()
	{
		BufferedWriter bufferedWriterObject = null;
		// Creating Scanner instance
		Scanner sc = new Scanner(System.in);
		try {
			// creating BufferedWriter instance
			bufferedWriterObject = new BufferedWriter(new FileWriter("Names.txt",true));
			System.out.print("Enter how many names you want to append to the file : ");
			int num=sc.nextInt(),count=1;
			sc.nextLine();
			while(true)
			{
				if(count==num+1)
					break;
			     System.out.print("Enter Name "+count+" : ");
			  // Reading Names from user
			     String name = sc.nextLine();
			  // Appending Names into the file entered by user, one after the other 
			     bufferedWriterObject.write(name);
			     bufferedWriterObject.newLine();
			     count+=1;
			}
			bufferedWriterObject.flush();
			System.out.println("Appended new names to your existing file");
		} 
		catch (IOException e) 
		{
			System.out.println("An IOException has occured");
		}
		finally
		{
			try {
				// Closing BufferedWriter Resource
				bufferedWriterObject.close();
			} catch (IOException e) {
				System.out.println("An IOException has occured");

			}
		}
	}
	
	public static void main(String[] args) {
		// Creating Scanner instance
        Scanner sc = new Scanner(System.in);
        PrintWriter printWriterObj=null;
        BufferedReader bufferedReaderObj=null;
        try
        {
        	//Creating PrintWriter instance 
	        printWriterObj = new PrintWriter("Names.txt");
			System.out.print("How Many Names you want to add: ");
	        int num=sc.nextInt(),count=1;
	        sc.nextLine();
	        while(true)
	        {
	           if(count==num+1)
	        	   break;
	           System.out.print("Enter Name "+count+" : ");
	        // Reading Names from user
	           String name=sc.nextLine();
	        // Writing to the file the name which is entered by the user
	           printWriterObj.println(name);
	           count+=1;
	        }
	        printWriterObj.flush();
	        System.out.println("Names has been added successfully....");
	        bufferedReaderObj=new BufferedReader(new FileReader("Names.txt"));// creating BufferedReader instance
	        System.out.println("Your List of Names are : ");
	        Thread.sleep(3000);
	        String names =  bufferedReaderObj.readLine();//Fetching 1st name from the file
	        while(names!=null)
	        {
	        	System.out.println(names);// printing  the names fetched from the file line by line  
	        	names= bufferedReaderObj.readLine();// Fetching names from the file line by line
	        }
	        System.out.print("Do you want to append some more names to your list?");
	        first:while(true) {
	        System.out.print("Press , Y or N : ");
	        String choice = sc.nextLine().toLowerCase();// Reading user's choice
	        
		        switch(choice)
		        {
		           case "y":append();// calling append method
		                    System.out.println("Your Updated List of Names are as follows: ");
		                    Thread.sleep(3000);
		                    bufferedReaderObj=new BufferedReader(new FileReader("Names.txt"));// creating BufferedReader instance
		                    names =  bufferedReaderObj.readLine();//Fetching 1st name from the file
		        	        while(names!=null)
		        	        {
		        	        	System.out.println(names);// printing  the names fetched from the file line by line 
		        	        	names= bufferedReaderObj.readLine();// Fetching names from the file line by line
		        	        }
		                    break first;
		           
		           case "n":System.out.println("Thank you");
		                    break first;
		                    
		           default:System.out.println("Please enter a valid choice !!");
		           
		        }
	        }
        }
        catch(IOException ie)
        {
        	System.out.println("An IOExcaption has occured");
        }
        catch(InterruptedException ie)
        {
        	System.out.println("An InterruptedException has occured");
        }
        catch(InputMismatchException ie)
        {
        	System.out.println("Enter a valid input !!");
        }
        finally
		{
			try {
				bufferedReaderObj.close();// Closing BufferedReader Resource
				printWriterObj.close(); // Closing PrintWriter Resource
			} 
			catch (IOException e) {
				System.out.println("An IOException has occured");

			}
			catch(NullPointerException npe)
			{
				System.out.println("NullpointerException has occcured");
			}
		}
	}

}