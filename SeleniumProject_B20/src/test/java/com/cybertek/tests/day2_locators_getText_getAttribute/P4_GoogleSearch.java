package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {

        // TC #4 Google search
        // set up the browser driver

        WebDriverManager.chromedriver().setup();

        // open a chrome browser

        WebDriver driver = new ChromeDriver();

        // Go to: https://google.com

        driver.get("https://google.com");

        // write "apple" in the search box
        // to be able to write anything in the search box
        // I need to locate the search box and use sendKeys() method to send "apple"

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        // click google search button
        // verify title:
        // Expected: title should start with "apple" word

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Search title verification PASSED!");
        }else{
            System.out.println("Search title verification FAILED!");
        }

    }
}
