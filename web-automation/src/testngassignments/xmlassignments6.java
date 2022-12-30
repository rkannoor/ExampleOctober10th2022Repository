package testngassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class xmlassignments6 {
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
    @Test(priority = 5)
    private static void newcustomer() {
		try {
		  String expected,actual;
		  expected="RAJANIKANTH";
			oBrowser.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("RAJANIKANTH");
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='RAJANIKANTH ']"));
			actual=oEle.getText();
			Assert.assertTrue(expected.contains(actual));
			
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    @Test(priority = 6)
    private static void createpoject(){
		try
		{
			String expected,actual;
			expected="AUTOMATION TESTING";
			
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("AUTOMATION TESTING");
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(4000);
			WebElement cp=oBrowser.findElement(By.xpath("//div[text()='AUTOMATION TESTING']"));
			actual=cp.getText();
			Assert.assertEquals(expected, actual);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    @Test(priority = 7)
	private static void deleteproject() {  
		try
		{
			String expected,actual;
			expected="AUTOMATION TESTING";
		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
		//Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
		Thread.sleep(2000);

		oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
		Thread.sleep(3000);
		WebElement at=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]"));
		actual=at.getText();
		Assert.assertNotEquals(expected, actual);
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}   
	}
     @Test(priority = 8)
	private static void deletecustomer() {
		try
		{
			String expected,actual;
			  expected="RAJANIKANTH";
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]"));
			actual=oEle.getText();
			Assert.assertNotEquals(expected,actual);
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    @Test(priority = 9)
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
  @Test(priority = 10)
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


