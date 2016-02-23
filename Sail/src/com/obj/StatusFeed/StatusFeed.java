package com.obj.StatusFeed;

//import java.io.FileInputStream;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

@SuppressWarnings("unused")
public class StatusFeed implements Sail_Interface_Status_feed {

	public WebDriver driver;
	
	
	//Common Action Page Objects
	
		By DropDown_Menu = By.className("dropdown-menu");
		
		By Every_One = By.cssSelector("html body.push-menu div.app-container div.content div div.container div.row.sail div.col-md-6.col-sm-8.col-sm-offset-2.col-xs-12.col-md-offset-3 share-widget section#status-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#status-widget-footer.row div.dropdown.pull-right.privacy-dropdown-list.open ul.dropdown-menu li a");
		
		By Friends = By.cssSelector("html body.push-menu div.app-container div.content div div.container div.row.sail div.col-md-6.col-sm-8.col-sm-offset-2.col-xs-12.col-md-offset-3 share-widget section#status-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#status-widget-footer.row div.dropdown.pull-right.privacy-dropdown-list.open ul.dropdown-menu li a");
		                          // 
		
		//Status Feed Page Objects

		By Status_Feed_Avail = By.id("status-widget-body");

		@SuppressWarnings("static-access")
		By Status_Feed_Input_Field = By.className("status-block").className("update-txt");
		
		@SuppressWarnings("static-access")
		By status_Input = Status_Feed_Input_Field.className("update-txt");

		@SuppressWarnings("static-access")
		By clickPost = By.id("status-widget-footer").className("post-btn");
				
		By Popup_Header_Text_1 = By.className("modal-content");
		
		@SuppressWarnings("static-access")
		By Popup_Header_Text_2 = Popup_Header_Text_1.className("sail-m modal-header");
		
		@SuppressWarnings("static-access")
		By Popup_Header_Text = Popup_Header_Text_2.className("modal-title");
		
		@SuppressWarnings("static-access")
		By Close_Status_Empty_Pop = Popup_Header_Text_2.cssSelector("button.close");
		
		@SuppressWarnings("static-access")
		By Is_Status_option = By.id("status-widget-footer").className("privacy-dropdown-list");
			
		@SuppressWarnings("static-access")
		By Is_Login_UserName = By.className("hidden-xs").tagName("p");//.className("hidden-xs");
		
		@SuppressWarnings("static-access")
		By Is_Feed_UserName = By.id("post-widget-body").className("posting-body").className("post-name");
		
		@SuppressWarnings("static-access")
		By Profile_Image = By.id("status-widget-body").tagName("a");

		By Status_Feed_PlaceHolder = By
				.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/section/div/div/div[1]/div/div/div/div/div[2]");

		By Is_Time_Stamp = By
				.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/span/timeago");

		
	/*By Status_Feed_Avail = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]");

	By Profile_Image = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/figure/a/img");

	By Status_Feed_Input_Field = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/section/div/div/div[1]/div/div/div/div/div");

	By Status_Feed_PlaceHolder = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/section/div/div/div[1]/div/div/div/div/div[2]");

	By clickPost = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[2]/button");
	
	By Popup_Header_Text = By.xpath("/html/body/div[4]/div/div/div[1]");

	By Popup_Footer_Text = By.xpath("/html/body/div[4]/div/div/div[2]");

	By Close_Status_Empty_Pop = By
			.xpath("/html/body/div[4]/div/div/div[1]/button");

	By Is_Login_UserName = By
			.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[3]/li[1]/p");

	By Is_Feed_UserName = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/div[1]/h3/a");

	By Is_Time_Stamp = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/span/timeago");

	By Is_Profile_Image = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/figure/a/img");
	
	By Is_Status_option = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[2]/div/button");
	
	By Is_EveryOne_option = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[2]/div/ul/li[1]/a");
	
	By Is_MyFriends_option = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[2]/div/ul/li[2]/a");
	*/

	public StatusFeed(WebDriver driver) {

		this.driver = driver;

	}

	public boolean Is_Status_Feed_Enabled() 
	{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We =driver.findElement(Status_Feed_Avail); 
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
	}

