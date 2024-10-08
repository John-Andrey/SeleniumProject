package ui.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinksExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();

        List<WebElement> alltags = driver.findElements(By.tagName("a"));
        System.out.println("Total tags are : "+alltags);
        for(int i = 0;i< alltags.size();i++){
            System.out.println("Links on page are" +  alltags.get(i).getAttribute("href"));
            System.out.println("Links on page are" +  alltags.get(i).getText());
        }
    }
}
