package TestNG;

import org.testng.annotations.Test;

public class SamleOne {
	int age =25;
  @Test
  public void TestCase1() {
	  System.out.println("hi");
  }
	  @Test
	  public void TestCase2() {
		  System.out.println("Iam test case2....");
		  System.out.println("age:"+age);
	  }
	  @Test
	  public void TestCase3() {
		  System.out.println("Iam test case3...");
		  System.out.println("age:"+age);
	  }
  }

