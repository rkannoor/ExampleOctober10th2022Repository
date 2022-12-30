package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class three {
	public static WebDriver driver=null;
	public static ActiTimePage opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigation();
		login();
		minimize();
		addnewUser1();
		addnewUser2();
		addnewUser3();
		loginasuser1();
		loginasuser2();
		logout();
		loginasuser1tomodifypassword();
		modifyuser1password();
		 loginasuser1aftermodifypassword();
		loginasuser2tomodifypassword();
	 	modifypasswordinUSER2();
		loginasuser2aftermodifypassword();
		loginasuser3tomodifypassword();
		 modifypasswordinUSER3();
		 loginasuser3aftermodifypassword();
		 adminlogin();
		 modifypasswordsUSER123();
		 loginlogoutofall();
		 adminloginanddelete();

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
			driver.manage().window().maximize();
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
	private static void addnewUser2() {
		try
		{
			//opage.addusers().click();
			opage.adduser().click();
			opage.firstname().sendKeys("user2");
			opage.lastname().sendKeys("demo2");
			opage.email().sendKeys("userdemo2@gmail.com");
			opage.username().sendKeys("userdemo2");
			opage.Password().sendKeys("welcome2");
			opage.Retypepassword().sendKeys("welcome2");
			opage.create().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void addnewUser3() {
		try
		{
			//opage.addusers().click();
			opage.adduser().click();
			opage.firstname().sendKeys("user3");
			opage.lastname().sendKeys("demo3");
			opage.email().sendKeys("userdemo3@gmail.com");
			opage.username().sendKeys("userdemo3");
			opage.Password().sendKeys("welcome3");
			opage.Retypepassword().sendKeys("welcome3");
			opage.create().click();
			Thread.sleep(5000);
			opage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1() {
		try
		{
			opage.getUserName().sendKeys("userdemo1");
			opage.getPwd().sendKeys("welcome1");             
			opage.getLogin().click();
			Thread.sleep(5000);
			opage.clickonEXPLOREactime().click();
			Thread.sleep(5000);
			opage.getLogout().click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser2() {
		try
		{
			opage.getUserName().sendKeys("userdemo2");
			opage.getPwd().sendKeys("welcome2");             
			opage.getLogin().click();
			Thread.sleep(5000);
			opage.clickonEXPLOREactime().click();
			Thread.sleep(5000);	
		}catch(Exception e)
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
	private static void loginasuser1tomodifypassword() {
		try
		{
			opage.getUserName().sendKeys("userdemo1");
			opage.getPwd().sendKeys("welcome1");             
			opage.getLogin().click();
			Thread.sleep(5000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser1password() {
		try
		{
		  opage.clickONuserINuser1ACCOUNT().click();
		  opage.CLICKonUSER1().click();
		  opage.modifypasswordinuser1().sendKeys("welcomeback1");
			opage.retypemodifypasswordinuser1().sendKeys("welcomeback1");
			opage.getsavechanges1().click();
			opage.getLogout().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1aftermodifypassword() {
		try
		{
			opage.getUserName().sendKeys("userdemo1");
			opage.getPwd().sendKeys("welcomeback1");             
			opage.getLogin().click();
			opage.getLogout().click();
			Thread.sleep(3000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser2tomodifypassword() {
		try
		{
			opage.getUserName().sendKeys("userdemo2");
			opage.getPwd().sendKeys("welcome2");             
			opage.getLogin().click();
			Thread.sleep(6000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypasswordinUSER2() {
		try
		{
			opage.clickONuserINuser1ACCOUNT().click();
		
			opage.clickonuser2().click();
			opage.modifypasswordinuser1().sendKeys("welcomeback2");
			opage.retypemodifypasswordinuser1().sendKeys("welcomeback2");
			opage.getsavechanges1().click();
			opage.getLogout().click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser2aftermodifypassword() {
		try
		{
			opage.getUserName().sendKeys("userdemo2");
			opage.getPwd().sendKeys("welcomeback2");             
			opage.getLogin().click();
			opage.getLogout().click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser3tomodifypassword() {
		try
		{
			opage.getUserName().sendKeys("userdemo3");
			opage.getPwd().sendKeys("welcome3");             
			opage.getLogin().click();
			Thread.sleep(6000);
			opage.clickonEXPLOREactime().click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypasswordinUSER3() {
		try
		{
			opage.clickONuserINuser3ACCOUNT().click();
		
			opage.clickonuser3().click();
			opage.modifypasswordinuser1().sendKeys("welcomeback3");
			opage.retypemodifypasswordinuser1().sendKeys("welcomeback3");
			opage.getsavechanges1().click();
			opage.getLogout().click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser3aftermodifypassword() {
		try
		{
			opage.getUserName().sendKeys("userdemo3");
			opage.getPwd().sendKeys("welcomeback3");             
			opage.getLogin().click();
			Thread.sleep(3000);
			opage.getLogout().click();
			
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void adminlogin()
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
	private static void modifypasswordsUSER123()
	{
		try
		{
			opage.addusers().click();
			Thread.sleep(3000);
			opage.CLICKonUSER1().click();
			opage.modifypasswordinuser1().sendKeys("welcomebackagain1");
			opage.retypemodifypasswordinuser1().sendKeys("welcomebackagain1");
			opage.getsavechanges1().click();           
			
			Thread.sleep(5000);
			
			
			opage.clickonuser2().click();
			opage.modifypasswordinuser1().sendKeys("welcomebackagain2");
			opage.retypemodifypasswordinuser1().sendKeys("welcomebackagain2");
			opage.getsavechanges1().click();
			Thread.sleep(3000);
			
			opage.clickonuser3().click();
			opage.modifypasswordinuser1().sendKeys("welcomebackagain3");
			opage.retypemodifypasswordinuser1().sendKeys("welcomebackagain3");
			opage.getsavechanges1().click();
			opage.getLogout().click();
			Thread.sleep(3000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginlogoutofall()
	{
		try
		{
			opage.getUserName().sendKeys("userdemo1");
			opage.getPwd().sendKeys("welcomebackagain1");             
			opage.getLogin().click();
			Thread.sleep(3000);
			opage.getLogout().click();
			
			Thread.sleep(3000);
			
			
			opage.getUserName().sendKeys("userdemo2");
			opage.getPwd().sendKeys("welcomebackagain2");             
			opage.getLogin().click();
			Thread.sleep(3000);
			opage.getLogout().click();
			
			Thread.sleep(3000);
			
			opage.getUserName().sendKeys("userdemo3");
			opage.getPwd().sendKeys("welcomebackagain3");             
			opage.getLogin().click();
			Thread.sleep(3000);
			opage.getLogout().click();
			
			Thread.sleep(3000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void adminloginanddelete()
	{
		try
		{
			opage.getUserName().sendKeys("admin");
			opage.getPwd().sendKeys("manager");             
			opage.getLogin().click();
			Thread.sleep(5000);
			opage.addusers().click();
			Thread.sleep(3000);
		opage.CLICKonUSER1().click();
			Thread.sleep(3000);
          opage.deleteuser1().click();
			
			Thread.sleep(5000);
			Alert oAlert=driver.switchTo().alert();
			Thread.sleep(2000);
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000); 
			
			opage.getclickondemouser2().click();
			Thread.sleep(3000);
          opage.deleteuser1().click();
			
			Thread.sleep(5000);

			Alert aAlert1=driver.switchTo().alert();
			Thread.sleep(2000);
			String content1=aAlert1.getText();
			System.out.println(content1);
			aAlert1.accept();
			Thread.sleep(2000);
			
			//opage.getclickondemouser3
		opage.getclickondemouser3().click();
		Thread.sleep(3000);
          opage.getuserDataLightBox_deleteBtn().click();
			
			Thread.sleep(5000);
		
			Alert bAlert2=driver.switchTo().alert();
			Thread.sleep(2000);
			String content2=bAlert2.getText();
			System.out.println(content2);
			bAlert2.accept();
			Thread.sleep(2000); 
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


