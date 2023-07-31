package exampgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wappalyzer {
	ChromeDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.wappalyzer.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() {
		WebElement resourcesLink = driver.findElement(By.xpath("//span[normalize-space()='Resources']"));
        resourcesLink.click();
        
        WebElement technologiesLink = driver.findElement(By.xpath("//div[@class='v-list-item__title subtitle-2'][normalize-space()='Technologies']"));
        technologiesLink.click();

        WebElement shopifyLink = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span"));
        shopifyLink.click();

         WebElement createLeadListButton = driver.findElement(By.xpath("//span[normalize-space()='Create a lead list']"));
        createLeadListButton.click();

        WebElement technologiesCheckbox = driver.findElement(By.xpath("//div[@class='v-input v-input--hide-details theme--dark v-input--selection-controls v-input--checkbox']//div[@class='v-input--selection-controls__ripple']"));
        technologiesCheckbox.click();

        
	}
}
