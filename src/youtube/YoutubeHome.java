package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YoutubeHome {
	
	public static final String URL = "https://www.youtube.com/?hl=sr&gl=RS";
	private static final String SEARCH_XPATH = "//*[@id=\"search\"]";
	private static final String SEARCHBUTTON_XPATH = "//*[@id=\"search-icon-legacy\"]";
	
	public static void search(WebDriver driver) {
		driver.findElement(By.xpath(SEARCH_XPATH)).click();
	}
	public static void typeSong (WebDriver driver) {
		driver.findElement(By.xpath(SEARCH_XPATH)).sendKeys("Rick Astley");
	}
	public static void searchButton(WebDriver driver) {
		driver.findElement(By.xpath(SEARCHBUTTON_XPATH)).click();
	}

}
