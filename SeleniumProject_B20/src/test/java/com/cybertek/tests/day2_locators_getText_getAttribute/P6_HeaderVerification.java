package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {
    public static void main(String[] args) {

        // 1. open chrome browser
        // 2. got to http://zerowebappsecurity.com/login.html
        // 3. verify header test
        // Expected: "Log into zero bank"

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zerowebappsecurity.com/login.html");


        // locate the header
        // get the text of the header

        // WebElement header = driver.findElement(By.tagName("h3")); //find element retuns WebElement
        driver.findElement(By.tagName("h3")).getText(); 

        String actualText = driver.findElement(By.tagName("h3")).getText(); // returns string
        String expectedText = "Log in to ZeroBank";

        if(actualText.equals(expectedText)){
            System.out.println("Header verification PASSED!");
        }else{
            System.out.println("Header verification FAILED!");
        }




    }
}
