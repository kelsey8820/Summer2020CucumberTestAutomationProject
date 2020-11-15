package com.cybertek;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment6US1AC2 {

    @BeforeMethod
    public void setup () throws InterruptedException{
        Driver.getDriver().get("http://library2.cybertekschool.com");
        WebElement email=  Driver.getDriver().findElement(By.xpath("//input[@id='inputEmail']"));
        email.sendKeys("student93@library");
        WebElement password=  Driver.getDriver().findElement(By.xpath("//input[@id='inputPassword']"));
        password.sendKeys("QU5745l5");
        WebElement sign =  Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
        sign.click();
        BrowserUtils.wait(3);
    }

    @Test
    public void BorrowedBy(){
        WebElement booksModule = Driver.getDriver().findElement(By.xpath("(//span[@class='title'])[3]"));
        booksModule.click();
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@class='form-control input-sm input-small input-inline']"));
        searchBox.sendKeys("Amelia Rath");
        BrowserUtils.wait(3);
        WebElement result = Driver.getDriver().findElement(By.xpath("//td[@class='Amelia Rath']"));
        BrowserUtils.wait(3);

        Assert.assertTrue(result.isDisplayed());
    }



}
