package testcases;

import org.testng.annotations.Test;

import com.automationpractice.pageobject.signin.HomePageObjectClass;
import com.automationpractice.pageobject.signin.SignInPageObjectClass;
import com.automationpractice.webtesting.Testcase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ExampleTestcase0001 extends Testcase{
	
	@Test
	public void Test() {
		HomePageObjectClass home = new HomePageObjectClass(wDriver);
		home.goToSignPage();
		SignInPageObjectClass page = new SignInPageObjectClass(wDriver);
		page.signInWith("test@test.com", "password");
		Assert.assertEquals(page.authenticationStatus(), "Failed");
	}

	@BeforeClass
	public void Setup() {
		Testcase.init("chrome", "http://automationpractice.com/", 10, true);
	}

	@AfterClass
	public void Cleanup() {
		Testcase.quit();
	}

}
