package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;

public class DropDown {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(500);

        WebElement dayDropDown = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDropDown);
        daySelect .selectByValue("19");

        Thread.sleep(500);
        WebElement monthDropDown = driver.findElement(By.id("month"));
        Select monthSelect = new Select(monthDropDown);
        monthSelect.selectByVisibleText("May");
        Thread.sleep(500);

        WebElement yearDropDown = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDropDown);
        yearSelect.selectByIndex(1);

        driver.navigate().back();
        driver.navigate().to("https://formstone.it/components/dropdown/demo/");

        WebElement optionGroup=driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/form/fieldset/div/button"));
        optionGroup.sendKeys(Keys.PAGE_DOWN);
        optionGroup.click();


        driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/form/fieldset/div/div/div[2]/button[6]")).click();


//        driver.navigate().forward();
        Thread.sleep(3000);
        driver.close();
    }
}







