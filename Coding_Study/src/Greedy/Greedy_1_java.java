package Greedy;

import java.util.*;

public class Greedy_1_java {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] number = new int[n];
		for(int i=0;i<number.length;i++)
			number[i]=sc.nextInt();
		
		Arrays.sort(number);
		
		int count=1;
		
		for(int j=0;j<n;j++) {
			if(count<number[j]) break;
			count+=number[j];
		}
		System.out.println(count);
	}
}