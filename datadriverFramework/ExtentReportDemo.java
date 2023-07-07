package datadriverFramework;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void report()
  {
	  ExtentReports extent=new ExtentReports();
	  
	  ExtentSparkReporter spark=new ExtentSparkReporter("./"+"\\TestReport\\spark.html");
	  
	  //Configuration
	  spark.config().setReportName("AutomationTestReport");
	  spark.config().setDocumentTitle("Sprint1 Report");
	  spark.config().setTheme(Theme.DARK);
	  //Attach Report to the ExtentReport Class
	  
	  
	extent.attachReporter(spark);
	
	
	 ExtentTest test=extent.createTest("Project Name");
	 
	 test.pass("TestCase is pass");
	 test.fail("TestCase is fail");
	 test.info("TestCase is Executing");
	 test.skip("TestCase is skipped");
	 
	 //Flush
	 extent.flush();
	 
	  

  }
}
