package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationList {
  @BeforeSuite
  public void f1() {
  }
  @BeforeTest
  public void f2() {
}
  @BeforeClass
  public void f3() {
  }
  @BeforeMethod
  public void f4() {
  }
  @Test
  public void f5() {
  }
  @AfterMethod
  public void f6() {
  }
  @AfterClass
  public void f7() {
  }
  @AfterTest
  public void f8() {
  }
  @AfterSuite
  public void f9() {
  }
}