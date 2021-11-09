package com.bridgelabz.linecomparison;

import java.util.*;

public class LineComparison {

	public static void main(String[] args) {
		
		int x1,x2,y1,y2;
		double dis;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point:");
		x1 = sc.nextInt();
		System.out.println("Enter y1 point:");
		y1 = sc.nextInt();
		System.out.println("Enter x2 point:");
		x2 = sc.nextInt();
		System.out.println("Enter y2 point:");
		y2 = sc.nextInt();
		dis = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")==>"+dis);
	}

}