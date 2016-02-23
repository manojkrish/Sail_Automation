package com.obj.Profile_Activity;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

@SuppressWarnings("unused")
public class Profile_Activity implements Profile_Activity_Interface {
	
	public WebDriver driver;
	
	By WSE = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[1]/a");
	
	By My_Profile = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[1]/ul/li[2]/a");
	
	By Profile_User_Name = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/header/div/div/div/div/h2");
	
	By Activity_Tab = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[1]/div/div/ul/li[1]/a");
	
	By Status_Feed_Avail = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/share-widget/section/div[1]");
	
	By Status_Feed_Tab = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/share-widget/section/div[1]/section/div/ul/li[1]/a");
	
	By Status_Field_Input = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/share-widget/section/div[1]/section/div/div/div[1]/div/div/div/div/div[1]");
	
	By Privacy_Status_Feed = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/share-widget/section/div[2]/div/button");
	
	By EveryOne_Status = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/share-widget/section/div[2]/div/ul/li[1]/a");
	
	By Friends_Status = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/share-widget/section/div[2]/div/ul/li[2]/a");
	
	By Post_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/share-widget/section/div[2]/button");
	
	By Post_Feed_Content_In_Activity = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div/div[1]");
	
	By WSE_Logo_Navigate = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[1]/a");
	
	By Connect_Option = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[3]/a");
	
	By Feeds = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[3]/ul/li[2]/a");
	
	By Get_Post_From_The_Post_Feed = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div/div[1]");
	
	By Feeds_Multiple = By.className("post-header");
			
	By No_More_Activity = By.xpath("/html/body/div[2]/div[2]/div[4]/div/main/div/div[2]/div/div/div/div/div[2]/div");

	
	public Profile_Activity(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public boolean Is_My_Wse_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(WSE);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_My_Wse_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(WSE);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public void Click_My_Wse() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement We = driver.findElement(WSE);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		 We.click();
		
	}

	public boolean Is_My_Profile_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(My_Profile);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_My_Profile_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(My_Profile);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_My_Profile() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(My_Profile);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}
	
	public String Get_Profile_User_Name() {
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		WebElement We = driver.findElement(Profile_User_Name);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.getText();
	}
	
	public boolean Is_Activity_Tab_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Activity_Tab);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Activity_Tab_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Activity_Tab);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public boolean Is_Status_Feed_Avail() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Status_Feed_Avail);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public boolean Is_Status_Feed_Tab_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Status_Feed_Tab);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public boolean Is_Status_Feed_Tab_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Status_Feed_Tab);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Status_Feed_Tab() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Status_Feed_Tab);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}
	
	public boolean Is_Status_Feed_Text_Field_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Status_Field_Input);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Status_Feed_Text_Field_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Status_Field_Input);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Status_Feed_Text_Field() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Status_Field_Input);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		We.sendKeys("Posted the status from the activity feed page.");
		
	}
	
	public boolean Is_Privacy_Status_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Privacy_Status_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Privacy_Status_Diplayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Privacy_Status_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_Privacy_Status() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Privacy_Status_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}
	
	public boolean Is_Every_One_Status_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(EveryOne_Status);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Every_One_Status_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(EveryOne_Status);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Every_One_Status() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(EveryOne_Status);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}
	
	public boolean Is_Friends_Status_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Friends_Status);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Friends_Status_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Friends_Status);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Friends_Status() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Friends_Status);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}
	
	public boolean Is_Post_Button_Enabled() {
	
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Post_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Post_Button_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Post_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Post_Button() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Post_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

	public boolean Is_Activity_Posted_Status_Feed_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement We = driver.findElement(Post_Feed_Content_In_Activity);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
	}

	public boolean Is_Activity_Posted_Status_Feed_Disabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Post_Feed_Content_In_Activity);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public String Get_Activity_Posted_Feed_Content() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Post_Feed_Content_In_Activity);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.getText();
	}

	public boolean Is_Wse_Header_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(WSE_Logo_Navigate);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
	}

	public boolean Is_Wse_Header_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(WSE_Logo_Navigate);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void click_Wse_Header() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(WSE_Logo_Navigate);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

	public boolean Is_Post_Feed_From_Status_Feed_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement We = driver.findElement(Get_Post_From_The_Post_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Post_Feed_From_Status_Feed_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Get_Post_From_The_Post_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public String Get_Post_Feed_From_Status_Feed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Get_Post_From_The_Post_Feed);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.getText();
		
		
	}

	public boolean Is_Connect_Field_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Connect_Option);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
	}
	
	public boolean Is_Connect_Field_Displayed() {
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Connect_Option);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void click_Connect_Field() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Connect_Option);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}
	
	public boolean Is_Feeds_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Feeds);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Feeds_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Feeds);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void click_Feeds() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Feeds);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Element_Visibility()
	{
		
		boolean result = false;
		
		try{
			
			WebElement we = driver.findElement(No_More_Activity);
			
			result = we.isDisplayed();
			
		}
		catch(Exception e)
		{
			
			result = false;
			
		}
		
		return result;
	}
	
	public void getFeeds() throws InterruptedException
	{
		
		//Thread.sleep(4000);		
		
		boolean IsDisplayed = Element_Visibility();
		
		int x=0,y=1200;
		
		while(!IsDisplayed)
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("scroll("+x+","+y+")");

			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			IsDisplayed = Element_Visibility();	
		
			x=y;
			
			y=x+x;
		}
		
		List<WebElement> We = driver.findElements(Feeds_Multiple);
		
		for(WebElement web : We)
		{
				
		String St = web.getText();
		
		System.out.println(St);
		
		}
		/*WebElement We1 = driver.findElement(Profile_User_Name);
		
		String st1 = We1.getText();
		
		System.out.println(st1);*/
	}

}
