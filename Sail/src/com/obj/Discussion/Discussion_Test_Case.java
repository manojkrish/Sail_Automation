package com.obj.Discussion;

import org.testng.annotations.Test;

import com.obj.Browser.BrowserInit;

public class Discussion_Test_Case extends BrowserInit
{
	
	@Test//(priority = 7)
	public void Navigate_To_Discussion_Page_Test() throws InterruptedException {

		Discussion d = new Discussion(driver);
		
		d.Is_Connect_Displayed();
		
		d.Click_Connect();
		
		d.Is_Discussions_Displayed();
		
		d.Click_Discussions();
		
	}

	@Test//(priority = 8)
	public void filtering_Unfiltering_Discussion_Test()
	{
		
		Discussion d = new Discussion(driver);
		
		d.Is_Connect_Displayed();
		
		d.Click_Connect();
		
		d.Is_Discussions_Displayed();
		
		d.Click_Discussions();
		
		d.Is_All_Category_Displayed();
		
		d.Click_All_Category();
		
		d.Is_All_Result_displayed();
		
		d.Get_All_result_Count();
		
		d.Unclick_All_Category();
		
		
	}

	@Test//(priority=9)
	public void Discussion_Replies_test() throws InterruptedException{
		
		Discussion d = new Discussion(driver);
		
		d.Is_Connect_Displayed();
		
		d.Click_Connect();
		
		d.Is_Discussions_Displayed();
		
		d.Click_Discussions();
		
		d.Is_Search_Input_Box_Displayed();
		
		d.Enter_The_Search();
		
		Thread.sleep(3000);
		
		d.Is_Discussion_Tile_Displayed();
		
		d.Click_Discussion_Page();
		
		d.Is_Discussion_Reply_Displayed();
		
		d.Enter_Discussion_Reply();	
		
		d.click_Discussion_Reply_Post_Btn();
		
	}

	@Test//(priority=10)
	public void Discussion_Replies_Option_Test() throws InterruptedException{
		
		Discussion d = new Discussion(driver);
		
		d.Is_Connect_Displayed();
		
		d.Click_Connect();
		
		d.Is_Discussions_Displayed();
		
		d.Click_Discussions();
		
		d.Is_Search_Input_Box_Displayed();
		
		d.Enter_The_Search();
		
		Thread.sleep(3000);
		
		d.Is_Discussion_Tile_Displayed();
		
		d.Click_Discussion_Page();
		
		d.Is_Discussion_Btn_Displayed();
		
		d.Click_Discussion_Btn();
		
	}
	
	@Test//(priority=11)
	public void Editing_Discussion_Replies_Test() throws InterruptedException
	{
		
		Discussion d = new Discussion(driver);
		
		d.Is_Connect_Displayed();
		
		d.Click_Connect();
		
		d.Is_Discussions_Displayed();
		
		d.Click_Discussions();
		
		d.Is_Search_Input_Box_Displayed();
		
		d.Enter_The_Search();
		
		Thread.sleep(3000);
		
		d.Is_Discussion_Tile_Displayed();
		
		d.Click_Discussion_Page();
		
		d.Is_Discussion_Btn_Displayed();
		
		d.Click_Discussion_Btn();
		
		d.Is_Edit_Option_Displayed();
		
		d.Click_Edit_Option();
		
		Thread.sleep(2000);
		
		d.Is_Edit_Text_Displayed();
		
		d.Insert_Text_Edit();
		
		d.Edit_Done_Button_Displayed();
		
		d.Click_Edit_Done_Button();
		
	}

	@Test//(priority=12)
	public void Deleting_Discussion_Replies_Test() throws InterruptedException{
		
		Discussion d = new Discussion(driver);
		
		d.Is_Connect_Displayed();
		
		d.Click_Connect();
		
		d.Is_Discussions_Displayed();
		
		d.Click_Discussions();
		
		d.Is_Search_Input_Box_Displayed();
		
		d.Enter_The_Search();
		
		Thread.sleep(3000);
		
		d.Is_Discussion_Tile_Displayed();
		
		d.Click_Discussion_Page();
		
		d.Is_Discussion_Btn_Displayed();
		
		d.Click_Discussion_Btn();
		
		d.Is_Delete_Option_Displayed();
		
		d.Click_Delete_Option();
		
		d.Is_Delete_Popup_Displayed();
		
		d.Is_Delete_popup_Delete_Button_Displayed();
		
		d.Click_Delete_Popup_Delete_Button();
		
	}

}
