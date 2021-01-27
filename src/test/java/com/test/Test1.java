package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test1 {


    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://pastebin.com");


        WebElement searchInput = driver.findElement(By.xpath("//textarea[@name='PostForm[text]']"));
        searchInput.sendKeys("Hello from WebDriver");


        WebElement searchInputName = driver.findElement(By.xpath("//input[@id='postform-name']"));
        searchInputName.sendKeys("helloweb");


        WebElement element = driver.findElement(By.id("select2-postform-expiration-container"));
        element.click();
        WebElement dropdownItem = new WebDriverWait(driver, 5)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By
                                .xpath("//*[@id='select2-postform-expiration-results']/li[contains(text(), '10 Minutes')]")));
        dropdownItem.click();


        WebElement searchBtn = driver.findElement(By.xpath("//button[text()='Create New Paste']"));
        searchBtn.click();










    }
}
