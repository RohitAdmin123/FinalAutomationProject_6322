package delllive_Project;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Modules 
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
	
    @Test (priority = 1)
      public void Login() throws InterruptedException 
      {
    	//URL
    	driver.get("https://www.dell.com/en-in/shop/deals/laptop-deals?gacd=10415953-9016-5761040-285981356-0&dgc=ST&gclid=Cj0KCQjwl7qSBhD-ARIsACvV1X13WZM7R7jtxsctiMLtOv9mWy6KEo3gI5EjBFW7NeMUZAkHs_dFN3UaAsI5EALw_wcB&gclsrc=aw.ds&nclid=7VuY7CZpiArrx2FzraBMZvAdK8eQPOqKK6zAhgxMqncsPT3GzCqSetAySFVq_AzA");
 		Thread.sleep(2000);
 		
		//Sign in Button
		driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[3]/div/a/span")).click();
		Thread.sleep(2000);
		
		//Sign in
		driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[3]/div/div[2]/div/div[3]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
	    //Email Address
  	    driver.findElement(By.xpath("//*[@id=\"SignInModel_EmailAddress\"]")).sendKeys("rohitbhagat3110@gmail.com");
  	    Thread.sleep(2000);
  	
  	    
  	    //Password
  	    driver.findElement(By.xpath("//*[@id=\"userPwd_UserInputSecret\"]")).sendKeys("Rohit@123");
  	    Thread.sleep(2000);
  	
  	    //sign in button
  	    driver.findElement(By.xpath("//*[@id=\"btnSignIn\"]")).click();
		Thread.sleep(2000);

	  
      }
    
    @Test (priority = 2)
      public void SmokeTesting() throws InterruptedException 
    {
    	//Step 1: Create Object Of Actions Class
        Actions a= new Actions(driver);
        
        //Step 2: Create Object Of List With WebElement
        List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li"));
        
        //Step 3: Store Size Of List        
        int listSize=ls.size();
        System.out.println("No. Of Modules: "+listSize);
        
        //Step 4: For Loop
        for(int i=1; i<=listSize; i++)
        {
        	//Wait
        	Thread.sleep(2000);
        	
        	//Display Module'Name
        	System.out.println(driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li["+i+"]")).getText());
        	
        	//Perform Mouse Hover
        	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li["+i+"]"))).click().perform();
        	
        }
      }
      
      //@Test (priority = 3)
      public void AboutUS() throws InterruptedException 
      {
      	driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[8]/a/span")).click();
      	Thread.sleep(2000);
      	
      	driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[8]/ul/li[3]/a")).click();
      	Thread.sleep(2000);
      	
      	driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[8]/ul/li[3]/ul/li[3]/a")).click();
      	Thread.sleep(2000);
      	
      	driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/div[2]/div/div/div/div[2]/ul/li/a/div/span")).click();
      	Thread.sleep(2000);

      }
      
     // @Test (priority = 4)
      public void Solution() throws InterruptedException 
      {
    	  driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/a")).click();
      	  Thread.sleep(2000);
    	  
      	  driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[3]/a")).click();
      	  Thread.sleep(2000);
      	
    	  driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/ul/li[1]/div/div[1]/a/div/div")).click();
    	  Thread.sleep(2000);
    	
    	  driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/ul/li[2]/div/div[1]/a/div/div")).click();
    	  Thread.sleep(2000);
    	  
    	  driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/ul/li[3]/div/div[1]/a/div/div")).click();
    	  Thread.sleep(2000);
    	  
    	  driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/ul/li[4]/div/div[1]/a/div/div")).click();
    	  Thread.sleep(2000);
    	  
    	  driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/ul/li[5]/div/div[1]/a/div/div")).click();
    	  Thread.sleep(2000);
    	  
    	  driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/ul/li[6]/div/div[1]/a/div/div")).click();
    	  Thread.sleep(2000);  
      }
      
     // @Test (priority = 5)
       public void ContactUS() throws InterruptedException 
       {
       	 driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[1]/div/a/span/span")).click();
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"webparts\"]/div/div/div/ul/li[1]/a")).click();
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"webparts\"]/div/div/div/ul/li[2]/a")).click();
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"webparts\"]/div/div/div/ul/li[3]/a")).click();
      	 Thread.sleep(2000);
      	 
      	 driver.findElement(By.xpath("//*[@id=\"webparts\"]/div/div/div/ul/li[4]/a")).click();
     	 Thread.sleep(2000);
     	 
     	 driver.findElement(By.xpath("//*[@id=\"webparts\"]/div/div/div/ul/li[2]/a")).click();
    	 Thread.sleep(2000);
     	
       	 driver.findElement(By.xpath("//*[@id=\"in-en-dhs-indhs1-fcca82af-9bb0-4ca0-a440-2bbb2a2cf418-callback-csb27-in\"]/div/div[2]/div/a")).click();
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[1]/input")).sendKeys("Rohit");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[2]/input")).sendKeys("Bhagat");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[3]/input")).sendKeys("rohitbhagat@gmail.com");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[4]/input")).sendKeys("8262032800");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[5]/input")).sendKeys("Edubridge");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[6]/div/input")).sendKeys("1-25");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[7]/div/input")).sendKeys("INDIA");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[8]/div/input")).sendKeys("Immediately");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[1]/div[9]/div/textarea")).sendKeys("Yes");
       	 Thread.sleep(2000);
       	 
       	 driver.findElement(By.xpath("//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/form/div[2]/div[4]/button/div/span[1]")).click();
       	 Thread.sleep(2000);
       }
      
   // @Test (priority = 6)
    public void FindAStore() throws InterruptedException 
    {
    	driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[7]/a")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/div[4]/div/a")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"search_input\"]")).sendKeys("Baramati");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/div[2]/button[2]/img")).click();
    	Thread.sleep(2000);
  
    }
    
    //@Test (priority = 7)
    public void Products() throws InterruptedException 
    {
    	driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[4]/a")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[4]/ul/li[4]/a")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"icc-c587509win8\"]/section[1]/h3/a")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/main/section[2]/div[1]/div[1]/div[2]/div[8]/div[2]/a")).click();
    	Thread.sleep(2000);
    	
    }
    
   // @Test (priority = 8)
      public void Logout() throws InterruptedException 
      {
    	 //Account Button
    	 driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[3]/div/a/span/span[1]")).click();
    	 Thread.sleep(2000);
    	 
    	 //Signout Button
    	 driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/a")).click();
    	
      }
  

    @AfterTest
      public void afterTest() 
      {
    	driver.close();
      }

}
