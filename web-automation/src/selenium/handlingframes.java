package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingframes {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		// handlingFrames();
	}
		private static void launchBrowser()
	
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\EXAMPLEAUTOMATION\\AUTOMATION\\web-automation\\library\\selenium\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		private static void navigate()
		{
			try
			{
				oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
				Thread.sleep(5000);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		private static void handlingFrames()
		{
			try
			{
				oBrowser.switchTo().frame(0);
				oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
				Thread.sleep(2000);
				oBrowser.switchTo().defaultContent();
				Thread.sleep(2000);
				oBrowser.switchTo().frame("packageFrame");
				oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
				Thread.sleep(2000);
				oBrowser.switchTo().defaultContent();
				Thread.sleep(2000);
				WebElement oEle=oBrowser.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
				oBrowser.switchTo().frame(oEle);
				String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
				System.out.println(content);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}


	