	public boolean Is_Profile_Image_Enabled() {
		
		
		WebElement We = driver.findElement(Profile_Image); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Profile_Image_Displayed() {
		
		WebElement We = driver.findElement(Profile_Image); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public boolean Is_Status_feed_Text_Field_Enabled() {
				
		WebElement We = driver.findElement(Status_Feed_Input_Field); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Status_feed_Text_Field_Displayed() {
		
		WebElement We = driver.findElement(Status_Feed_Input_Field); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public boolean IsStatus_feed_Place_Holder_Enabled() {
		
		WebElement We = driver.findElement(Status_Feed_PlaceHolder);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean IsStatus_feed_Place_Holder_Displayed() {

		WebElement We = driver.findElement(Status_Feed_PlaceHolder);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void EmptyStatus() {

		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();	
	}

	public boolean IsEmpty_Status_Alert_Enabled() {
		
		WebElement We = driver.findElement(Popup_Header_Text);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean IsEmpty_Status_Alert_Displayed() {

		WebElement We = driver.findElement(Popup_Header_Text);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void close_Empty_Alert() {
				
		WebElement We = driver.findElement(Close_Status_Empty_Pop);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public void Insert_Empty_Feed() {
		
		WebElement We = driver.findElement(Status_Feed_Input_Field);

		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.sendKeys("   ");
	}

	public boolean IsStatus_Post_Button_Enabled() {
		
		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean IsStatus_Post_Button_Displayed() {


		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	
	}

	public void Click_Post_Button() {
		
		WebElement We = driver.findElement(clickPost);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

    public boolean Is_Privacy_Drop_Down_Enabled() {
		
		WebElement We = driver.findElement(Is_Status_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
	}

	public boolean Is_Privacy_Drop_Down_Displayed() {
		
		WebElement We = driver.findElement(Is_Status_option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}
	
	public void SelectPrivacyOption() {
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Is_Status_option);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}
	
	public boolean Is_EveryOne_Option_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Every_One);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
	}

	public boolean Is_EveryOne_Option_Displayed() {
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Every_One);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
		
		
	}	

	public boolean Is_MyFriend_Option_Enabled() {
		
		WebElement We = driver.findElement(Friends);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_MyFriend_Option_Displayed() {
		
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		WebElement We1= driver.findElement(Friends);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We1));
		
		return We1.isDisplayed();
	}

	public void SelectEveryone() {
		
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		WebElement We1= driver.findElement(Every_One);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We1));
		
		We1.click();
	
		
		
	}

	public void SelectMyFriend() {
		
				
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		WebElement We1= driver.findElement(Friends);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We1));
		
		We1.click();
		
	}

	public void Slowscrolling() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for (int second = 0;; second++) {
		        if(second >=60){
		            break;
		        }
		            jse.executeScript("window.scrollBy(0,600)", ""); //y value '800' can be altered
		            Thread.sleep(3000);
		}
		
	}
	
	public void Insert_Text_In_The_Feed() 
	{
		
	WebElement We1=driver.findElement(Status_Feed_Input_Field);
	
	WebDriverWait wait1 = new WebDriverWait(driver,10);
	
	wait1.until(ExpectedConditions.elementToBeClickable(We1));	
	
	We1.sendKeys("Status posted through Automation");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public boolean Is_Logged_In_UserName_Enabled() 
	{
		
		WebElement We = driver.findElement(Is_Login_UserName);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));	
				
		return We.isEnabled();
		
	}
	
	public boolean Is_Logged_In_UserName_Displayed() {
		
		WebElement We = driver.findElement(Is_Login_UserName);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));	
				
		return We.isDisplayed();
	}

	public String Get_Feed_UserName() {
	
	WebElement WE = driver.findElement(Is_Feed_UserName);
	
	WebDriverWait wait1 = new WebDriverWait(driver,10);
	
	wait1.until(ExpectedConditions.elementToBeClickable(WE));	
	
	String st = WE.getText();
	
	return st;
	}
	
	public String Get_Logged_UserName() {
		
		WebElement WE = driver.findElement(Is_Login_UserName);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(WE));
		
		String st1 = WE.getText();
			
		return st1;
		
	}
	
	public boolean Is_Feed_In_UserName_Enabled() 
	{
		return driver.findElement(Is_Feed_UserName).isEnabled();
		
	}
	
	public boolean Is_Feed_In_UserName_Displayed() 
	{
		
		WebElement WE = driver.findElement(Is_Feed_UserName);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(WE));
		
		 return WE.isDisplayed();
	}

	public boolean Is_Time_Stamp_Enabled() {
	
		WebElement We = driver.findElement(Is_Time_Stamp);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Time_Stamp_Displayed() {
	
		WebElement We = driver.findElement(Is_Time_Stamp);
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public String Get_Time_Stamp() {
		
			WebElement We3 = driver.findElement(Is_Time_Stamp);
			
			String St4=We3.getText();
			
			return St4;
	}
		
	public void Scrolling_The_Page()
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("scroll(0, 900)");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
	
	public void Insert_Links_In_The_Feed() 
	{
		
	WebElement We1=driver.findElement(Status_Feed_Input_Field);
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	
	wait.until(ExpectedConditions.elementToBeClickable(We1));
	
	We1.sendKeys("http://www.yahoo.com ");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}



}
