package TestCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    @Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://www.rightmove.co.uk/");
        WebElement searchElement = d.findElement(By.xpath("//*[@id=\"_3OuiRnbltQyS534SB4ivLV\"]/div/div/div/div/input"));
       searchElement.sendKeys("Apperley Bridge Station");
        WebElement Button = d.findElement(By.xpath("//*[@id=\"_3OuiRnbltQyS534SB4ivLV\"]/div/div/div/button[1]"));
        Button.click();
        WebElement PrimaryButton = d.findElement(By.xpath("//*[@id=\"submit\"]"));
        PrimaryButton.click();
      

    }
}
