package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Create WebElement for UserName text field
	private WebElement username;

	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password text field
	private WebElement pwd;
	public WebElement getPwd() 
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;

	public WebElement getLogin()
	{
		return oLogin;
	}

	//Create WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;

	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Create WebElement for Logout link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;

	public WebElement getLogout()
	{
		return oLogout;
	}
	//webelement for adduser
	@FindBy(xpath="/html/body/div[4]/table/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement users;               // /html/body/div[4]/table/tbody/tr[1]/td[5]/a/div[2]
	public WebElement addusers()  
	{                             //  /html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[2]
		return users;      //   /html/body/div[1]/div[2]/table/tbody/tr[1]/td[5]/a/div[2]
	}
                          //  /html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[2]
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]")
	private WebElement adduser;
	public WebElement adduser()
	{
		return adduser;
	}

	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div/input[1]")
	private WebElement firstname;
	public WebElement firstname()
	{
		return firstname;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input")
	private WebElement lastname;
	public WebElement lastname()
	{
		return lastname;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/input")
	private WebElement email;
	public WebElement email()
	{
		return email;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/input")
	private WebElement Username;
	public WebElement username()
	{
		return username;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[3]/div[3]/input")
	private WebElement Password;
	public WebElement Password()
	{
		return Password;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[3]/div[4]/input")
	private WebElement Retypepassword;
	public WebElement Retypepassword()
	{
		return Retypepassword;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")
	private WebElement create;
	public WebElement create()
	{
		return create;
	}
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickonuser1;
	public WebElement clickonuser1()
	{           
		return clickonuser1;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div/input[1]")
	private WebElement modifuusername;
	public WebElement modifyuser1name()
	{
		return modifuusername;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")
	private WebElement createusersavechanges;
	public WebElement createusersavechanges()
	{
		return createusersavechanges;
	}
	@FindBy(xpath="/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[2]/button")
	private WebElement deleteuser1;
	public WebElement deleteuser1()     // /html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[2]/button
	{
		return deleteuser1;             // /html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[2]/button
	}

	@FindBy(xpath="/html/body/div[1]/div[3]/table/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[3]/a")
	private WebElement logout;
	public WebElement logout()
	{
		return logout;
	}

	//create customer
	@FindBy(xpath="/html/body/div[4]/table/tbody/tr/td[3]/a/div[2]")
	private WebElement clickontaskforaddingcustomer;
	public WebElement clickontaskforaddingcustomer()
	{
		return clickontaskforaddingcustomer;
	}
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement clickonaddnewCUSTOMER;
	public WebElement clickonaddnewCUSTOMER()
	{
		return clickonaddnewCUSTOMER;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement clickonNEWCUSTOMER;
	public WebElement clickonNEWCUSTOMER()
	{
		return clickonNEWCUSTOMER;
	}
	@FindBy(xpath="/html/body/div[8]/div/div/div[1]/div/div[1]/input")
	private WebElement ENTERnewcustomer;
	public WebElement ENTERnewcustomer()
	{
		return ENTERnewcustomer;
	}
	@FindBy(xpath="/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")
	private WebElement clickonCREATEcustomer;
	public WebElement clickonCREATEcustomer()
	{
		return clickonCREATEcustomer;
	}

	//delete customer
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clickononCUSTOMERbutton;
	public WebElement clickononCUSTOMERbutton()
	{
		return clickononCUSTOMERbutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement clickononCUSTOMERactionsbutton;
	public WebElement clickononCUSTOMERactionsbutton()
	{
		return clickononCUSTOMERactionsbutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[4]/div/div[3]/div")
	private WebElement clickonCUSTOMERdeletebutton;
	public WebElement clickonCUSTOMERdeletebutton()
	{
		return clickonCUSTOMERdeletebutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div[5]/div[1]/div/span")
	private WebElement deletepemanentlycustomerbutton;
	public WebElement deletepemanentlycustomerbutton()
	{
		return deletepemanentlycustomerbutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement addDESCRIPTIONTOcustomer;
	public WebElement addDESCRIPTIONTOcustomer()
	{
		return addDESCRIPTIONTOcustomer;
	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement clickonNEWPROJECT;
	public WebElement clickonNEWPROJECT()
	{
		return clickonNEWPROJECT;
	}
	@FindBy(xpath="/html/body/div[8]/div/div/div[1]/div/div/div[1]/input")
	private WebElement ENTERNEWPROJECT;
	public WebElement ENTERNEWPROJECT()
	{
		return ENTERNEWPROJECT;
	}
	@FindBy(xpath="/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")
	private WebElement createprojectbutton;
	public WebElement createprojectbutton()
	{
		return createprojectbutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement clickonprojectsettingbutton;
	public WebElement clickonprojectsettingbutton()
	{
		return clickonprojectsettingbutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement clickonprojectactionsbutton;
	public WebElement clickonprojectactionsbutton()
	{
		return clickonprojectactionsbutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[4]/div/div[3]/div")
	private WebElement clickonprojectdeletebutton;
	public WebElement clickonprojectdeletebutton()
	{
		return clickonprojectdeletebutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[3]/div/div/div[5]/div[1]/div/span")
	private WebElement clickonprojectdeletepermanently;
	public WebElement clickonprojectdeletepermanently()
	{
		return clickonprojectdeletepermanently;
	}
	//modify PROJECT
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement writedescriptionofproject;
	public WebElement writedescriptionofproject()
	{
		return writedescriptionofproject;
	}
	//NEW TASK
		@FindBy(xpath=" /html/body/div[12]/div[2]/div[1]/div[1]/div[3]/div/div[2]")
		private WebElement clickonaddnewTASK;
		public WebElement clickonaddnewTASK()
		{
			return clickonaddnewTASK;
		}
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement CLICKONnewTASKbutton;
		public WebElement CLICKONnewTASKbutton()
		{
			return CLICKONnewTASKbutton;
		}
		@FindBy(xpath="/html/body/div[8]/div/div/div[1]/div[3]/table/tbody/tr[1]/td[1]/input")
		private WebElement CLICKonENTERtaskNAME;
		public WebElement CLICKonENTERtaskNAME()
		{
			return CLICKonENTERtaskNAME;
		}
		@FindBy(xpath="/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")
		private WebElement CLICKonCREATEtask;
		public WebElement CLICKonCREATEtask()
		{
			return CLICKonCREATEtask;
		}
		
	// DELETE TASK
		@FindBy(xpath="/html/body/div[12]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
		private WebElement CLICKonTASKname;
		public WebElement CLICKonTASKname()
		{
			return CLICKonTASKname;
		}
		@FindBy(xpath="/html/body/div[12]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement clickONtaskACTIONS;
		public WebElement clickONtaskACTIONS()
		{
			return clickONtaskACTIONS;
		}
		@FindBy(xpath="/html/body/div[12]/div[2]/div[3]/div[4]/div/div[3]/div")
		private WebElement CLICKONtaskDELETEbutton;
		public WebElement CLICKONtaskDELETEbutton()
		{
			return CLICKONtaskDELETEbutton;
		}
		@FindBy(xpath="/html/body/div[12]/div[2]/div[3]/div[2]/div[1]/div[1]/div/div/div[5]/div[1]/div/span")
		private WebElement clickonTASKdeletePERMANENTLY;
		public WebElement clickonTASKdeletePERMANENTLY()
		{
			return clickonTASKdeletePERMANENTLY;
		}
		@FindBy(xpath="/html/body/div[3]/div[3]/div/span[1]")
		private WebElement clickonEXPLOREactime;
		public WebElement clickonEXPLOREactime()
		{
			return clickonEXPLOREactime;
		}
		@FindBy(xpath="/html/body/div[3]/div[3]/div/span[1]")
		private WebElement clickonsavechangesforuser1MODIFICATION;
		public WebElement clickonsavechangesforuser1MODIFICATION()
		{
			return clickonsavechangesforuser1MODIFICATION;
		}
		@FindBy(xpath="/html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[2]")
		private WebElement clickONuserINuser1ACCOUNT;
		public WebElement clickONuserINuser1ACCOUNT()
		{
			return clickONuserINuser1ACCOUNT;
		}
		 
	
		
		//  /html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[2]
		
		//  /html/body/div[2]/table/tbody/tr[1]/td[5]/a/div[2]
		
		
		@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
		private WebElement savechangespasswordmodificationuser1;   
		public WebElement getsavechanges1()
		{             
			return savechangespasswordmodificationuser1;
		}
		@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement clickonuser2;
		public WebElement clickonuser2()
		{
			return clickonuser2;  // /html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]
		}
		@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement clickonuser3;
		public WebElement clickonuser3()
		{
			return clickonuser3;
		}
		@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
		private WebElement CLICKonUSER1;
		public WebElement CLICKonUSER1()
		{              // /html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]
			return CLICKonUSER1;
		}
		
		private WebElement userDataLightBox_passwordField;   
		public WebElement modifypasswordinuser1()
		{
			return userDataLightBox_passwordField;
		}
		
	
		private WebElement userDataLightBox_passwordCopyField;
		public WebElement retypemodifypasswordinuser1()
		{
			return userDataLightBox_passwordCopyField;
		}
		@FindBy(xpath="/html/body/div[3]/table/tbody/tr[1]/td[5]/a/div[2]")
		private WebElement clickONuserINuser3ACCOUNT;
		public WebElement clickONuserINuser3ACCOUNT()
		{
			return clickONuserINuser3ACCOUNT;
		}
		
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
		private WebElement clickondemouser2;
		public WebElement getclickondemouser2()
		{
			return clickondemouser2;
		}
		
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getuserDataLightBox_deleteBtn()
		{
			return userDataLightBox_deleteBtn;
		}
		
		// //span[text()='demo3, user3']
		
		@FindBy(xpath="//span[text()='demo3, user3']")
		private WebElement clickondemouser3;
		public WebElement getclickondemouser3()
		{
			return clickondemouser3;
		}
		
}




//  ///*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]

//    //*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]

