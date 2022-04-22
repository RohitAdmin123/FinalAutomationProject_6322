package delllive_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Registration 
{
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  {
		    System.setProperty("webdriver.chrome.driver","c:\\Users\\Ranjeet\\Documents\\Automation Testing\\Browser Extension\\chromeDriver.exe");
	        driver= new ChromeDriver();
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		  
	  }
     @Test
      public void Registration() throws InterruptedException 
     {
    	//URL
     	driver.get("https://www.dell.com/en-in/shop/deals/laptop-deals?gacd=10415953-9016-5761040-285981356-0&dgc=ST&gclid=Cj0KCQjwl7qSBhD-ARIsACvV1X13WZM7R7jtxsctiMLtOv9mWy6KEo3gI5EjBFW7NeMUZAkHs_dFN3UaAsI5EALw_wcB&gclsrc=aw.ds&nclid=7VuY7CZpiArrx2FzraBMZvAdK8eQPOqKK6zAhgxMqncsPT3GzCqSetAySFVq_AzA");
  		Thread.sleep(2000);
  		
  		//Sign in Button
  		driver.findElement(By.xpath("//*[@id=\"um-si-label\"]")).click();
  	    Thread.sleep(2000);
  		
  		//create account button
  		driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[3]/div/div[2]/div/div[3]/div[2]/a[2]")).click();
  		Thread.sleep(2000);
  		
  		//First name
  		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Rohit");
     	Thread.sleep(2000);
     	
     	//Last name
     	driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Bhagat");
     	Thread.sleep(2000);
     	
     	//Email Address
     	driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("rohitbhagat3110@gmail.com");
     	Thread.sleep(2000);
     	
     	//Password
     	driver.findElement(By.xpath("//*[@id=\"userPwd_UserInputSecret\"]")).sendKeys("Rohit@123");
     	Thread.sleep(2000);
     	
     	//create account button
     	driver.findElement(By.xpath("//*[@id=\"btnCreateAccount\"]")).click();
  		Thread.sleep(2000);
  		
       }
	
     @AfterTest
      public void afterTest() 
     {
    	 driver.close();	  
     }

}
