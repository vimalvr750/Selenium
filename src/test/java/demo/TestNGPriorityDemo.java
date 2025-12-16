package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("I am inside test1");
		
	}

	@Test
	public void test2() {
		System.out.println("I am inside test2");
		
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test3");
	}
}
