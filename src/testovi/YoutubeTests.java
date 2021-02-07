package testovi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import youtube.Song;
import youtube.SuggestedSong;
import youtube.YoutubeHome;

public class YoutubeTests {
	
	WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\drive\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 1)
	public void testInsertSong() {
		
		driver.navigate().to(YoutubeHome.URL);
		YoutubeHome.search(driver);
		YoutubeHome.typeSong(driver);
		YoutubeHome.searchButton(driver);
		
		String expected = driver.getCurrentUrl();
		String actual = Song.URL;
		
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 2)
	public void testPlaySong () {
		
		driver.navigate().to(Song.URL);
		Song.playSong(driver);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Song.skipAds(driver);
		String expected = SuggestedSong.URL;
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, expected);
		
	}
	@Test(priority = 3)
	public void testSuggestedSong() {
		
		driver.navigate().to(SuggestedSong.URL);
		SuggestedSong.playNext(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=RDdQw4w9WgXcQ&start_radio=1&ab_channel=RickAstleyVEVO";
		
		Assert.assertEquals(actual, expected);
	}
}
