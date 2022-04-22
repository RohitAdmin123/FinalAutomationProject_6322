package delllive_Project;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dell_DDT 
{
	 WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws InterruptedException
	  {
		 System.setProperty("webdriver.chrome.driver","c:\\Users\\Ranjeet\\Documents\\Automation Testing\\Browser Extension\\chromeDriver.exe");
		 driver=new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		  
	  }

	 @Test(dataProvider = "dp")
     public void Dell_DDT(String username, String password) throws InterruptedException 
     {
    	 Dell_POM o=new Dell_POM();
    	 o.url(driver);
    	 o.EMail(driver, username);
    	 o.passWord(driver, password);
    	 o.SigninButton(driver);
    	 Thread.sleep(2000);
    	 o.MyAccountButton(driver);
    	 Thread.sleep(2000);
    	 o.SignOutButton(driver);
     }
	 
	 @DataProvider
     public Object[][] dp() 
     {
       return new Object[][] 
       {
         new Object[] { "rohitbhagat3110@gmail.com", "Rohit@123" },
         new Object[] { "rohitbhagat3110@gmail", "Rohit" },
         new Object[] { "rohitbhagat@gmail.com", "R@123" },
         new Object[] { "rohitbhagat3110@gmail.com", "Rohit@123" },
         new Object[] { "rohitbhagat", "Rohit123" },
       };
    
     }
  
    @AfterTest
      public void afterTest() 
      {
    	driver.close();
	  
      }

}