package delllive_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dell_POM 
{
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void url(WebDriver driver)
	{
 		driver.get("https://www.dell.com/dci/idp/dwa/authorize?response_type=id_token&client_id=228467e4-d9b6-4b04-8a11-45e1cc9f786d&redirect_uri=https://www.dell.com/identity/global/in/228467e4-d9b6-4b04-8a11-45e1cc9f786d&scope=openid&code_challenge=E9Melhoa2OwvFrEMTJguCHaoeK1t8URWbuGJSstw-cM&code_challenge_method=S256&tag=cid%3dcd2b5dd5-6d9b-4663-92f3-cfad4aff3c94%2caid%3d581dcef7-fa9d-4b20-992c-82aecefb4417&state=aHR0cHM6Ly93d3cuZGVsbC5jb20vSWRlbnRpdHkvZ2xvYmFsL2luL2NkMmI1ZGQ1LTZkOWItNDY2My05MmYzLWNmYWQ0YWZmM2M5ND9jPWluJmw9ZW4mcj1hcCZzPWRocyZjcz1pbmRoczEmcmVkaXJlY3RVcmw9aHR0cHM6JTJGJTJGd3d3LmRlbGwuY29tJTJGZW4taW4lMkZzaG9wJTJGZGVhbHMlMkZsYXB0b3AtZGVhbHMlM0ZnYWNkJTNEMTA0MTU5NTMtOTAxNi01NzYxMDQwLTI4NTk4MTM1Ni0wJmRnYz1TVCZnY2xpZD1DajBLQ1Fqd2w3cVNCaEQtQVJJc0FDdlYxWDEzV1pNN1I3anR4c2N0aU1MdE92OW1XeTZLRW8zZ0k1RWpCRlc3TmVNVVpBa0hzX2RGTjNVYUFzSTVFQUx3X3djQiZnY2xzcmM9YXcuZHMmbmNsaWQ9N1Z1WTdDWnBpQXJyeDJGenJhQk1adkFkSzhlUVBPcUtLNnpBaGd4TXFuY3NQVDNHekNxU2V0QXlTRlZxX0F6QSZwbj1Mb2dpbk9yUmVnaXN0ZXI%3d");
	}
	public void EMail(WebDriver driver, String usn)
	{
		driver.findElement(By.xpath("//*[@id=\"SignInModel_EmailAddress\"]")).sendKeys(usn);
	}
	public void passWord(WebDriver driver, String pwd)
	{
		driver.findElement(By.xpath("//*[@id=\"userPwd_UserInputSecret\"]")).sendKeys(pwd);
	}
	public void SigninButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"btnSignIn\"]")).click();
	}
	public void MyAccountButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[3]/div/a/span")).click();
	}
	public void SignOutButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/a")).click();
	}
	public void closeBrowser(WebDriver driver) 
	{
		driver.close();
	}

	public static void main(String[] args) 
	{
		

	}

}
