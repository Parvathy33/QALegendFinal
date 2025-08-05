package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtility {
	public static boolean isTextPresentInTable(WebDriver driver, String tableXpath, String searchText) {
		List<WebElement> rows = driver.findElements(By.xpath(tableXpath));
		for (WebElement row : rows) {
			String rowText = row.getText();
			if (rowText.contains(searchText)) {
				System.out.println("Text found in row: " + rowText);
				return true; // Text found
			}
		}
		return false; // Text not found
	}

}

