package Lab2;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt(); //nooftrns
		int arr[] = new int[size];  // transarray
		System.out.println("enter the values of array");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetcount = sc.nextInt();
		System.out.println("enter the value of target");
		int targetvalue = sc.nextInt();
		int value=0;int count=0;boolean check=false;
		
		for(int i=0;i<targetcount;i++) {
			value+=arr[i];
			count++;
			if(value>=targetvalue) {
				 check = true;
				break;
			}
		}
		if(check == true) {
			System.out.println("Target achieved after "+count+" "
					+ "Transaction");
		}else {
			System.out.println("Target not achieved ");
		}
	}

}
