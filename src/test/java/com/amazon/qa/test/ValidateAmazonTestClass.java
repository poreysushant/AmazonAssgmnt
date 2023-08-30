package com.amazon.qa.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.amazon.qa.base.BaseClass;
import com.amazon.qa.pages.AmazonHomePage;
import com.amazon.qa.pages.AmazonProductPage1;
import com.amazon.qa.pages.AmazonProductPage2;
import com.amazon.qa.pages.AmazonProductPage3;
import com.amazon.qa.util.UtilityClass;

public class ValidateAmazonTestClass extends BaseClass {
	AmazonHomePage home;

	AmazonProductPage1 productpage1;
	AmazonProductPage2 productpage2;
	AmazonProductPage3 productpage3;

	List<String> ex;
	String exp;

	@BeforeClass
	public void launchAmazon() throws InterruptedException {
		openApplication();
		home = new AmazonHomePage(driver);
		productpage1 = new AmazonProductPage1(driver);
		productpage2 = new AmazonProductPage2(driver);
		productpage3 = new AmazonProductPage3(driver);

		home.movetoelement(driver);
		Thread.sleep(2000);
		home.clickOnSignInButton();
	}

	@BeforeMethod
	public void loginToAmazon() throws InterruptedException, IOException {
		ex = new ArrayList<String>();
		for (int i = 1; i <= 2; i++) {
			String exp = UtilityClass.readConfigProp("Email" + i);
			ex.add(exp);
		}

		String act = home.AssetTextEmailOrMobileNumber();
		if (ex.contains(act)) {
			Assert.assertTrue(true);
		}
		Reporter.log("Assert Text Email or mobile phone number", true);

		home.EnterEmailOrMobilePhoneNumber();
		home.clickonContinueButton();

		String exp0 = UtilityClass.readConfigProp("expected");
		String act0 = home.AssetTextPassword();
		Assert.assertEquals(exp0, act0);
		Reporter.log("Assert Text Password", true);

		home.enterPassword();
		home.clickOnSignInButton2();
		String exp1 = UtilityClass.readConfigProp("UserName");
		String act1 = home.AssertLoggedUserName();
		Assert.assertEquals(exp1, act1);
		Reporter.log("Assert logged in username", true);

	}

	@Test(priority = 1)
	public void validateTestCase1() throws IOException, InterruptedException {
		productpage1.EnterSearchTextbox1();
		productpage1.clickOnsubmitbtn1();

		String exp2 = UtilityClass.readConfigProp("Text");
		String act2 = productpage1.gettextasert();
		Assert.assertEquals(exp2, act2);
		Reporter.log("Assert Text Samsung m32 128gb mobile", true);

		productpage1.clickOnSamsungMobile1(driver);
		UtilityClass.windowHandles(driver);

		String exp3 = UtilityClass.readConfigProp("price");
		String act3 = productpage1.getpriceasert();
		String act4 = act3.substring(1);

		int a = Integer.parseInt(act4.replace(",", ""));
		int b = Integer.parseInt(exp3);

		if (a > b) {
			Assert.assertTrue(true);
			Reporter.log("price is greater than 10000", true);
		}

		productpage1.clickOnaddToCartbtn(driver);
		productpage1.clickCartbtn(driver);

		String a1 = productpage1.verifyQuantity();
		String b1 = "Qty:1";
		Assert.assertEquals(a1, b1);
		Reporter.log("Qty:1 successfully validate", true);

		String act = productpage1.verifyName();
		String exp = "(Refurbished) Samsung Galaxy M32 (Black, 6GB RAM, 128GB Storage";
		Assert.assertEquals(act, exp);
		Reporter.log(
				"assert (Refurbished) Samsung Galaxy M32 (Black, 6GB RAM, 128GB Storage mobile successfully validate",
				true);

		String actprice = productpage1.verifyPrice();
		String expprice = "  11,998.00";
		Assert.assertEquals(actprice, expprice);
		Reporter.log("price successfully validate", true);

	}

