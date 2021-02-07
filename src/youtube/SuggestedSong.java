package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuggestedSong {
	
	public static final String URL = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
	private static final String NEXTSONG_URL = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=RDdQw4w9WgXcQ&start_radio=1&ab_channel=RickAstleyVEVO";
	
	public static void playNext (WebDriver driver) {
		driver.navigate().to(NEXTSONG_URL);
	}

}
