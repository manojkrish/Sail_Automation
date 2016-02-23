package com.obj.Comment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Comment_In_The_Post implements Comment_Interface{
	
	public WebDriver driver;
	
	By Comment_Field = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[3]/div/div/div/div/form/div[1]/div/div[1]");
	
	By Comment_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[3]/div/div/div/div/form/div[2]/button[1]");

	By Comment_Field_Option = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[2]/div/div[1]/div/section/div[1]/div[2]/div/button");

	By Comment_Field_Edit = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[2]/div/div[1]/div/section/div[1]/div[2]/div/ul/li[1]/a/div");
	
	By Comment_Field_Delete = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[2]/div/div[1]/div/section/div[1]/div[2]/div/ul/li[2]/a");
	
	By Comment_Insert = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[2]/div/div[1]/div/section/div[3]/div[1]/div/div");
	
	By Comment_Done = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[2]/div/div[1]/div/section/div[3]/div[2]/button[1]");
	
	By Comment_Cancel = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[2]/div/div[1]/div/section/div[3]/div[2]/button[2]");
	
	By Edited_history_tag = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[2]/div/div[1]/div/section/div[2]/a");
	
	By Delete_Popup_Cancel_button = By.xpath("/html/body/div[4]/div/div/div[3]/button[1]");
	
	By Delete_Popup_Delete_Comment = By.xpath("/html/body/div[4]/div/div/div[3]/button[2]");
	
	By Previous_Comment = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/share-preview[1]/section/div[2]/div/div[1]/div[1]/section/a");
	
	public Comment_In_The_Post(WebDriver driver)
	{
		 this.driver=driver;
	}
	
	public boolean Is_Comment_Enabled() 
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement We = driver.findElement(Comment_Field);
		
		return We.isEnabled();
	}
	
	public boolean Is_Comment_Displayed() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement We = driver.findElement(Comment_Field);
		
		return We.isDisplayed();
	}
	
	public void Click_Comment_Field() {
		
		WebElement we = driver.findElement(Comment_Field);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		//we.click();
		
		we.sendKeys("Comment 1");
	
		
	}
	
	public void Multiple_Comment() throws InterruptedException
	{
		
		String st[] = {"Hi how are you ","Please check this out ","Yes i got it superb","Again Super","Classic comment","New comment posted","yes i saw it "};
		
		for(int i=0;i<st.length;i++)
		{
			
			WebElement we = driver.findElement(Comment_Field);
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			
			wait.until(ExpectedConditions.elementToBeClickable(we));
			
			//we.click();
			
			we.sendKeys(st[i]);
			
			WebElement we1 = driver.findElement(Comment_Button);
			
			WebDriverWait wait1 = new WebDriverWait(driver,20);
			
			wait1.until(ExpectedConditions.elementToBeClickable(we));
			
			Thread.sleep(3000);
			
			we1.click();
			
			
		}
		
	}
	
	public boolean Is_Comment_Button_Enabled() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		return driver.findElement(Comment_Button).isEnabled();
				
	}
	
	public boolean Is_Comment_button_Displayed() {
	
		return driver.findElement(Comment_Button).isDisplayed();
	}
	
	public void Click_Comment_button() {
		
		WebElement we = driver.findElement(Comment_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
		
	}

	public boolean Is_Comment_Feed_Option_Enabled() {
		
		WebElement We = driver.findElement(Comment_Field_Option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();

		
	}

	public boolean Is_Comment_Feed_Option_Displayed() {

		WebElement We = driver.findElement(Comment_Field_Option);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_Comment_Feed_Option() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Comment_Field_Option); 
		 
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_Edit_Option_Enabled() {

		WebElement We = driver.findElement(Comment_Field_Edit);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
	}

	public boolean Is_Edit_Option_Displayed() {
	
		WebElement We = driver.findElement(Comment_Field_Edit);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Edit_Option() {
	
		WebElement We = driver.findElement(Comment_Field_Edit);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

	public boolean Is_Comment_Field_Edit_Enabled() 
	{
		
		WebElement We1 = driver.findElement(Comment_Field_Option);
		
		WebDriverWait  wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We1));
		
		We1.click();
		
		WebElement We = driver.findElement(Comment_Field_Edit);
	
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		
		wait1.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Comment_Field_Edit_Displayed() {
	
		WebElement We = driver.findElement(Comment_Field_Edit);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Comment_Field_Edit() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Comment_Field_Edit);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		We.click();
	
		
	}
	
	public boolean Is_Comment_Field_Delete_Enabled() {
		
		WebElement We = driver.findElement(Comment_Field_Delete);
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Comment_Field_Delete_Displayed() {
	
		WebElement We = driver.findElement(Comment_Field_Delete);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Comment_Field_Delete() {
	
		WebElement We = driver.findElement(Comment_Field_Delete);
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		 We.click();
	}
	
	public void Insert_Comment_Edit() {
		 
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement we = driver.findElement(Comment_Insert);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
		
		we.sendKeys("Comment has been Edited");
		
	}

	public boolean Is_Comment_Done_Enabled() {
		
		WebElement We = driver.findElement(Comment_Done);
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Comment_Done_Displayed() {
		
		WebElement We = driver.findElement(Comment_Done);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void click_Comment_Done() {
		
		WebElement We = driver.findElement(Comment_Done);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		We.click();
		
	}

	public boolean Is_Comment_Cancel_Enabled() {
		
		WebElement We = driver.findElement(Comment_Cancel);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isEnabled();
	}

	public boolean Is_Comment_Cancel_displayed() {
	
		WebElement We = driver.findElement(Comment_Cancel);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isDisplayed();
	}

	public void Click_Comment_Cancel() {
		
		WebElement We = driver.findElement(Comment_Cancel);
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}
	
	public boolean Is_Edited_history_tag_Enabled() {
		
		WebElement We = driver.findElement(Edited_history_tag);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Edited_history_tag_Displayed() {
		
		
		WebElement We = driver.findElement(Edited_history_tag);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_Edited_hitsory_tag() {
		
		WebElement We = driver.findElement(Edited_history_tag);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		
	}
	
	public boolean Is_Delete_popup_Delete_Button_Enabled() {
		
		WebElement We = driver.findElement(Delete_Popup_Delete_Comment);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Delete_popup_Delete_Button_Displayed() {
		
		WebElement We = driver.findElement(Delete_Popup_Delete_Comment);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void click_Delete_popup_Delete_Button() {
		
		WebElement We = driver.findElement(Delete_Popup_Delete_Comment);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}
	
	public boolean Is_Delete_popup_Cancel_Button_Enabled() {
		
		WebElement We = driver.findElement(Delete_Popup_Cancel_button);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		
		return We.isEnabled();
	}
	
	public boolean Is_Delete_popup_Cancel_Button_Displayed() {
		
		WebElement We = driver.findElement(Delete_Popup_Cancel_button);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void click_Delete_popup_Cancel_Button() {
		
		WebElement We = driver.findElement(Delete_Popup_Cancel_button);
	
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_Previous_Comment_Enabled() {
		
		WebElement We = driver.findElement(Previous_Comment);
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}
	
	public boolean Is_Previous_Comment_Displayed() {
		
		WebElement We = driver.findElement(Previous_Comment);
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}
	
	public void Click_Previous_Comment() {
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		WebElement We = driver.findElement(Previous_Comment);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

}
