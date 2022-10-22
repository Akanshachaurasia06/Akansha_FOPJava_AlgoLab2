package Lab2;

import java.util.Scanner;

public class Denominations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int size = sc.nextInt();
		int arr[]= new int[size];
		int count[] = new int[size];
       System.out.println("enter the currency denominations value");
       for(int i= 0;i<size;i++) {
    	   arr[i]= sc.nextInt();
       }
       System.out.println("enter the amount you want to pay");
       int amount = sc.nextInt();
       System.out.println("Your payment approach in order to give min no of notes will be");
      for(int i=0;i<size;i++)
      {
    	  if(amount>=arr[i]) {
    		  count[i] = amount/arr[i];
    		  amount = amount - count[i]*arr[i];
      }
      }
      for (int j=0;j<size;j++) {
    	  
    	  System.out.println(arr[j]+":"+count[j]);
      }
	}

}
