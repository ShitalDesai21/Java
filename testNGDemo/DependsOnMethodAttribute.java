package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodAttribute {
  @Test(priority=1)
  
  public void register() 
  {
	  System.out.println("User is able to register");
	 AssertJUnit.assertEquals(20, 200);
  }
  @Test(priority=2,dependsOnMethods="register") 
  public void login()
  {
	System.out.println("User is able to login");
	
  }
  @Test(priority=3)
  public void search() 
  {
   System.out.println("User is able to search");
  
}
}
