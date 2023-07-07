package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class crossBrowserTest {
  @Test(priority=1,description= "This is Test case 1" )
  public void RegisterTest() 
  {
	  System.out.println("User is able to Ragister into Application");
	  }
 
  @Test (priority=2,description= "This is Test case 2",enabled=false )
  
  public void LoginTest() 
  {
	  System.out.println("User is able to Login into Application");
	  
  }
  @Test(priority=3,description= "This is Test case 3",invocationCount=2)
  public void searchTest()
  {
	  System.out.println("User is able to Search into Application");
  }
  @Test(priority=4,description= "This is Test case 4" )
  public void logoutTest() 
  {
	  System.out.println("User is able to Logout into Application");
  }
  
  
  
  

  
 
  
}