	@Test(priority = 2)
	public void validateTestCase2() throws EncryptedDocumentException, IOException, InterruptedException {
		productpage2.EnterSearchTextbox2();
		productpage2.clickOnsubmitbtn2();

		String expA2 = UtilityClass.readConfigProp("Text2");
		String actA2 = productpage2.gettextasertA2();
		Assert.assertEquals(expA2, actA2);
		Reporter.log("Assert apple mobile 14 pro max", true);

		productpage2.clickonAppleMobile(driver);

		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> id = new ArrayList<String>(ids);

		String child = id.get(2);
		driver.switchTo().window(child);

		String expAP2 = UtilityClass.readConfigProp("price");
		String actAP2 = productpage2.getpriceasert2();
		String actAP4 = actAP2.substring(1);

		int a = Integer.parseInt(actAP4.replace(",", ""));
		int b = Integer.parseInt(expAP2);

		if (a > b) {
			Assert.assertTrue(true);
			Reporter.log("price is greater than 10000", true);
		}

		productpage2.clickOnaddToCartbtn2(driver);
		productpage2.clickCartbtn2(driver);

		String a2 = productpage2.verifyQuantity2();
		String b2 = "Qty:1";
		Assert.assertEquals(a2, b2);
		Reporter.log("Qty:1 successfully validate", true);

		String act = productpage2.verifyName2();
		String exp = "Apple iPhone 14 Pro Max (256 GB) - Space Black";
		Assert.assertEquals(act, exp);
		Reporter.log("assert Apple iPhone 14 Pro Max (256 GB) - Space Black mobile successfully validate", true);

		String actprice = productpage1.verifyPrice();
		String expprice = "  1,43,990.00";
		Assert.assertEquals(actprice, expprice);
		Reporter.log("price successfully validate", true);

	}

	@Test(priority = 3)
	public void validateTestCase3() throws EncryptedDocumentException, IOException, InterruptedException {
		productpage3.EnterSearchTextbox3();
		productpage3.clickOnsubmitbtn3();

		String expR3 = UtilityClass.readConfigProp("Text3");
		String actR3 = productpage3.gettextasertR3();
		Assert.assertEquals(expR3, actR3);
		Reporter.log("Assert redmi note 12 pro plus 5g", true);

		productpage3.clickonRedmeMobile(driver);
		// UtilityClass.windowHandles(driver);

		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> id = new ArrayList<String>(ids);

		String child = id.get(2);
		driver.switchTo().window(child);
		productpage3.clickOnaddToCartbtn3(driver);
		productpage3.clickCartbtn3(driver);

		String expRP3 = UtilityClass.readConfigProp("price");
		String actRP3 = productpage3.getpriceasert3();
		String actRP4 = actRP3.substring(1);

		int a = Integer.parseInt(actRP4.replace(",", ""));
		int b = Integer.parseInt(expRP3);

		if (a > b) {
			Assert.assertTrue(true);
			Reporter.log("price is greater than 10000", true);
		}

		productpage3.clickOnaddToCartbtn3(driver);
		productpage3.clickCartbtn3(driver);

		String a3 = productpage3.verifyQuantity3();
		String b3 = "Qty:1";
		Assert.assertEquals(a3, b3);
		Reporter.log("Qty:1 successfully validate", true);

		String act = productpage3.verifyName3();
		String exp = "Redmi Note 12 Pro+ 5G (Obsidian Black, 8GB RAM, 256GB Storage)";
		Assert.assertEquals(act, exp);
		Reporter.log(
				"assert Redmi Note 12 Pro+ 5G (Obsidian Black, 8GB RAM, 256GB Storage) mobile successfully validate",
				true);

		String actprice = productpage1.verifyPrice();
		String expprice = "  29,500.00";
		Assert.assertEquals(actprice, expprice);
		Reporter.log("price successfully validate", true);

	}

	@AfterMethod
	public void logoutToAmazon() throws InterruptedException {
		home.movetoelement2(driver);
		home.clickOnsignOutbutton2();

	}

	@AfterClass

	public void closeBrowser() {
		driver.quit();
	}

}
