package com.cybertek;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment5US2AC4 {

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://login.nextbasecrm.com/");
        WebElement email=  Driver.getDriver().findElement(By.xpath("//input[@class='login-inp']"));
        email.sendKeys("hr23@cybertekschool.com");
        WebElement password=  Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");
        WebElement sign =  Driver.getDriver().findElement(By.xpath("//input[@class='login-btn']"));
        sign.click();
        BrowserUtils.wait(3);
    }

    @Test
    public void createQuote(){
        WebElement messageButton = Driver.getDriver().findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']"));
        messageButton.click();
        WebElement quoteButton = Driver.getDriver().findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote bxhtmled-top-bar-btn-active']"));
        quoteButton.click();
        quoteButton.sendKeys("task1");
        

    }
}
