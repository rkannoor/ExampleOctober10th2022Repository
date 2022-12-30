package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class six {
	public static WebDriver driver=null;
	public static ActiTimePage opage=null;
	public static void main(String[] args) {




		launchbrowseR();
		navigatioN();
		logiN();
		minimizE();
		addcustomeR();
		createproject();
		deleteproject();
		deletecustomeR();
		logouT();
		closeapplicatioN();

	}



	private static void launchbrowseR() {

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
	private static void navigatioN()
	{
		try
		{
			driver.navigate().to("http://localhost:81/login.do");
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logiN()
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
	private static void minimizE() {
		try{
			opage.getFlyOutWindow().click();
			Thread.sleep(4000);

		}catch(Exception e) {
			e.printStackTrace(); 
		}

	}
	private static void addcustomeR() {
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
	private static void createproject() {
		try
		{
			opage.clickontaskforaddingcustomer().click();
			Thread.sleep(3000);
			opage.clickonaddnewCUSTOMER().click();
			Thread.sleep(3000);
			opage.clickonNEWPROJECT().click();
			Thread.sleep(3000);
			opage.ENTERNEWPROJECT().sendKeys("demoproject");
			Thread.sleep(5000);
			opage.createprojectbutton().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void deleteproject(){
		try

		{
			opage.clickonprojectsettingbutton().click();
			Thread.sleep(3000);
			opage.clickonprojectactionsbutton().click();
			Thread.sleep(3000);
			opage.clickonprojectdeletebutton().click();
			Thread.sleep(3000);
			opage.clickonprojectdeletepermanently().click();
			Thread.sleep(3000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void deletecustomeR(){
		try

		{

			opage.clickononCUSTOMERbutton().click();
			Thread.sleep(3000);
			opage.clickononCUSTOMERactionsbutton().click();
			Thread.sleep(3000);
			opage.clickonCUSTOMERdeletebutton().click();
			Thread.sleep(3000);
			opage.deletepemanentlycustomerbutton().click();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void logouT(){
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
	private static void closeapplicatioN() {
		try
		{
			driver.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}







