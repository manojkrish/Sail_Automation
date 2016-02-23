package com.obj.FileUpload;

//import java.util.List;
//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload implements FileUpload_Interface{
	
	public WebDriver driver;
	
		
	@SuppressWarnings("static-access")
	By FileTab = By.className("nav-tabs").id("tabclick_1");
	
	By FileTab_StatusField = By.cssSelector("html body.push-menu div.app-container div.content div div.container div.row.sail div.col-md-6.col-sm-8.col-sm-offset-2.col-xs-12.col-md-offset-3 share-widget section#status-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#status-widget-body section.status-box div div.tab-content div.tab-pane.active div.status-body div upload-file.ng-pristine.ng-untouched.ng-valid div div div.ng-pristine.ng-untouched.ng-valid div.status-block div.input-element.update-txt"); 
	
	By FileTab_Upload_Area = By.cssSelector("html body.push-menu div.app-container div.content div div.container div.row.sail div.col-md-6.col-sm-8.col-sm-offset-2.col-xs-12.col-md-offset-3 share-widget section#status-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#status-widget-body section.status-box div div.tab-content div.tab-pane.active div.status-body div upload-file.ng-pristine.ng-untouched.ng-valid div div div.input-element.status-image-block div.img-placeholder.file-upload.btn.btn-default input.uploadFiles.upload");	
	
	By Status_Feed_ID = By.xpath("status-widget-body");
	
	By Widget_Footer = By.id("status-widget-footer");
	
	@SuppressWarnings("static-access")
	By clickPost = Widget_Footer.className("post-btn");
	
	By File_Posted_Block = By.className("file-block");
	
	@SuppressWarnings("static-access")
	By Download_File = File_Posted_Block.className("file-cancel");
	
	By Download_Image = By.cssSelector("html body.push-menu div.app-container div.content div div.container div.row.sail div.col-md-6.col-sm-8.col-sm-offset-2.col-xs-12.col-md-offset-3 div.preview-container share-preview#feed_id-56c706c48d1986bc4eec83ec section#post-widget.col-xs-12.col-sm-12.col-md-12.fadeInUp div#post-widget-body.row div.preview-block section.posting-body div.post-body div.data-list div.disp-list upload-view div div div a img.img-responsive.light-box-img");

	By Modal_Close = By.cssSelector("html body.push-menu.modal-open div.modal.fade.sail-modal.in div.modal-dialog.modal-lg div.modal-content img-prev button.close.light-box-close");
	
	
	
	
	
	
	
	By File_Tab_Post_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[2]/button");
	
	By File_Tab_Empty_Alert_Popup = By.xpath("/html/body/div[4]/div/div/div[1]");
	
	By File_Tab_Empty_Alert_Close_Button = By.xpath("/html/body/div[4]/div/div/div[1]/button");
	
	By ThumbNail_Close = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div/share-widget/section/div[1]/section/div/div/div[2]/div/div/upload-file/div/div/div[2]/div[2]/span");
	
	By Click_ThumbNail = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/share-widget/section/div[1]/section/div/div/div[2]/div/div/upload-file/div/div/div[2]/div[2]/img");
	
	By Progress_bar = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/share-widget/section/div[1]/section/div/div/div[2]/div/div/upload-file/div/div/div[2]/div[3]/div/div[5]/div");
	
	By FileUpload_Bar_Close_Button = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/share-widget/section/div[1]/section/div/div/div[2]/div/div/upload-file/div/div/div[2]/div[3]/div/div[3]/a");
	
	By Invalid_File_Upload_Alert = By.xpath("/html/body/div[4]/div/div/div[1]");
	
	By Invalid_File_upload_Alert_Close = By.xpath("/html/body/div[4]/div/div/div[1]/button");
	
	By Is_File_upload_Edit_Cancel_button = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div/div[2]/button[1]");
	
	By Is_File_upload_Edit_Done_button = By.xpath("/html/body/div[2]/div[2]/div[4]/div/div/div/div[2]/share-preview[1]/section/div[1]/div/section/div[1]/div/div/div/div[2]/button[2]");
	
	By Empty_Status_Alert_Popup = By.xpath("html/body/div[4]/div/div/div[1]/button");
	
	
	
	
	
	
	
	
	public FileUpload(WebDriver driver) {

		this.driver = driver;

	}

	public boolean Is_File_Tab_Enabled() {
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(FileTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return driver.findElement(FileTab).isEnabled();
	}

	public boolean Is_File_Tab_Displayed() {
		
		WebElement We = driver.findElement(FileTab); 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		return We.isDisplayed();
	}

	public void click_File_tab() {
		
		WebElement We = driver.findElement(FileTab);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}
	
	public boolean Is_File_Status_Field_Enabled() {
		
		WebElement We = driver.findElement(FileTab_StatusField);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
			
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return	We.isEnabled();
	}
	
	public boolean Is_File_Status_Field_Displayed() {
		
		WebElement We = driver.findElement(FileTab_StatusField);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
			
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return	We.isDisplayed();
	}
	
	public void Click_File_Status_Field() throws InterruptedException {
		
		WebElement we = driver.findElement(FileTab_StatusField);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.sendKeys("How is this pictures");
	}

	public boolean Is_File_Upload_Area_Enabled() {
		
		WebElement We = driver.findElement(FileTab_Upload_Area);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeSelected(We));
		
		return We.isEnabled();
	}

	public boolean Is_File_upload_Area_Displayed() {
		
		WebElement We = driver.findElement(FileTab_Upload_Area);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();				
		}

	public void Click_File_Upload_Area_With_Image() throws InterruptedException 
	{
	
		WebElement We = driver.findElement(FileTab_Upload_Area);
	
		String st [] = {"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg"};
		
		Thread.sleep(3000);
		
		for (int i =0;i<st.length;i++)
		{
			
		We.sendKeys(st[i]);
		
		Thread.sleep(3000);
		
		WebElement We1 = driver.findElement(File_Tab_Post_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,120);
		
		wait.pollingEvery(5, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.elementToBeClickable(We1));
		
		We1.click();
		
		}
		
		driver.findElement(FileTab).click();
		
		Thread.sleep(3000);
		
		
		String st1 [] = {"http://www.independent.co.uk/incoming/article8465213.ece/alternates/w620/v2-cute-cat-picture.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg"};
		{
			for(int i=0; i<st.length;i++)
			{
				
				Thread.sleep(2000);
				
				WebElement We1 = driver.findElement(FileTab_Upload_Area);
				
				Thread.sleep(2000);
				
				We.sendKeys(st1[i]);
				
				Thread.sleep(4000);
				
				boolean popupyes=false;
				try
				{
					
				 popupyes=driver.findElement(Invalid_File_upload_Alert_Close).isDisplayed();
				
				}
				catch(Exception e)
				{
					System.out.println("Pop Not Found");
				}
				
				boolean yes=false;
				if(!popupyes)
				{
					WebElement We2 = driver.findElement(File_Tab_Post_Button);
					
					WebDriverWait wait = new WebDriverWait(driver,120);
					
					wait.pollingEvery(5, TimeUnit.SECONDS);

					wait.until(ExpectedConditions.elementToBeClickable(We2));
					
					We1.click();
					
					//driver.findElement(File_Tab_Post_Button).click();
				
					yes = driver.findElement(FileTab).isDisplayed();
				}
				if(yes&&!popupyes)
				{
					
					Thread.sleep(3000);
					
					driver.findElement(FileTab).click();
					
					Thread.sleep(3000);
						
				}
				else if(popupyes)
				{
				
					Thread.sleep(3000);
					
					driver.findElement(Invalid_File_upload_Alert_Close).click();				
			
					/*driver.findElement(FileTab_Upload_Area);
				
				
					Thread.sleep(3000);*/
				
				}
				else
				{
					
				}
				
								
			}
			
		
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    
	  }
	
	public void ScrollOption()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    js.executeScript("javascript:window.scrollBy(0,400)");
	}

	public boolean Is_File_Upload_Post_Button_Enabled() {
		
		WebElement We = driver.findElement(File_Tab_Post_Button); 
	
		WebDriverWait wait = new WebDriverWait(driver,200);
		
		wait.pollingEvery(5,TimeUnit.SECONDS);

		return We.isEnabled();
	}

	public boolean Is_File_Upload_Post_Button_Displayed() {
		
		WebElement We = driver.findElement(File_Tab_Post_Button);

		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_File_Upload_Post_Button() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement We = driver.findElement(File_Tab_Post_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,120);
		
		wait.pollingEvery(5, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_File_Tab_Empty_Alert_Enabled() {
		
		WebElement We = driver.findElement(File_Tab_Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_File_Tab_Empty_Alert_Displayed() {
		
		WebElement We = driver.findElement(File_Tab_Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_File_Tab_Empty_Alert_Popup() {
		
		WebElement We = driver.findElement(File_Tab_Empty_Alert_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

	public boolean Is_ThumbNail_Close_Enabled() {
		
		WebElement We = driver.findElement(ThumbNail_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
		
		
	}

	public boolean Is_ThumbNail_Close_Displayed() {
		
		WebElement We = driver.findElement(ThumbNail_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Close_ThumbNail() throws InterruptedException {
	
			
			WebElement We = driver.findElement(ThumbNail_Close);
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			
			wait.until(ExpectedConditions.elementToBeClickable(We));

			We.click();
			
		
	}

	public boolean Is_Image_Enabled() {
	
		WebElement We = driver.findElement(Click_ThumbNail);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
	}

	public boolean Is_Image_Displayed() {
		
		WebElement We = driver.findElement(Click_ThumbNail);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void Click_Image() {
		
		WebElement We = driver.findElement(Click_ThumbNail);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
				
		wait.until(ExpectedConditions.presenceOfElementLocated(Click_ThumbNail));
		
		We.click();
	}

	public void Wait_To_Image_uploaded() 
	{
		WebElement We = driver.findElement(Click_ThumbNail);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
	}
	
	public void Empty_File_Status_Field() throws InterruptedException {
		
		WebElement we = driver.findElement(FileTab_StatusField);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.sendKeys("             ");
	}

	public boolean Progress_bar_Enabled() {
		
		WebElement We = driver.findElement(Progress_bar);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
	}

	public boolean Progress_bar_Displayed() {
		
		WebElement We = driver.findElement(Progress_bar);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();

	}

	public void Click_File_Upload_Area_With_File() throws InterruptedException 
	{
	
		String st [] = {"D:\\Files\\New Microsoft Word Document.docx","D:\\Files\\New Microsoft Excel Worksheet.xlsx"};
		{
			for(int i=0; i<st.length;i++)
			{			
				Thread.sleep(5000);
				
				WebElement We = driver.findElement(FileTab_Upload_Area);
				
				We.sendKeys(st[i]);
				
				Thread.sleep(5000);
				
				boolean popupyes=false;
				try
				{
					
				 popupyes=driver.findElement(Invalid_File_upload_Alert_Close).isDisplayed();
				
				}
				catch(Exception e)
				{
					System.out.println("Pop Not Found");
					
					WebElement We12 = driver.findElement(FileTab_StatusField);
					
					We12.click();
					
					We12.sendKeys("Automated Script posting");
					
					Thread.sleep(5000);
				}
				
				boolean yes=false;
				if(!popupyes)
				{
					WebElement We1 = driver.findElement(clickPost);
					
					WebDriverWait wait = new WebDriverWait(driver,120);
					
					wait.pollingEvery(5, TimeUnit.SECONDS);

					wait.until(ExpectedConditions.elementToBeClickable(We1));
					
					We1.click();
					
					Thread.sleep(5000);
					
					yes = driver.findElement(FileTab).isDisplayed();
				}
				if(yes&&!popupyes)
				{
					
					Thread.sleep(5000);
					
					driver.findElement(FileTab).click();
					
					Thread.sleep(5000);
						
				}
				else if(popupyes)
				{
				
					Thread.sleep(5000);
					
					driver.findElement(Invalid_File_upload_Alert_Close).click();				
			
								
				}
				else
				{
					
				}
				
								
			}
			
		
		}
		Thread.sleep(5000);
		
	    
	  }

	public boolean Is_File_upload_Bar_Close_Button_Is_Enabled() throws InterruptedException {
		
		WebElement We = driver.findElement(FileUpload_Bar_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();

	}

	public boolean Is_File_upload_Bar_Close_Button_Is_Displayed() {
		
		WebElement We = driver.findElement(FileUpload_Bar_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void Click_Close_Button_File_Upload_Bar() {
		
		WebElement We = driver.findElement(FileUpload_Bar_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		
		
		
	}

	public boolean Is_Empty_Alert_Popup_Enabled() {
		
		WebElement We = driver.findElement(File_Tab_Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
		
	}

	public boolean Is_Empty_Alert_Popup_Displayed() {

		WebElement We = driver.findElement(File_Tab_Empty_Alert_Popup);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}

	public void click_Empty_Alert_Popup_Close() {
	
		WebElement we = driver.findElement(File_Tab_Empty_Alert_Close_Button);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
	}
	
	public void Multiple_File_Upload_Area_With_Images() throws InterruptedException 
	{
		
		String st [] = {"C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg","C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg"};
		{
			for(int i=0; i<st.length;i++)
			{			
				Thread.sleep(5000);
				
				WebElement We = driver.findElement(FileTab_Upload_Area);
				
				We.sendKeys(st[i]);
				
				Thread.sleep(5000);
				
				boolean popupyes=false;
				try
				{
					
				 popupyes=driver.findElement(Invalid_File_upload_Alert_Close).isDisplayed();
				
				}
				catch(Exception e)
				{
					System.out.println("Pop Not Found");
					
					WebElement We12 = driver.findElement(FileTab_StatusField);
					
					We12.click();
					
					We12.sendKeys("Automated Script posting");
					
					Thread.sleep(5000);
				}
				
				boolean yes=false;
				if(!popupyes)
				{
					WebElement We1 = driver.findElement(clickPost);
					
					WebDriverWait wait = new WebDriverWait(driver,120);
					
					wait.pollingEvery(5, TimeUnit.SECONDS);

					wait.until(ExpectedConditions.elementToBeClickable(We1));
					
					We1.click();
					
					yes = driver.findElement(FileTab).isDisplayed();
				}
				if(yes&&!popupyes)
				{
					
					Thread.sleep(5000);
					
					driver.findElement(FileTab).click();
					
					Thread.sleep(5000);
						
				}
				else if(popupyes)
				{
				
					Thread.sleep(5000);
					
					driver.findElement(Invalid_File_upload_Alert_Close).click();				
			
								
				}
				else
				{
					
				}
				
								
			}
			
		
		}
		Thread.sleep(5000);
		
	    
	  }

	public boolean Is_Invalid_File_upload_Alert_Popup_Enabled() {
		
		
		WebElement We = driver.findElement(Invalid_File_Upload_Alert);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isEnabled();
		
		
	}
	
	public boolean Is_Invalid_File_upload_Alert_Popup_Displayed() {
		
		WebElement We = driver.findElement(Invalid_File_Upload_Alert);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));

		return We.isDisplayed();
	}
	
	public void Invalid_File_upload_Alert_Popup_Close() {
		
		WebElement We = driver.findElement(Invalid_File_upload_Alert_Close);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	
	}

	public boolean Is_File_Block_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(File_Posted_Block);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_File_Block_Displayed() {

		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(File_Posted_Block);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();		
		
	}

	public String Get_File_Block() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(File_Posted_Block);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		String St = We.getText();
		
		System.out.println("The Content of the file post is: "+St);
		
		return St;
		
	}

	public boolean Is_Image_Block_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Download_Image);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isEnabled();
	}

	public boolean Is_Image_Block_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Download_Image);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_File_Download() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Download_File);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		Thread.sleep(7000);
		
	}

	public void Click_Image_Download() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Download_Image);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		Thread.sleep(7000);
		
	}

}


	 


