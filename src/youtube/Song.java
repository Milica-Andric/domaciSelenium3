package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Song {
	
	public static final String URL = "https://www.youtube.com/results?search_query=Rick+Astley";
	private static final String SONG_XPATH = "//*[@id=\"video-title\"]/yt-formatted-string";
	private static final String SKIP_XPATH = "//*[@id=\"ad-text:r\"]";
	
	public static void playSong(WebDriver driver) {
		driver.findElement(By.xpath(SONG_XPATH)).click();
	}
	public static void skipAds(WebDriver driver) {
		try {
			driver.findElement(By.xpath(SKIP_XPATH));
		} catch(Exception e) {
			System.out.println("nema");
		}
	}
	
	
}
