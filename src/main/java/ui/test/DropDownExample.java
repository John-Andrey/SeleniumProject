package ui.test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org. openqa. selenium. By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        //cerca la classe select dalla documentazione selenium
        WebElement ddown = driver.findElement(By.name("primary_product_interest"));
        Select select = new Select(ddown);

        select.selectByValue("sales-i");
        Thread.sleep(2000);
        select.selectByVisibleText("Customer Service");
        Thread.sleep(2000);
        select.selectByIndex(5);
        Thread.sleep(2000);

        //for multi selection use multi-select
        driver.close();
    }
}
