package com.group23.tests.jira3;

import com.sun.tools.internal.xjc.model.CElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.utilities.Assert;

public class VytrackLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String URL = "https://qa2.vytrack.com/user/login";
        driver.get(URL);


        // Entering username
        driver.findElement(By.id("prependedInput")).sendKeys("user173");

        // Entering password
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        // Clicking on the login button
        driver.findElement(By.id("_submit")).click();

        // Click on "fleet" button and click on "vehicle odometer"

        driver.findElement(By.xpath("title title-level-1"));
        driver.findElement(By.xpath("title title-level-2"));

        

    }
}


















