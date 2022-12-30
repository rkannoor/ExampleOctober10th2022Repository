package testngassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class xmlassignment2 {

		public static WebDriver oBrowser=null;

	    @Test(priority = 1)
		private static void launchbrowser() {

			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLEAUTOMATION\\AUTOMATION\\web-automation\\library\\selenium\\drivers\\chromedriver.exe");
				oBrowser = new ChromeDriver();
				Thread.sleep(3000);
				Assert.assertNotNull(oBrowser);
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	    @Test(priority = 2)
		private static void navigation()
		{
			try
			{
				String expected,actual;
				expected="actiTIME - Login";
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(5000);
				actual=oBrowser.getTitle();
				Assert.assertEquals(expected, actual);
				Thread.sleep(3000);
			}catch (Exception e) {
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
				String expected,actual;
				expected="Getting Started Shortcuts";
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
				WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
				actual=oEle.getText();
				Assert.assertTrue(expected.contains(actual));
				Thread.sleep(3000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	     
	     @Test(priority = 5,dataProvider="users")
	 	private static void addnewUser1(String fname,String lastName,
	 		String email,String userName,String pwd,String reTypePwd) {
	 		try
	 		{
	 			String expected,actual;
	 			expected="user1, demo";
	 			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
	 			Thread.sleep(5000);
	 			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
	 			Thread.sleep(3000);
	 			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
	 			oBrowser.findElement(By.name("lastName")).sendKeys(lastName);
	 			oBrowser.findElement(By.name("email")).sendKeys(email);
	 			oBrowser.findElement(By.name("username")).sendKeys(userName);
	 			oBrowser.findElement(By.name("password")).sendKeys(pwd);
	 			oBrowser.findElement(By.name("passwordCopy")).sendKeys(reTypePwd);
				oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
				Thread.sleep(5000);
				
				WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"));
				actual=oEle.getText();
				Assert.assertTrue(expected.contains(actual));
				Thread.sleep(3000);

			
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}



	 @Test(priority = 6)
		private static void modify() {
			try
			{
				String expected,actual;
				expected="user1, demonewuser";
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				
				
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("newuser");
				//oBrowser.findElement(By.xpath("//*[@id=\'ext-gen226\']/tbody/tr[2]/td/table/tbody/tr[5]/td[5]/a/em/span")).click();
				//oBrowser.findElement(By.xpath("//*[@id=\'ext-gen262\']")).click();
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(5000);
				WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"));
				actual=oEle.getText();
				Assert.assertTrue(expected.contains(actual));
				Thread.sleep(3000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
	  @Test(priority = 7)
		private static void deleteuser()
		{
			try
			{
				String expected,actual;
				expected="user1, demonewuser";
				oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Alert oAlert=oBrowser.switchTo().alert();
				Thread.sleep(2000);
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[2]/td[2]/div/a"));
				actual=oEle.getText();
				Assert.assertNotEquals(expected, actual);
				Thread.sleep(3000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority = 8)
		private static void logout() {
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
	@Test(priority = 9)
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
	@DataProvider(name="users")
	public Object[][] usersData()
	{
		return new Object[][] {{"demo","user1","demouser1@gmail.com","Demouser1","Welcome1","Welcome1"}};
	}

	}


