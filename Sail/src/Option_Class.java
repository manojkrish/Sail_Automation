
public class Option_Class {
	
	/*
	 * @Test(priority = 2) public void Status_Feed_TestCase() throws
	 * InterruptedException {
	 * 
	 * StatusFeed sf = new StatusFeed(driver);
	 * 
	 * Dashboard_Widget dw = new Dashboard_Widget(driver);
	 * 
	 * Edit_Status es = new Edit_Status(driver);
	 * 
	 * sf.Scrolling_The_Page();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * s
	 * 
	 * Assert.assertEquals(sf.Is_Status_Feed_Enabled(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Profile_Image_Enabled(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Profile_Image_Displayed(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Status_feed_Text_Field_Enabled(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Status_feed_Text_Field_Displayed(), true);
	 * 
	 * sf.Insert_Empty_Feed();
	 * 
	 * sf.SelectMyFriend();
	 * 
	 * sf.Click_Post_Button();
	 * 
	 * try {
	 * 
	 * driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 * 
	 * Assert.assertEquals(sf.IsEmpty_Status_Alert_Enabled(), true);
	 * 
	 * driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 * 
	 * Assert.assertEquals(sf.IsEmpty_Status_Alert_Displayed(), true);
	 * 
	 * sf.close_Empty_Alert();
	 * 
	 * } catch (NoSuchElementException e)
	 * 
	 * {
	 * 
	 * System.out.println("Empty Alert popup is not displayed");
	 * 
	 * }
	 * 
	 * sf.Insert_Text_In_The_Feed();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * sf.SelectMyFriend();
	 * 
	 * sf.Click_Post_Button();
	 * 
	 * sf.Insert_Text_In_The_Feed();
	 * 
	 * sf.SelectEveryone();
	 * 
	 * sf.Click_Post_Button();
	 * 
	 * Assert.assertEquals(sf.Is_Logged_In_UserName_Enabled(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Logged_In_UserName_Displayed(), true);
	 * 
	 * String st2 = sf.Get_Logged_UserName();
	 * 
	 * try {
	 * 
	 * st2 = st2.replace("Welcome,", "");
	 * 
	 * st2 = st2.replace(".", "");
	 * 
	 * st2 = st2.replace(" S", "S");
	 * 
	 * Assert.assertEquals(sf.Is_Feed_In_UserName_Enabled(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Feed_In_UserName_Displayed(), true);
	 * 
	 * String st3 = sf.Get_Feed_UserName();
	 * 
	 * Assert.assertEquals(st2, st3);
	 * 
	 * } catch (Exception e) { System.out.println("UserName is mismatch" + e); }
	 * 
	 * Assert.assertEquals(sf.Is_Time_Stamp_Enabled(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Time_Stamp_Displayed(), true);
	 * 
	 * System.out.println("Display the timeStamp :" + sf.Get_Time_Stamp());
	 * 
	 * // This is the Code related to the Edit Status post/
	 * 
	 * Assert.assertEquals(es.Is_Logged_In_User_Name_IsEnabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Logged_In_User_Name_IsDisplayed(), true);
	 * 
	 * Assert.assertEquals(es.Is_Logged_In_Feed_Name_IsEnabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Logged_In_Feed_Name_IsDisplayed(), true);
	 * 
	 * Assert.assertEquals(es.Is_Post_Feed_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Post_Feed_Displayed(), true);
	 * 
	 * try {
	 * 
	 * if (st2.contentEquals(es.Get_Feed_Name()))
	 * 
	 * { es.Click_Post_Feed_Option();
	 * 
	 * Assert.assertEquals(es.Is_Edit_option_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Edit_Option_Displayed(), true);
	 * 
	 * es.Click_Edit_Option();
	 * 
	 * es.Clear_Text_Field();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * Assert.assertEquals(es.Is_Done_Button_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Done_Button_Displayed(), true);
	 * 
	 * Assert.assertEquals(es.Is_Cancel_Button_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Cancel_Button_Displayed(), true);
	 * 
	 * es.Click_Done_Button();
	 * 
	 * try {
	 * 
	 * Assert.assertEquals(es.Is_Empty_Alert_Popup_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Empty_Alert_Popup_Displayed(), true);
	 * 
	 * sf.close_Empty_Alert();
	 * 
	 * }
	 * 
	 * catch (NoSuchElementException e) {
	 * 
	 * System.out.println("No Empty Alert Displayed");
	 * 
	 * }
	 * 
	 * es.Click_Post_Feed_Option();
	 * 
	 * es.Click_Edit_Option();
	 * 
	 * es.Clear_Text_Field();
	 * 
	 * es.Insert_Text_In_Edit();
	 * 
	 * es.Click_Done_Button();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * es.Click_Invalid();
	 * 
	 * }
	 * 
	 * else
	 * 
	 * {
	 * 
	 * System.out .println(
	 * "Edit option will not be displayed when the user is not the owner of the Post"
	 * );
	 * 
	 * }
	 * 
	 * } catch (Exception e)
	 * 
	 * {
	 * 
	 * System.out.println("Not valid User :" + e);
	 * 
	 * }
	 * 
	 * Thread.sleep(3000);
	 * 
	 * // Edit the post with no content and clicking on the Done button
	 * 
	 * 
	 * es.Is_Content_Before_Edit_Enabled();
	 * 
	 * es.Is_Content_Before_Edit_Displayed();
	 * 
	 * es.Get_Content_Before_Edit();
	 * 
	 * es.Click_Post_Feed_Option();
	 * 
	 * es.Click_Edit_Option();
	 * 
	 * es.Clear_Text_Field();
	 * 
	 * es.Click_Done_Button();
	 * 
	 * try
	 * 
	 * {
	 * 
	 * Assert.assertEquals(es.Is_Empty_Alert_Popup_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Empty_Alert_Popup_Displayed(), true);
	 * 
	 * sf.close_Empty_Alert();
	 * 
	 * }
	 * 
	 * catch (NoSuchElementException e)
	 * 
	 * { System.out.println("Again No Empty Alert Displayed"); }
	 * 
	 * 
	 * es.Is_Content_After_Edit_Enabled();
	 * 
	 * es.Is_Content_After_Edit_Displayed();
	 * 
	 * es.Get_Content_After_Edit();
	 * 
	 * Assert.assertEquals( es.Get_Content_Before_Edit().contentEquals(
	 * es.Get_Content_After_Edit()), true);
	 * 
	 * // Edit content with the cancel button
	 * 
	 * es.Is_Content_Before_Edit_Enabled();
	 * 
	 * es.Is_Content_Before_Edit_Displayed();
	 * 
	 * es.Get_Content_Before_Edit();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * es.Click_Post_Feed_Option();
	 * 
	 * es.Click_Edit_Option();
	 * 
	 * es.Insert_Text_In_Edit();
	 * 
	 * es.Click_Cancel_Button();
	 * 
	 * es.Is_Content_After_Edit_Enabled();
	 * 
	 * es.Is_Content_After_Edit_Displayed();
	 * 
	 * es.Get_Content_After_Edit();
	 * 
	 * Assert.assertEquals( es.Get_Content_Before_Edit().contentEquals(
	 * es.Get_Content_After_Edit()), true);
	 * 
	 * es.Is_Content_Before_Edit_Enabled();
	 * 
	 * es.Is_Content_Before_Edit_Displayed();
	 * 
	 * es.Get_Content_Before_Edit();
	 * 
	 * es.Click_Post_Feed_Option();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * es.Click_Edit_Option();
	 * 
	 * es.Insert_Text_In_Edit();
	 * 
	 * es.Click_Done_Button();
	 * 
	 * es.Is_Content_After_Edit_Enabled();
	 * 
	 * es.Is_Content_After_Edit_Displayed();
	 * 
	 * es.Get_Content_After_Edit();
	 * 
	 * Assert.assertEquals( es.Get_Content_Before_Edit().contentEquals(
	 * es.Get_Content_After_Edit()), true);
	 * 
	 * // To view the Edited History Test Case
	 * 
	 * try {
	 * 
	 * es.Is_Edited_History_tag_Enabled();
	 * 
	 * es.Is_Edited_History_tag_Displayed();
	 * 
	 * es.click_Edited_History_tag();
	 * 
	 * es.Is_Edited_history_popup_enabled();
	 * 
	 * es.Is_Edited_history_popup_displayed();
	 * 
	 * es.Get_Edited_History_Popup_Header();
	 * 
	 * try { es.Is_View_More_Enabled();
	 * 
	 * es.Is_view_more_Displayed();
	 * 
	 * es.click_View_More(); } catch (NoSuchElementException e) {
	 * System.out.println("No Edited History Content Available"); }
	 * es.Get_Edited_History_Content();
	 * 
	 * System.out.println("The content is : " +
	 * es.Get_Edited_History_Content());
	 * 
	 * es.Close_Edited_History_Popup();
	 * 
	 * } catch (NoSuchElementException e) {
	 * System.out.println("No Edit history tag is displayed"); }
	 * 
	 * //Commenting the post\
	 * 
	 * Comment_In_The_Post cp = new Comment_In_The_Post(driver);
	 * 
	 * es.Scrolling_The_Page();
	 * 
	 * Assert.assertEquals(cp.Is_Comment_Enabled(), true);
	 * 
	 * Assert.assertEquals(cp.Is_Comment_Displayed(), true);
	 * 
	 * cp.Click_Comment_Field();
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * Assert.assertEquals(cp.Is_Comment_Button_Enabled(), true);
	 * 
	 * Assert.assertEquals(cp.Is_Comment_button_Displayed(), true);
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * cp.Multiple_Comment();
	 * 
	 * driver.navigate().refresh();
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * cp.Is_Previous_Comment_Enabled();
	 * 
	 * cp.Is_Previous_Comment_Displayed();
	 * 
	 * cp.Click_Previous_Comment();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * cp.Is_Comment_Feed_Option_Enabled();
	 * 
	 * cp.Is_Comment_Feed_Option_Displayed();
	 * 
	 * cp.Click_Comment_Feed_Option();
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * cp.Click_Comment_Field_Edit();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * cp.Insert_Comment_Edit();
	 * 
	 * cp.Is_Comment_Done_Enabled();
	 * 
	 * cp.Is_Comment_Done_Displayed();
	 * 
	 * cp.Is_Comment_Cancel_Enabled();
	 * 
	 * cp.Is_Comment_Cancel_displayed();
	 * 
	 * cp.click_Comment_Done();
	 * 
	 * try { cp.Is_Edited_history_tag_Enabled();
	 * 
	 * cp.Is_Edited_history_tag_Displayed();
	 * 
	 * cp.Click_Edited_hitsory_tag();
	 * 
	 * try { es.Is_View_More_Enabled();
	 * 
	 * es.Is_view_more_Displayed();
	 * 
	 * es.click_View_More(); } catch (NoSuchElementException e) {
	 * System.out.println("No Edited History Content Available"); }
	 * es.Get_Edited_History_Content();
	 * 
	 * System.out.println("The content is : " +
	 * es.Get_Edited_History_Content());
	 * 
	 * es.Close_Edited_History_Popup();
	 * 
	 * } catch (NoSuchElementException e) {
	 * System.out.println("No Edit history tag is displayed"); }
	 * 
	 * cp.Is_Comment_Feed_Option_Enabled();
	 * 
	 * cp.Is_Comment_Feed_Option_Displayed();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * cp.Click_Comment_Feed_Option();
	 * 
	 * cp.Is_Comment_Field_Delete_Enabled();
	 * 
	 * cp.Is_Comment_Field_Delete_Displayed();
	 * 
	 * cp.Click_Comment_Field_Delete();
	 * 
	 * cp.Is_Delete_popup_Delete_Button_Enabled();
	 * 
	 * cp.Is_Delete_popup_Delete_Button_Displayed();
	 * 
	 * cp.click_Delete_popup_Delete_Button();
	 * 
	 * // Deleting the post.
	 * 
	 * Thread.sleep(2000);
	 * 
	 * es.Is_Post_Feed_Enabled();
	 * 
	 * es.Is_Post_Feed_Displayed();
	 * 
	 * es.Click_Post_Feed_Option();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * es.Is_Delete_Enabled();
	 * 
	 * es.Is_Delete_Displayed();
	 * 
	 * es.Click_Delete();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * es.Is_delete_Popup_Enabled();
	 * 
	 * es.Is_delete_Popup_Displayed();
	 * 
	 * es.Get_popup();
	 * 
	 * es.Click_Delete_button();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * }
	 * 
	 * 
	 * @Test(priority = 4) public void LInksUpload_Test() throws
	 * InterruptedException { Links l = new Links(driver);
	 * 
	 * Edit_Status es = new Edit_Status(driver);
	 * 
	 * Dashboard_Widget dw = new Dashboard_Widget(driver);
	 * 
	 * 
	 * dw.Is_Teaser_Feed_Enabled();
	 * 
	 * dw.Is_Teaser_Feed_Displayed();
	 * 
	 * dw.Click_Feed_Page_Navigation();
	 * 
	 * System.out.println("The page title is :" +driver.getTitle());
	 * 
	 * 
	 * Thread.sleep(3000);
	 * 
	 * l.Is_Link_Tab_Enabled();
	 * 
	 * l.Is_Link_Tab_Displayed();
	 * 
	 * l.Click_Link_Tab();
	 * 
	 * l.Is_Link_Text_Field_Enabled();
	 * 
	 * l.Is_Link_Text_Field_Displayed();
	 * 
	 * l.Click_Link_Text_Field();
	 * 
	 * 
	 * Comment_In_The_Post cp = new Comment_In_The_Post(driver);
	 * 
	 * es.Scrolling_The_Page();
	 * 
	 * Assert.assertEquals(cp.Is_Comment_Enabled(), true);
	 * 
	 * Assert.assertEquals(cp.Is_Comment_Displayed(), true);
	 * 
	 * cp.Click_Comment_Field();
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * Assert.assertEquals(cp.Is_Comment_Button_Enabled(), true);
	 * 
	 * Assert.assertEquals(cp.Is_Comment_button_Displayed(), true);
	 * 
	 * cp.Multiple_Comment();
	 * 
	 * driver.navigate().refresh();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * cp.Is_Previous_Comment_Enabled();
	 * 
	 * cp.Is_Previous_Comment_Displayed();
	 * 
	 * cp.Click_Previous_Comment();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * cp.Is_Comment_Feed_Option_Enabled();
	 * 
	 * cp.Is_Comment_Feed_Option_Displayed();
	 * 
	 * cp.Click_Comment_Feed_Option();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * cp.Click_Comment_Field_Edit();
	 * 
	 * cp.Insert_Comment_Edit();
	 * 
	 * cp.Is_Comment_Done_Enabled();
	 * 
	 * cp.Is_Comment_Done_Displayed();
	 * 
	 * cp.Is_Comment_Cancel_Enabled();
	 * 
	 * cp.Is_Comment_Cancel_displayed();
	 * 
	 * cp.click_Comment_Done();
	 * 
	 * try { cp.Is_Edited_history_tag_Enabled();
	 * 
	 * cp.Is_Edited_history_tag_Displayed();
	 * 
	 * cp.Click_Edited_hitsory_tag();
	 * 
	 * try { es.Is_View_More_Enabled();
	 * 
	 * es.Is_view_more_Displayed();
	 * 
	 * es.click_View_More(); } catch (NoSuchElementException e) {
	 * System.out.println("No Edited History Content Available"); }
	 * es.Get_Edited_History_Content();
	 * 
	 * System.out.println("The content is : " +
	 * es.Get_Edited_History_Content());
	 * 
	 * es.Close_Edited_History_Popup();
	 * 
	 * } catch (NoSuchElementException e) {
	 * System.out.println("No Edit history tag is displayed"); }
	 * 
	 * cp.Is_Comment_Feed_Option_Enabled();
	 * 
	 * cp.Is_Comment_Feed_Option_Displayed();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * cp.Click_Comment_Feed_Option();
	 * 
	 * cp.Is_Comment_Field_Delete_Enabled();
	 * 
	 * cp.Is_Comment_Field_Delete_Displayed();
	 * 
	 * cp.Click_Comment_Field_Delete();
	 * 
	 * cp.Is_Delete_popup_Delete_Button_Enabled();
	 * 
	 * cp.Is_Delete_popup_Delete_Button_Displayed();
	 * 
	 * cp.click_Delete_popup_Delete_Button();
	 * 
	 * Assert.assertEquals(es.Is_Logged_In_User_Name_IsEnabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Logged_In_User_Name_IsDisplayed(), true);
	 * 
	 * Assert.assertEquals(es.Is_Logged_In_Feed_Name_IsEnabled(), true);
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * Assert.assertEquals(es.Is_Post_Feed_Enabled(), true);
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * Assert.assertEquals(es.Is_Post_Feed_Displayed(), true);
	 * 
	 * Assert.assertEquals(es.Is_Logged_In_Feed_Name_IsDisplayed(), true);
	 * 
	 * driver.navigate().refresh();
	 * 
	 * if (es.Get_Logged_In_UserName().contentEquals(es.Get_Feed_Name())) {
	 * 
	 * es.Click_Post_Feed_Option();
	 * 
	 * Assert.assertEquals(es.Is_Edit_option_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Edit_Option_Displayed(), true);
	 * 
	 * es.Click_Edit_Option();
	 * 
	 * try { es.Clear_Text_Field(); } catch(Exception e) {
	 * System.out.println("No Such Element Fouund " +e); }
	 * 
	 * es.Insert_Text_In_Edit();
	 * 
	 * es.Scrolling_The_Page();
	 * 
	 * Assert.assertEquals(es.Is_Done_Button_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Done_Button_Displayed(), true);
	 * 
	 * Assert.assertEquals(es.Is_Cancel_Button_Enabled(), true);
	 * 
	 * Assert.assertEquals(es.Is_Cancel_Button_Displayed(), true);
	 * 
	 * es.Click_Done_Button();
	 * 
	 * try {
	 * 
	 * es.Is_Edited_History_tag_Enabled();
	 * 
	 * es.Is_Edited_History_tag_Displayed();
	 * 
	 * es.click_Edited_History_tag();
	 * 
	 * es.Is_Edited_history_popup_enabled();
	 * 
	 * es.Is_Edited_history_popup_displayed();
	 * 
	 * es.Get_Edited_History_Popup_Header();
	 * 
	 * try { es.Is_View_More_Enabled();
	 * 
	 * es.Is_view_more_Displayed();
	 * 
	 * es.click_View_More(); } catch (NoSuchElementException e) {
	 * System.out.println("No Edited History Content Available"); }
	 * es.Get_Edited_History_Content();
	 * 
	 * System.out.println("The content is : " +
	 * es.Get_Edited_History_Content());
	 * 
	 * es.Close_Edited_History_Popup();
	 * 
	 * } catch (NoSuchElementException e) {
	 * System.out.println("No Edit history tag is displayed"); } }
	 * 
	 * }
	 * 
	 * @Test(priority = 5) public void My_Friends_Test() throws
	 * InterruptedException {
	 * 
	 * Profile_Activity pa = new Profile_Activity(driver);
	 * 
	 * MyFriends mf = new MyFriends(driver);
	 * 
	 * pa.Is_My_Wse_Enabled();
	 * 
	 * pa.Is_My_Wse_Displayed();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * pa.Click_My_Wse();
	 * 
	 * mf.Is_My_Friends_Enabled();
	 * 
	 * mf.Is_My_Friends_Displayed();
	 * 
	 * mf.Click_My_Friends();
	 * 
	 * mf.Is_All_Enabled();
	 * 
	 * mf.Is_All_Displayed();
	 * 
	 * mf.click_All_Tab();
	 * 
	 * mf.get_Members_In_All();
	 * 
	 * System.out.println("Members in the All Tab is : " +
	 * mf.get_Members_In_All());
	 * 
	 * mf.Is_Students_Enabled();
	 * 
	 * mf.Is_Students_Displayed();
	 * 
	 * mf.click_Students_Tab();
	 * 
	 * System.out.println("Members in Students tab is :" +
	 * mf.get_Members_In_Students());
	 * 
	 * mf.Is_Staff_Enabled();
	 * 
	 * mf.Is_Staff_Displayed();
	 * 
	 * mf.click_Staff_Tab();
	 * 
	 * System.out.println("Members in Staff tab is :" +
	 * mf.get_Members_In_Staff());
	 * 
	 * mf.Is_My_Center_Enabled();
	 * 
	 * mf.Is_My_Center_Displayed();
	 * 
	 * mf.click_My_Center_Tab();
	 * 
	 * System.out.println("Members in MyCenter tab is : " +
	 * mf.get_Members_In_MyCenter());
	 * 
	 * mf.Is_Total_Friends_Count_Enabled();
	 * 
	 * mf.Is_Total_Friends_Count_Displayed();
	 * 
	 * System.out.println("Total Friends count :" +
	 * mf.get_Total_Friends_Count());
	 * 
	 * mf.Is_Search_Box_Enabled();
	 * 
	 * mf.Is_Search_Box_Displayed();
	 * 
	 * mf.Enter_Search_UserName();
	 * 
	 * System.out.println("Result of the Search in MyCenter is : " +
	 * mf.get_Members_In_MyCenter());
	 * 
	 * Thread.sleep(2000);
	 * 
	 * 
	 * mf.click_All_Tab();
	 * 
	 * System.out.println("Result of the Search in All is : "+mf.
	 * get_Members_In_All());
	 * 
	 * Thread.sleep(2000);
	 * 
	 * mf.click_Students_Tab();
	 * 
	 * System.out.println("Result of the Search in Student is : "+mf.
	 * get_Members_In_Students());
	 * 
	 * Thread.sleep(2000);
	 * 
	 * mf.click_Staff_Tab();
	 * 
	 * System.out.println("Result of the Search in Staff is : "+mf.
	 * get_Members_In_Staff());
	 * 
	 * 
	 * mf.Is_Find_Friend_Enabled();
	 * 
	 * mf.Is_Find_Friend_Displayed();
	 * 
	 * mf.Click_Find_Friends();
	 * 
	 * }
	 * 
	 * @Test(priority = 6) public void My_Profile_Test() throws
	 * InterruptedException {
	 * 
	 * StatusFeed sf = new StatusFeed(driver);
	 * 
	 * Profile_Activity pa = new Profile_Activity(driver);
	 * 
	 * pa.Is_My_Wse_Enabled();
	 * 
	 * pa.Is_My_Wse_Displayed();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * pa.Click_My_Wse();
	 * 
	 * pa.Is_My_Profile_Enabled();
	 * 
	 * pa.Is_My_Profile_Displayed();
	 * 
	 * pa.Click_My_Profile();
	 * 
	 * Assert.assertEquals(sf.Is_Logged_In_UserName_Enabled(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Logged_In_UserName_Displayed(), true);
	 * 
	 * try {
	 * 
	 * String st2 = sf.Get_Logged_UserName();
	 * 
	 * st2 = st2.replace("Welcome,", "");
	 * 
	 * st2 = st2.replace(".", "");
	 * 
	 * st2 = st2.replace(" S", "S");
	 * 
	 * Assert.assertEquals(sf.Is_Feed_In_UserName_Enabled(), true);
	 * 
	 * Assert.assertEquals(sf.Is_Feed_In_UserName_Displayed(), true);
	 * 
	 * String st3 = pa.Get_Profile_User_Name();
	 * 
	 * Assert.assertEquals(st2, st3);
	 * 
	 * } catch (Exception e) {
	 * 
	 * }
	 * 
	 * String st2 = sf.Get_Logged_UserName();
	 * 
	 * String st4 = st2.substring(9, 29);
	 * 
	 * String st3 = pa.Get_Profile_User_Name();
	 * 
	 * Assert.assertEquals(st4.contentEquals(st3), true);
	 * 
	 * pa.Is_Status_Feed_Tab_Enabled();
	 * 
	 * pa.Is_Status_Feed_Tab_Displayed();
	 * 
	 * pa.Click_Status_Feed_Tab();
	 * 
	 * pa.Is_Status_Feed_Text_Field_Enabled();
	 * 
	 * pa.Is_Status_Feed_Text_Field_Displayed();
	 * 
	 * pa.Click_Status_Feed_Text_Field();
	 * 
	 * pa.Is_Privacy_Status_Enabled();
	 * 
	 * pa.Is_Privacy_Status_Diplayed();
	 * 
	 * pa.Click_Privacy_Status();
	 * 
	 * pa.Is_Every_One_Status_Enabled();
	 * 
	 * pa.Is_Every_One_Status_Displayed();
	 * 
	 * pa.Click_Every_One_Status();
	 * 
	 * pa.Is_Post_Button_Enabled();
	 * 
	 * pa.Is_Post_Button_Displayed();
	 * 
	 * pa.Click_Post_Button();
	 * 
	 * pa.Is_Status_Feed_Text_Field_Enabled();
	 * 
	 * pa.Is_Status_Feed_Text_Field_Displayed();
	 * 
	 * pa.Click_Status_Feed_Text_Field();
	 * 
	 * pa.Is_Privacy_Status_Enabled();
	 * 
	 * pa.Is_Privacy_Status_Diplayed();
	 * 
	 * pa.Click_Privacy_Status();
	 * 
	 * pa.Is_Friends_Status_Enabled();
	 * 
	 * pa.Is_Friends_Status_Displayed();
	 * 
	 * pa.Click_Friends_Status();
	 * 
	 * pa.Is_Post_Button_Enabled();
	 * 
	 * pa.Is_Post_Button_Displayed();
	 * 
	 * pa.Click_Post_Button();
	 * 
	 * pa.Is_Activity_Posted_Status_Feed_Enabled();
	 * 
	 * pa.Is_Activity_Posted_Status_Feed_Disabled();
	 * 
	 * String st = pa.Get_Activity_Posted_Feed_Content();
	 * 
	 * pa.Is_Wse_Header_Enabled();
	 * 
	 * pa.Is_Wse_Header_Displayed();
	 * 
	 * pa.click_Wse_Header();
	 * 
	 * pa.Is_Connect_Field_Enabled();
	 * 
	 * pa.Is_Connect_Field_Displayed();
	 * 
	 * pa.click_Connect_Field();
	 * 
	 * pa.Is_Feeds_Enabled();
	 * 
	 * pa.Is_Feeds_Displayed();
	 * 
	 * pa.click_Feeds();
	 * 
	 * pa.Is_Post_Feed_From_Status_Feed_Enabled();
	 * 
	 * pa.Is_Post_Feed_From_Status_Feed_Displayed();
	 * 
	 * String st1 = pa.Get_Post_Feed_From_Status_Feed();
	 * 
	 * Assert.assertEquals(st.equals(st1), true);
	 * 
	 * pa.Is_My_Wse_Enabled();
	 * 
	 * pa.Is_My_Wse_Displayed();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * pa.Click_My_Wse();
	 * 
	 * pa.Is_My_Profile_Enabled();
	 * 
	 * pa.Is_My_Profile_Displayed();
	 * 
	 * pa.Click_My_Profile();
	 * 
	 * pa.Element_Visibility();
	 * 
	 * pa.getFeeds();
	 * 
	 * }
	 */

}
