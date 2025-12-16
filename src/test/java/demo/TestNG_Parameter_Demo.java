package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter_Demo {
	
	@Test
	@Parameters({"My name"})
	public void test(@Optional("Vimalraj") String name) {
		System.out.println("Name is: " + name);
	}

}
