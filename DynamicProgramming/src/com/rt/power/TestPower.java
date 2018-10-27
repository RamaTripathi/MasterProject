package com.rt.power;

import java.util.Scanner;

public class TestPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float x=sc.nextFloat();
		int y=sc.nextInt();
		double res=calCulatePower(x,y);
	}

	private static double calCulatePower(float x, int y) {
	if(y==0)
		return 1;
	double  temp = Math.pow(x,y/2);
	if(y%2==0)
		return temp*temp;
	else
		return x*temp*temp;
	
	}

}
