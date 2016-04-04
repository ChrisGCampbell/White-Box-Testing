package edu.gatech.seclass;

public class FaultyClass {
	
	//Method1
	public void method1(int x, int y) 
	{
		int a = x;
		int b = y;
		int result; 
		if (a > 0 || b > 0){
			result = a/b;
		}
		
		else if (a == 0){
			result = a;
		}
		
	}
	
	public void method2(int x, int y)
	{
		int a = x;
		int b = y;
		int result;
		
		if (a != 0)
		{
			b--;
			result = a/b;
		}
		
		else if (y > 2)
		{
			y = y+3;
		}
	}
	
	public void method3(int x)
	{
		int a = 10;
		int b = x;
		
	    if ( (b > a) && (a > 10) )
	    	b = 10/(1-1); 
	}
	
	public void method4()
	{
		// Creating such a method is not possible
		// Branch coverage covers statement coverage.
		// If the fault is revealed in the statement coverage the fault
		// will also be revealed in the branch coverage.
	}

}
