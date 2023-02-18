package page;

import java.util.Random;

public class BasePage {
	public int generatedRandomNum(int boundaryNum) {
		Random rdn = new Random();
		int generatedNumber = rdn.nextInt(boundaryNum);
		return generatedNumber;
	}
}
