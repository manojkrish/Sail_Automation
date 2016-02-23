package com.obj.Edit_Status;

import java.util.concurrent.TimeUnit;


//import junit.framework.Assert;
//import java.util.function.Function;
//import org.apache.poi.poifs.property.DocumentProperty;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import com.gargoylesoftware.htmlunit.ElementNotFoundException;

@SuppressWarnings("unused")
public class Edit_Status implements Sail_Interface_Edit_Option {

	public WebDriver driver;

	By Logged_In_User_Name = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[3]/li[1]/p");
	
	By Logged_In_Feed_User_Name = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/div[1]/h3/a");
	
	By Post_Feed_Avail = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]");
	
	By Post_feed_option = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/div[2]/div/button");
	
	By Edit_Option = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/div[2]/div/ul/li[2]/a[2]");
			
	By Edit_Text_Field = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div[2]/div[1]/div/div");

	By Done_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div[2]/div[2]/button[1]");

	By Cancel_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div[2]/div[2]/button[2]");
	
	By Empty_Alert_Popup = By.xpath("/html/body/div[4]/div/div/div[1]");

	By Empty_Alert_Close_button = By
			.xpath("/html/body/div[4]/div/div/div[1]/button");

	By Post_After_Empty_Alert = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div/div[1]/div");

	By Edited_Post_After_Done = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div/div[1]/div");

	By Edited_History_Tag = By
			.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/div[2]/a");

	By Edited_History_Header_Popup = By
			.xpath("/html/body/div[4]/div/div/div[1]");

	By Edited_History_Title = By.xpath("/html/body/div[4]/div/div/div[1]/h3");

	By Edited_History_Count = By
			.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div[2]/a");

	By Edit_History_Close_Popup = By.xpath("/html/body/div[4]/div/div/div[1]/button");
	
	By Edited_History_Content = By.xpath("/html/body/div[4]/div/div/div[2]");
	
	By Edited_Verison_Count = By
			.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div[2]/a");
	
	By Content_Before_Edit = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div/div[1]/div");

	By Content_After_Edit = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div/div[1]/div");
	
	By Post_feed_option_1 = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/div[2]/div/button/span");
	
	By Edit_Option_1 = By.linkText("Edit");//By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/div[2]/div/ul/li[2]/a[2]/div");
	
	By Delete = By.linkText("Delete");//By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/header/div[3]/div/ul/li[2]/a[1]/delete-post");
	
	By Delete_popup = By.xpath("/html/body/div[4]/div/div/div[1]");
	
	By Delete_Button = By.xpath("/html/body/div[4]/div/div/div[3]/button[2]");
	
	By InValid = By.xpath("/html/body/div[4]/div/div/div[1]/button");
	
	
	
	public Edit_Status(WebDriver driver) {

		this.driver = driver;

	}
	
	public void Click_Invalid()
	{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(InValid);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		
	}

	public void Scrolling_The_Page()
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("scroll(300, 100)");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public boolean Is_Logged_In_User_Name_IsEnabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Logged_In_User_Name);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Logged_In_User_Name_IsDisplayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Logged_In_User_Name);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public String Get_Logged_In_UserName() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Logged_In_User_Name);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		String st1=We.getText();
		
		String st2 = st1.replace("Welcome, .", "  ");
		
		return  st2;
		
	}
	
	public boolean Is_Logged_In_Feed_Name_IsEnabled() {
		
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Logged_In_Feed_User_Name);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Logged_In_Feed_Name_IsDisplayed() 
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Logged_In_Feed_User_Name);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
		
		
	}

	public String Get_Feed_Name() {
	
		WebElement we1 = driver.findElement(Logged_In_Feed_User_Name);
		
		String st2=we1.getText();
		
		return st2;
	}

	public boolean Is_Post_Feed_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Post_Feed_Avail);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
	}

	public boolean Is_Post_Feed_Displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Post_Feed_Avail);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_Post_Feed_Option() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement we = driver.findElement(Post_feed_option_1);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
				
	}

	public boolean Is_Edit_option_Enabled() {
		

		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Edit_Option);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isEnabled();
	}

	public boolean Is_Edit_Option_Displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Edit_Option);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isDisplayed();
	}

	public void Click_Edit_Option() {
		
		WebElement WE1 = driver.findElement(Edit_Option_1);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(WE1));
		
		WE1.click();
		
	}

	public void Clear_Text_Field() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Edit_Text_Field);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		try
		{
		We.clear();
		}
		catch(Exception e)
		{
			System.out.println("No content to Clear");
		}
	}

	public boolean Is_Done_Button_Enabled() throws InterruptedException {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Done_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isEnabled();
		
		}
	
	public boolean Is_Done_Button_Displayed() {
	
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Done_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isDisplayed();
	}

	public boolean Is_Cancel_Button_Enabled() throws InterruptedException {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Cancel_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isEnabled();
		}
	
	public boolean Is_Cancel_Button_Displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Cancel_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isDisplayed();
	}

	public void Click_Done_Button() throws InterruptedException {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Done_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
		
	}

	public void Click_Cancel_Button() 
	{
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Cancel_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
		
	}
	
	public boolean Is_Empty_Alert_Popup_Enabled() {
	
		WebElement We = driver.findElement(Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeSelected(We));
		
		return We.isEnabled();
	}

	public boolean Is_Empty_Alert_Popup_Displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Empty_Alert_Popup);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isDisplayed();
		 
	}

	public void Insert_Text_In_Edit() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement We = driver.findElement(Edit_Text_Field);
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		We.sendKeys("Check out the Information");
		
		
		
		
				
	}

	public boolean Is_Content_Before_Edit_Enabled() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Post_After_Empty_Alert);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isEnabled();
		
		}

	public boolean Is_Content_Before_Edit_Displayed() {
	
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Post_After_Empty_Alert);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isDisplayed();
	}

	public String Get_Content_Before_Edit() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
	
		WebElement we = driver.findElement(Post_After_Empty_Alert);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		String st = we.getText();
		
		return st;
	}

	public boolean Is_Content_After_Edit_Enabled() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_Post_After_Done);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isEnabled();
	}
	
	public boolean Is_Content_After_Edit_Displayed() {
	
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_Post_After_Done);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isDisplayed();
	}
	
	public String Get_Content_After_Edit() {
	
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we1 = driver.findElement(Edited_Post_After_Done);
		
		wait.until(ExpectedConditions.elementToBeClickable(we1));
		
		String st1 = we1.getText();
		
		return st1;
	}
	
	public boolean Is_Edited_History_tag_Enabled() 
	{
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_History_Tag);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isEnabled();
	}
	
	public boolean Is_Edited_History_tag_Displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_History_Tag);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isDisplayed();
	}
	
	public void click_Edited_History_tag() {
		
			
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Edited_History_Tag);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_Edited_history_popup_enabled() {
		
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_History_Header_Popup);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isEnabled();
		
	}

	public boolean Is_Edited_history_popup_displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_History_Header_Popup);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isDisplayed();
	}
	
	public void Close_Edited_History_Popup() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edit_History_Close_Popup);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
		
	}

	public boolean Is_View_More_Enabled() {
		
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_History_Count);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isEnabled();
		
		}
	
	public boolean Is_view_more_Displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_History_Count);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isDisplayed();
	}
	
	public void click_View_More() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_History_Count);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
		
	}
	
	public String Get_Edited_History_Popup_Header() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Edited_History_Header_Popup);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		String st = we.getText();
		
		return st;
	}
	
	public String Get_Edited_History_Content() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Edited_History_Content);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		String st = We.getText();
		
		return st;
		
	}
	
	public boolean Is_Delete_Enabled() {
		
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Delete);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isEnabled();
		
		}
	
	public boolean Is_Delete_Displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Delete);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isDisplayed();
	}
	
	public void Click_Delete() {
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Delete);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
	}
	
	public boolean Is_delete_Popup_Enabled() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Delete_popup);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isEnabled();
		
	}
	
	public boolean Is_delete_Popup_Displayed() {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Delete_popup);
	
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		return we.isDisplayed();
	}
	
	public String Get_popup() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Delete_popup);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		String st = we.getText();
		
		return st;
	}
	
	public void Click_Delete_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement we = driver.findElement(Delete_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
		
	}

	

	

	
}