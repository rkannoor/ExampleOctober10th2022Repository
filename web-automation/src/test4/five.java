package test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class five {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchBrowser();
		navigation11();
		sgtesting();
		
	}
	



private static void launchBrowser() {

	try
	{
		System.setProperty("webdriver.chrome.driver","E:\\EXAMPLEAUTOMATION\\AUTOMATION\\web-automation\\library\\drivers\\chromedriver.exe");
		oBrowser = new ChromeDriver();
		oBrowser.manage().window().maximize();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigation11()
{
	try
	{
		oBrowser.get("https://www.amazon.in/");
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void sgtesting()
{
	try
	{
		oBrowser.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[12]")).click();
		Thread.sleep(2000);
		//oBrowser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click(); 
		//Thread.sleep(3000);
		//oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/form/div/input[2]")).sendKeys("Rsk@1991");
		//Thread.sleep(3000);
		//oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/form/div/button")).click();
		
		//Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
