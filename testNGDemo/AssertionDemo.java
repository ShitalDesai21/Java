package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void hardAssertion() 
  {
	  String act="Selenium WebDriver is a webUI automation tool ";
	  
	  String exp="Selenium WebDriver is a webUI automation library ";
	  
	  //Assert.assertEquals(act, exp);
	  
	  Assert.assertFalse(act.contains("Library"));
	  
	  System.out.println("Hard assertion Demo is copleted");
	  
	}
  @Test
  public void softAssertion() 
  {
	  SoftAssert sf=new SoftAssert();
	   
	  int num1=90 ; int num2=190;
	  
	  sf.assertEquals(num1, num2);
	  System.out.println("softAssertion Demo is completed");
	  sf.assertAll();
	  
	  
	  
	  
	  
	  
  }
}
