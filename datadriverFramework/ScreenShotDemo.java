package datadriverFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import generic.Utility;

//import generic.Utility;

public class ScreenShotDemo {
  @Test
  public void capture() throws IOException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  Utility.screenShot(driver);
	  
	 /* TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File("./"+"\\ScreenShots\\Google"+System.currentTimeMillis()+".png");
	  
	  FileHandler.copy(temp, dest);
	  
	  System.out.println("Captured");*/
	 
	  
	  
	  
  }
}
