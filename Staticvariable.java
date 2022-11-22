package com.pack1;

public class Staticvariable 
{
	int a;
	static int b;
	Staticvariable()
	{
		a++;
		b++;
		System.out.println("Instance variable:"+a);
		System.out.println("Static variable:"+b);
	}
	public static void main(String[] args) 
	{
	new Staticvariable();
	System.out.println("-------------");
	new Staticvariable();
	System.out.println("-------------");
	new Staticvariable();
	System.out.println("---End ---");
	}
	}
