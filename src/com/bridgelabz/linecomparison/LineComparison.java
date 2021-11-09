package com.bridgelabz.linecomparison;

import java.util.*;

public class LineComparison {

	public static void main(String[] args) {
		
		int x1,x2,y1,y2,a1,a2,b1,b2;
		
		double dis1, dis2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first line Endpoints");
		System.out.println("Enter x1 point:");
		x1 = sc.nextInt();
		System.out.println("Enter y1 point:");
		y1 = sc.nextInt();
		System.out.println("Enter x2 point:");
		x2 = sc.nextInt();
		System.out.println("Enter y2 point:");
		y2 = sc.nextInt();
		System.out.println("Enter the second line Endpoints");
		System.out.println("Enter a1 point:");
		a1 = sc.nextInt();
		System.out.println("Enter b1 point:");
		b1 = sc.nextInt();
		System.out.println("Enter a2 point:");
		a2 = sc.nextInt();
		System.out.println("Enter b2 point:");
		b2 = sc.nextInt();
		dis1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		int a = (int)dis1;
		System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")==>"+dis1);
		dis2 = Math.sqrt(Math.pow(a2-a1, 2) + Math.pow(b2-b1, 2));
		int b = (int)dis2;
		System.out.println("distancebetween"+"("+a1+","+b1+"),"+"("+a2+","+b2+")==>"+dis2);
		System.out.println(a == b);
		
	}

}
