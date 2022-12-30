package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {
	public static WebDriver driver=null;
	public static ActiTimePage opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigation();
		login();
		minimize();
		addnewUser1();
		
		deleteuser1();
		logout();
		closeapplication();

	}

	private static void launchbrowser() {

		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			opage= new ActiTimePage(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigation()
	{
		try
		{
			driver.navigate().to("http://localhost:81/login.do");
			Thread.sleep(5000);
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
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize() {
		try{
			opage.getFlyOutWindow().click();
			Thread.sleep(4000);

		}catch(Exception e) {
			e.printStackTrace(); 
		}

	}
	private static void addnewUser1() {
		try
		{
			opage.addusers().click();
			opage.adduser().click();
			opage.firstname().sendKeys("user1");
			opage.lastname().sendKeys("demo1");
			opage.email().sendKeys("userdemo1@gmail.com");
			opage.username().sendKeys("userdemo1");
			opage.Password().sendKeys("welcome1");
			opage.Retypepassword().sendKeys("welcome1");
			opage.create().click();
            Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	
	private static void deleteuser1(){
		try

		{
			opage.clickonuser1().click();
			Thread.sleep(3000);
			opage.deleteuser1().click();
			
			Thread.sleep(5000);
			Alert oAlert=driver.switchTo().alert();
			Thread.sleep(2000);
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void logout(){
		try

		{
			opage.getLogout().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void closeapplication() {
		try
		{
			driver.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}




