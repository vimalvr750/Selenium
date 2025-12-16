package demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTest"})
public class TestNG_Group_Demo {
	
	@Test(groups = {"Sanity"})
	public void test1() {
		System.out.println("This is test1");
		}
	
	@Test(groups = {"Sanity", "Smoke"})
	public void test2() {
		System.out.println("This is test2");
	}
	
	@Test(groups = {"windows.regression"})
	public void test3() {
		System.out.println("This is test3");
	}
	
	@Test(groups= {"linux.regression"})
	public void test4() {
		System.out.println("This is test4");
	}

}
