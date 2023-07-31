package exampgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YathraCountLinks {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links="+links.size());
		for(WebElement link : links) {
			String href = link.getAttribute("href");
			String text = link.getText();
			System.out.println("Link:" + href);
			System.out.println("Text:" + text);
		}
	}
	
}
