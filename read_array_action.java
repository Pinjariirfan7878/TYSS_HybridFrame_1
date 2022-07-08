package array_programmimg;

import java.util.Scanner;

public class read_array_action {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter array values");
		
		for(int i=0;i<=a.length-1;i++)
		{
			 a[i]= sc.nextInt();
		}
		
		
		
		
		
		
	}
}
