//package com.amazon.qa.test;
//import java.io.IOException;
//import java.util.ArrayList;
//	import java.util.List;
//	import java.util.Set;
//
//	import org.apache.poi.EncryptedDocumentException;
//	import org.testng.Assert;
//	import org.testng.Reporter;
//	import org.testng.annotations.AfterClass;
//	import org.testng.annotations.AfterMethod;
//	import org.testng.annotations.BeforeClass;
//	import org.testng.annotations.BeforeMethod;
//	import org.testng.annotations.Test;
//	import org.testng.asserts.SoftAssert;
//
//	import com.amazon.qa.base.BaseClass;
//	import com.amazon.qa.pages.AmazonHomePage;
//	import com.amazon.qa.pages.AmazonProductPage2;
//	import com.amazon.qa.pages.AmazonProductPage3;
//	import com.amazon.qa.pages.AmazonSearchPage;
//	import com.amazon.qa.util.UtilityClass;
//
//public class Practice extends BaseClass
//	{
//		AmazonHomePage home;
//		AmazonSearchPage searchpage;
//		AmazonProductPage2 productpage;
//		AmazonProductPage3 productpage3;
//		
//		List<String> ex;
//		String exp;
//		
//		@BeforeClass
//		public void launchAmazon() throws InterruptedException
//		{
//			openApplication();
//			home=new AmazonHomePage(driver);
//			searchpage=new AmazonSearchPage(driver);
//			productpage=new AmazonProductPage2(driver);
//			productpage3=new AmazonProductPage3(driver);
//			
//			home.movetoelement(driver);
//			Thread.sleep(2000);
//			home.clickOnSignInButton();	
//		}
//	    
//		@BeforeMethod
//		public void loginToAmazon() throws InterruptedException, IOException
//		{
//			ex=new ArrayList<String>();
//			for(int i=1;i<=2;i++)
//			{
//			String exp=UtilityClass.readConfigProp("Email"+i);
//			ex.add(exp);
//			}
//			
//	     	String act=home.AssetTextEmailOrMobileNumber();
//	     	if(ex.contains(act))
//			{
//				Assert.assertTrue(true);
//			}
//	        Reporter.log("Assert Text Email or mobile phone number", true);
//	        
//	        home.EnterEmailOrMobilePhoneNumber();
//	     	home.clickonContinueButton();
//	     	
//	     	String exp0=UtilityClass.readConfigProp("expected");
//	     	String act0=home.AssetTextPassword();
//	     	Assert.assertEquals(exp0, act0);
//	        Reporter.log("Assert Text Password", true);
//	     	
//	     	home.enterPassword();
//	  	    home.clickOnSignInButton2();
//	  	    String exp1=UtilityClass.readConfigProp("UserName");
//	  	    String act1=home.AssertLoggedUserName();
//	  	  Assert.assertEquals(exp1, act1);
//	      Reporter.log("Assert logged in username", true);
//	     	
//	   }
//		
//	    @Test(priority=1)
//		public void validateTestCase1() throws IOException, InterruptedException
//		{   
//		      searchpage.EnterSearchTextbox();
//	          searchpage.clickOnsubmitbtn();
//	    
//	          String exp2=UtilityClass.readConfigProp("Text");
//	  	      String act2=searchpage.gettextasert();
//	  	      Assert.assertEquals(exp2, act2);
//	          Reporter.log("Assert Text Samsung m32 128gb mobile", true);	    
//		
//		  searchpage.clickOnSamsungMobile1(driver);	  
//		  UtilityClass.windowHandles(driver);
//		  
//		String exp3=UtilityClass.readConfigProp("price");
//	   	String act3=searchpage.getpriceasert();
//	   	String act4=act3.substring(1);
//	  	
//	   	
//	   int a= Integer.parseInt(act4.replace(",", ""));
//	   int b= Integer.parseInt(exp3);
//	  
//	   if(a>b)
//	  {
//		   Assert.assertTrue(true);
//		   Reporter.log("price is greater than 10000", true);
//	 }
//	   //----
//		  searchpage.clickOnaddToCartbtn(driver);
//		  SoftAssert s=new SoftAssert();
//		  searchpage.clickCartbtn(driver);  
//		 	  
//		  String a1=searchpage.verifyQuantity();
//		  String b1="Qty:1";
//		  Assert.assertEquals(a1, b1);
//		  
//		  String act= searchpage.verifyName();
//		  String exp="Samsung Galaxy M32 Prime Edition (Black, 6GB RAM, 128GB)";
//		  Assert.assertEquals(act, exp);
//		  
//		  String actprice=searchpage.verifyPrice();
//		  String expprice="  13,499.00";
//		  Assert.assertEquals(actprice,expprice);
//		  
//		}
//		
//
//		@Test(priority=2)
//		public void validateTestCase2() throws EncryptedDocumentException, IOException, InterruptedException
//		{
//			productpage.EnterSearchTextbox2();
//			productpage.clickOnsubmitbtn2();
//			productpage.clickonAppleMobile(driver);
//			// UtilityClass.windowHandles(driver);
//			
//
//			Set<String> ids=driver.getWindowHandles();
//			ArrayList<String> id=new ArrayList<String>(ids);
//			   
//			   String child=id.get(2);
//			   driver.switchTo().window(child);	
//			productpage.clickOnaddToCartbtn2(driver);
//			productpage.clickCartbtn2(driver);
//
//		}
//		
//		@Test(priority=3)
//		public void validateTestCase3() throws EncryptedDocumentException, IOException, InterruptedException
//		{
//			productpage3.EnterSearchTextbox3();
//			productpage3.clickOnsubmitbtn3();
//			productpage3.clickonRedmeMobile(driver);
//			// UtilityClass.windowHandles(driver);
//			 
//				Set<String> ids=driver.getWindowHandles();
//				ArrayList<String> id=new ArrayList<String>(ids);
//				   
//				   String child=id.get(3);
//				   driver.switchTo().window(child);	
//			 productpage3.clickOnaddToCartbtn3(driver);
//				productpage3.clickCartbtn3(driver);
//			
//		}
//		@AfterMethod
//		public void logoutToAmazon() throws InterruptedException
//		{
//			searchpage.movetoelement2(driver);
//			searchpage.clickOnsignOutbutton2();
//		
//		}
//		
//		@AfterClass
//		public void closeBrowser()
//		{
//			driver.quit();
//		}
//		
//		
//	}
//
//
//
