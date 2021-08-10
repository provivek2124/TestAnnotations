package Package1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	

	@Test
	public void method1() {
		System.out.println("Package1Class1Method1");
	}
	
	@Test
	public void method2() {
		System.out.println("Package1Class1Method2");
	}
	
	@Test
	public void method3() {
		System.out.println("Package1Class1Method3");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This will get executed first. This is beforetest");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This will get executed after beforetest");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("This will be executed after execution of Package1class3method3");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This will be executed after execution of Package1class1Method3");
	}
	
	
}
