import java.io.*;
import java.util.Scanner;

//Define the Class
public class addMatrix
{
      
	
 	
	public  static void main(String args[])
	  {

	  	int arr[][]=new int[2][2];
        int arr1[][]=new int[2][2];
		int sum[][]=new int[2][2];

		Scanner in = new Scanner(System.in);
        System.out.println("Enter the array 1 elements");	
        	for (int i=0;i<2 ;i++) {
	  		for (int j=0;j<2;j++) {
	  			arr[i][j]=in.nextInt();
	  			}
	  		
	  		
	  	}
	  	System.out.println("Enter the array 2 elements");	
        	for (int i=0;i<2 ;i++) {
	  		for (int j=0;j<2;j++) {
	  			arr1[i][j]=in.nextInt();
	  			}
	  		
	  		
	  	}
      System.out.println("Array 1 elements are:");
      	for (int i=0;i<2 ;i++) {
	  		for (int j=0;j<2;j++) {
	  			System.out.print(arr[i][j]+"  ");
	  			
	  		}
	  		System.out.println();
	  		
	  	}

      System.out.println("Array 2 elements are:");
      	for (int i=0;i<2 ;i++) {
	  		for (int j=0;j<2;j++) {
	  			System.out.print(arr1[i][j]+"  ");
	  			
	  		}
	  		System.out.println();
	  		
	  	}

        for (int i=0;i<2 ;i++)
         {
	  	             for (int j=0;j<2;j++) 
	  	             {

	  			          sum[i][j]=arr[i][j]+arr1[i][j];
                   }
         }

                System.out.println("Sum Matrix is:");
             for (int i=0;i<2 ;i++)
              {
	  		         for (int j=0;j<2;j++)
	  		          {
	  			          System.out.print(sum[i][j]+"  ");
	  			
	  		          }
	  		           System.out.println();
	  		
	  	      }
	  	       


	  }


}