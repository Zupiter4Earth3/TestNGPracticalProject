package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import page.AddDuplicateCategoryPage;
import util.BrowserFactory;

public class AddDuplicateCategoryTest {
	WebDriver driver;
	@Test
	public void userShouldNotBeAbleToAddDuplicateCategory() {
		
		driver = BrowserFactory.init();
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategoryPage.enterCategoryName();
		addCategoryPage.clickAddCategoryButton();
		addCategoryPage.enterDuplicateCatgory();
		addCategoryPage.clickAddCategoryButton();
		AddDuplicateCategoryPage addDuplicateCategoryPage = PageFactory.initElements(driver, AddDuplicateCategoryPage.class);
		addDuplicateCategoryPage.validationOfDuplicatCategoryByMessage();
		BrowserFactory.tearDown();
		
	}

}
