package TestNG;

import org.testng.annotations.Test;

public class SetTestCaseOrder_Priority {
  @Test (priority=2)
  public void testCaseLoging() {
	  System.out.println("tetsCaseLogin is executed successfully");
  }
  @Test(priority=1)
  public void testCaseSignUp() {
	  System.out.println("TestCaseSignup is executed successfully");
  }
  @Test(priority=3)
  public void TestCaseDeletion() {
	  System.out.println("testCaseCreation is executed successfully");
  }
  @Test(priority=5)
  public void TestCaseCreation() {
	  System.out.println("TestCaseCreation is executed successfully");
  }
}
