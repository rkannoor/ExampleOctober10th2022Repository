package selenium.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
public static WebDriver oBowser=null;
	public static void main(String[] args) {
		
		launchapplication();
		navigation();
		login();
		minimize();
		newcustomer();
		modifycustomer();
		deletecustomer();
		logout();
       closeapplication();
		
		
	}

	public static void launchapplication() {
		try
		{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	oBowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigation()
	{
		try
		{
			oBowser.get("http://localhost:81/login.do");
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
			oBowser.findElement(By.id("username")).sendKeys("admin");
			oBowser.findElement(By.name("pwd")).sendKeys("manager");               
			oBowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize() {
		try{
			oBowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);

		}catch(Exception e) {
			e.printStackTrace(); 
		}

	}
	private static void newcustomer() {
		try
		{
			oBowser.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td[3]/a/div[2]")).click();
			oBowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBowser.findElement(By.id("customerLightBox_nameField")).sendKeys("RAJANIKANTH");
			oBowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifycustomer() {
		try
		{
			oBowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("customer modification");
			//oBowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(5000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer() {
		try
		{
			oBowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[4]/div/div[3]/div")).click();
			oBowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout() {
		try
		{
			oBowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication() {
		try
		{
			oBowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



