package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MonthDropDownPage;
import util.BrowserFactory;

public class MonthDropDownTest {
	
	WebDriver dirver;
	@Test
	public void userShouldBeAbleToSeeAllTheMonths() {
		dirver = BrowserFactory.init();
		
		MonthDropDownPage monthDropDownPage = PageFactory.initElements(dirver, MonthDropDownPage.class);
		monthDropDownPage.ValidationOfAllMonthsInDropDown();
		
		BrowserFactory.tearDown();
	}

}
