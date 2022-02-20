package com.junitTest;

public class MyMath {
	
	
	public int sum(int ar[])
	{
		int sum=0;
		for(int x: ar)
		{
			sum=sum+x;
		}
		
		return sum;
	}

}
