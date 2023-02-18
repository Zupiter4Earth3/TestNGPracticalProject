package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class MonthDropDownPage {
	WebDriver driver;
	
	public MonthDropDownPage(WebDriver driver) {
		this.driver =driver;
		}
	@FindBy(how = How.NAME, using = "due_month") WebElement monthElement;
		
	public void ValidationOfAllMonthsInDropDown() {
		
		Select sel = new Select(monthElement);
		List<WebElement> options = sel.getOptions();
		for(WebElement months:options ) {
			System.out.println(months.getText());
		}
	}
}
