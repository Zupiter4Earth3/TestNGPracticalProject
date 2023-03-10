package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
	WebDriver driver;
	@Test
	public void userShouldBeAbleToAddCategory() {
		
		
		driver = BrowserFactory.init();
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.enterCategoryName();
		addCategoryPage.clickAddCategoryButton();
		addCategoryPage.validationOfCategoryDisplay();
		BrowserFactory.tearDown();
	}
}
