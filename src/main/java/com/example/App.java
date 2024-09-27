package com.example;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   //chrome browser config
        System.setProperty("webdriver.chrome.driver","C:\\Users\\a.adam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //per firefox  System.setProperty("webdriver.gecko.driver","C:\\Users\\a.adam\\Downloads\\chromedriver-win64\\chromedriver-win64\\geckodriver.exe");
        //!!bisogna scaricare il driver di firefox della versione che si ha dal sito ufficiale selenium
        //FirefoxDriver driver= new FirefoxDriver();

        //per Edge bisogna fare la stessa cosa
        //System.setProperty("webdriver.edge.driver","C:\\Users\\a.adam\\Downloads\\chromedriver-win64\\chromedriver-win64\\msedgedriver.exe");
        // EdgeDriver driver= new EdgeDriver();
        System.out.println( "Hello World!" );
        ChromeDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
