package com.example;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   System.setProperty("webdriver.chrome.driver","C:\\Users\\a.adam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        System.out.println( "Hello World!" );
        ChromeDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
