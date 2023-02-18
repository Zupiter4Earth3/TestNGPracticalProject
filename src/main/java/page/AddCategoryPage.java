package page;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage extends BasePage {
	WebDriver driver;
	String category = "Framework";

	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']")
	WebElement addCategoryElement;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement addCategoryButton;

	String enteredCategory;

	public void enterCategoryName() {
		enteredCategory = category + generatedRandomNum(999);
		addCategoryElement.sendKeys(enteredCategory);
	}
	public void enterDuplicateCatgory() {
		addCategoryElement.sendKeys(enteredCategory);
	}

	public void clickAddCategoryButton() {
		addCategoryButton.click();
	}
	
	public void validationOfCategoryDisplay() {
		
		WebElement addedCategory = driver.findElement(By.xpath("//span[contains(text(),enteredCategory)]"));
		if (addedCategory.isDisplayed()) {
			System.out.println("Text of element found:" + enteredCategory );
		}

		else {
			System.out.println("Element not found");
		}
		
	}
}
