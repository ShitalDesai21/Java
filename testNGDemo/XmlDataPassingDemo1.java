package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class XmlDataPassingDemo1
{
  @Parameters({"un","psw"})
  @Test
  public void loginData(String un, String psw) 
  {
	System.out.println("Username is :" +un);
	
	System.out.println("Password is:"+psw);
  }
}
