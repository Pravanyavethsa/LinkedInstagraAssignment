package com.bridgelabz.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotDemo {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(1000);

        TakesScreenshot src = (TakesScreenshot) driver;
        File srcShot = src.getScreenshotAs(OutputType.FILE);
        File destinationShot = new File("C:\\Users\\ADMIN\\IdeaProjects\\LocatorsDemo\\src\\main\\resources\\FirstShot.png");
        FileHandler.copy(srcShot, destinationShot);

       WebElement phoneNumberField=driver.findElement(By.name("username"));
        File srcShot1 =phoneNumberField.getScreenshotAs (OutputType.FILE);
        File destinationShot1 = new File("C:\\Users\\ADMIN\\IdeaProjects\\LocatorsDemo\\src\\main\\resources\\SecondShot.png");
        FileHandler.copy(srcShot1, destinationShot1);

        driver.close();
    }
}
