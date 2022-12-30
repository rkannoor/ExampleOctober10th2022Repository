package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout {
	
	public static WebDriver driver=null;
	public static ActiTimePage opage=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		 minimizeFlyOutWindow();
		 logout();
		 closeApp();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLEAUTOMATION\\AUTOMATION\\web-automation\\library\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			driver.navigate().to("http://localhost:81/login.do");
			//driver.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			
		opage.getUserName().sendKeys("admin");
		opage.getPwd().sendKeys("manager");
		opage.getLogin().click();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			opage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			opage.getLogout().click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
	{
		try
		{
			driver.quit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}


