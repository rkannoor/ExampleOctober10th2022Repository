package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxLoginLogout {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimize();
		addnewUser();
		deleteuser();
		
	// logout();
		// closeapp();
	}
	private static void launchbrowser() {
		try {
			obrowser=new FirefoxDriver();

		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate() {
		try{
			obrowser.get("http://localhost:81/login.do");

		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}
	private static void login() {

		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void minimize() {
		try{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);

		}catch(Exception e) {
			e.printStackTrace(); 
		}

	}
	private static void addnewUser() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			obrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			obrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("Demouser1");
			obrowser.findElement(By.name("password")).sendKeys("Welcome1");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			obrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(5000);
			//Alert oalert=obrowser.switchTo().alert();
			//oalert.accept();




		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void deleteuser() {
		try{
			obrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert=obrowser.switchTo().alert();
			Thread.sleep(2000);
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			obrowser.findElement(By.linkText("Logout")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapp()
	{
		try
		{
			obrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
		
	