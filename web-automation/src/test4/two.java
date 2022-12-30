package test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class two {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigation();
		weschoolslogoinbtn();
	}
	private static void launchBrowser() {

		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\EXAMPLEAUTOMATION\\AUTOMATION\\web-automation\\library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigation()
	{
		try
		{
			oBrowser.get("https://www.w3schools.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void weschoolslogoinbtn()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[3]/div[1]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[1]/div/div[2]/form/div[1]/div[2]/input")).sendKeys("rkannoor@gmail.com"); 
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[1]/div/div[2]/form/div[2]/div[2]/input")).sendKeys("9480409667");
			//Thread.sleep(3000);
			//oBrowser.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[1]/div/div[4]/div[1]/button/span")).click();
			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
