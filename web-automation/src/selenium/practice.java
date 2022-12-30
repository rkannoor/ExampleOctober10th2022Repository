package selenium;

import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		//navigate();
		//login();
		//logout();

	}
private static void launch()
{
	try
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try
	{
		oBrowser.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void login()
{
	try
	{
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8904028451");
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9740483655");
		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void logout()
{
	try
	{
		oBrowser.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).click();
		//oBrowser.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div/div[1]/div/div[2]/div[6]/div/span")).click();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
