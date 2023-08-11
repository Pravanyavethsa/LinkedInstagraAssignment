package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        List<WebElement> elements = driver.findElements(By.className("_6lux"));
       // Index of list start with 0,1,2....//
        System.out.println("No of elements in list : " + elements.size());

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);

        WebElement firstName=driver.findElement(By.xpath("//*[@placeholder='First name']"));
        firstName.sendKeys("testing");
        Thread.sleep(500);
        firstName.clear();

        List<WebElement> radioElements= driver.findElements(By.className("_8esa"));
       driver.findElements(By.className("_8esa")).get(0).click();

        int radioEleSize = radioElements.size();
        for (int i=0; i< radioEleSize; i++) {
            Thread.sleep(1000);
            radioElements.get(i).click();
            System.out.println("Button Clicked");
        }
        driver.close();
    }
}
