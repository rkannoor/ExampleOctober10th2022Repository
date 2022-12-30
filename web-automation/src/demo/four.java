package demo;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class four {
	public static WebDriver driver=null;
	public static ActiTimePage opage=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchbrowser();
		navigation();
		login();
		minimize();
		addcustomer();

		deletecustomer();
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
	private static void addcustomer() {
		try
		{
			opage.clickontaskforaddingcustomer().click();
			Thread.sleep(3000);
			opage.clickonaddnewCUSTOMER().click();
			Thread.sleep(3000);
			opage.clickonNEWCUSTOMER().click();
			Thread.sleep(3000);
			opage.ENTERnewcustomer().sendKeys("airtel");
			opage.clickonCREATEcustomer().click();

			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}


	private static void deletecustomer(){
		try

		{
			opage.clickononCUSTOMERbutton().click();
			Thread.sleep(3000);
			opage.clickononCUSTOMERactionsbutton().click();
			Thread.sleep(3000);
			opage.clickonCUSTOMERdeletebutton().click();
			opage.deletepemanentlycustomerbutton().click();
			Thread.sleep(3000);
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




