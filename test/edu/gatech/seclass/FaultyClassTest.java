package edu.gatech.seclass;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class FaultyClassTest {
	
	
	//////////////////////// Task 1 ////////////////////////////////////
	@Test
	public void method1SC() 
	{
		// This method achieves 100% statement coverage
		// The test suite is TC1(10,10), TC2(0,0)
		
		FaultyClass test = new FaultyClass();
		test.method1(10,10);
		test.method1(0,0);

	}

	
	@Test
	public void method1BC() 
	{
		// This method achieves 100% branch coverage
		// The test suite is TC1(10,10), TC2(0,0), TC3(-1,-1)
		
		FaultyClass test = new FaultyClass();
		test.method1(10,10); //if true branch covered
		test.method1(0,0); //if false branch covered and elseif true branch covered
		test.method1(-1,-1); //elseif false branch covered
		
	}

	
	
	@Test
	public void method1PC() 
	{
		// This method achieves 100% path coverage with fault revealed
		// The test suite is TC1(10,0), TC2(0,0), TC3(-1,-1)
		
		
		FaultyClass test = new FaultyClass();
		test.method1(10,0); // TC1(10,0) - If true path with fault revealed
		test.method1(0, 0);// TC2(0,0) - Elseif true path covered
		test.method1(0, 0);// TC3(-1,-1) - Elseif false path covered
	}
	
	///////////////////// Task2 ///////////////////////////////
	@Test
	public void method2PC() 
	{
		// This method achieves 100% path coverage of method2 and not reveal the fault
		// The test suite is TC1(1,2), TC2(0,3), TC3(0,-1)
		
		FaultyClass test = new FaultyClass();
		test.method2(1,2); // TC1(1,2) - If true path 
		test.method2(0, 3);// TC2(0,3) - Elseif true path covered
		test.method2(0, -1);// TC3(0,-1) - Not if and Not elseif covered
	}
	
	@Test
	public void method2SC() 
	{
		// This method achieves 100% statement coverage of method2 and not reveal the fault
		// The test suite is TC1(1,2), TC2(0,3)
		
		FaultyClass test = new FaultyClass();
		test.method2(1,2); // TC1(1,2) - If statement covered
		test.method2(0, 3);// TC2(0,3) - Elseif statement covered
	}
	
	@Test
	public void method2BC() 
	{
		// This method achieves 100% branch coverage, achieve 100% statement coverage, and not achieve 100%
		// path coverage and reveal the fault therein.
		// The test suite is TC1(1,1), TC2(0,3)
		
		FaultyClass test = new FaultyClass();
		test.method2(1,1); // TC1(1,1) - Fault revealed and if branch covered and if statement covered
		test.method2(0, 3);// TC2(0,3) - Elseif branch covered and elseif statement covered
		// Not achieve 100% path coverage because we dont include values for not if and not ifelse
	}
	

}
