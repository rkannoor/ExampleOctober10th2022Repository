package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowserdemo {
	public static WebDriver oBrowser=null;
	

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeapplication();
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
private static void navigate()
{
	try
	{
		oBrowser.get("https://www.cricbuzz.com/");
		Thread.sleep(0);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void closeapplication()
{
	try
	{
		oBrowser.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
