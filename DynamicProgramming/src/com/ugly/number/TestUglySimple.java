package com.ugly.number;

import java.util.Scanner;

public class TestUglySimple {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=getNthUgly(n);
	}

	private static int getNthUgly(int n) {
	int count=1;
	int i=1;
	while(count<=n)
	{
		i++;
		if(isUgly(i))
		{
			count++;
		}
		
	}
		return i;
	}

	private static boolean  isUgly(int no) {
		
		no=maxDivide(no,2);
		no=maxDivide(no,3);
		no=maxDivide(no,5);
		return true;
	}

	private static int maxDivide(int no, int i) {
		while(no%i==0)
		{
			no=no/i;
		}
		 return (no == 1)? 1 : 0; 
	}

}
