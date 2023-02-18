package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddDuplicateCategoryPage {
	WebDriver driver;
	public AddDuplicateCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validationOfDuplicatCategoryByMessage() {
		String duplicateCategoryText = driver.findElement(By.xpath("//body[contains(text(),'The category you want to add already exists: ')]")).getText();
		System.out.println(duplicateCategoryText);
	}

}
