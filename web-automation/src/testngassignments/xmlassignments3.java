package testngassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class xmlassignments3 {
	public static WebDriver oBrowser=null;
	@Test(priority = 1)
	private static void launch() {
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	private static void navigation()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 3)
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	private static void minimize() {
		try{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);

		}catch(Exception e) {
			e.printStackTrace(); 
		}

	}
	@Test(priority = 5)
	private static void user1() {
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("user1");
			oBrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority = 6)
	private static void user2() {
		try
		{
			//oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			//Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("user2");
			oBrowser.findElement(By.name("email")).sendKeys("demouser2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority = 7)
	private static void user3() {
		try
		{
			//oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
			oBrowser.findElement(By.name("lastName")).sendKeys("user3");
			oBrowser.findElement(By.name("email")).sendKeys("demouser3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome3");
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority = 8)
	private static void logout() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 9)
	private static void user1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
		
			
			Thread.sleep(5000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 10)
	private static void user1logout() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 11)
	private static void user2login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome2");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 12)
	private static void user2logout() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 13)
	private static void user3login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome3");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 14)
	private static void user3logout() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 15)
	private static void user1login2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
		
			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 16)
	private static void modifyuser1password() {
		try
		{
			
			oBrowser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
            oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		     Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcomeback1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcomeback1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			
		
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 17)
	private static void logoutasuser1() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 18)
	private static void user2login2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome2");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
			Thread.sleep(10000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 19)
	private static void modifyuser2password() {
		try
		{
			
			oBrowser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		    Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcomeback2");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcomeback2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			
		
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 20)
	private static void logoutasuser2() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 21)
	private static void user3login2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome3");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
			Thread.sleep(10000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 22)
	private static void modifyuser3password() {
		try
		{
			
			oBrowser.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("Welcomeback3");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("Welcomeback3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			
		
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 23)
	private static void logoutasuser3() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 24)
	private static void logiiuser1usingnewpassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeback1");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
			Thread.sleep(10000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 25)
	private static void logoutasuser1afterloginwithnewpassword() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 26)
	private static void loginasuser2usingnewpassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeback2");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
			Thread.sleep(10000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 27)
	private static void logoutasuser2afterloginwithnewpassword() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 28)
	private static void loginasuser3usingnewpassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomeback3");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			
			Thread.sleep(10000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 29)
	private static void logoutasuser3afterloginwithnewpassword() {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 30)
	private static void loginasadmin2ndtime(){
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			//oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			//Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	@Test(priority = 31)
	private static void ModifyPasswordodUseronetwothree2ndtime() {
		{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcomebackagain1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcomebackagain1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
			
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcomebackagain2");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcomebackagain2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);


			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcomebackagain3");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcomebackagain3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	@Test(priority = 32)
	private static void loginlogoutofUSERS() {
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomebackagain1");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			//Thread.sleep(3000);
			//oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);

	
			
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomebackagain2");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			//Thread.sleep(3000);
			//oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);

			
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcomebackagain3");               
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			//oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			//Thread.sleep(3000);
			//oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 33)
	private static void loginasadminlasttime(){
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");               
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(3000);
				//oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			//	Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		}
	@Test(priority = 34)
	private static void deleteuser1()
	{
		try
		{  oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert=oBrowser.switchTo().alert();
			Thread.sleep(2000);
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			
			oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert bAlert=oBrowser.switchTo().alert();
			Thread.sleep(2000);
			String content1=bAlert.getText();
			System.out.println(content1);
			bAlert.accept();
			Thread.sleep(2000);
			
			
			oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert cAlert=oBrowser.switchTo().alert();
			Thread.sleep(2000);
			String content2=cAlert.getText();
			System.out.println(content2);
			cAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 35)
	private static void logoutlast() {
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 36)
	private static void closeapplication() {
		try
		{
			oBrowser.quit();
			oBrowser=null;
			Thread.sleep(2000);
			Assert.assertNull(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
	
}



