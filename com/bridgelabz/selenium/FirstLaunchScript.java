package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstLaunchScript {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.close();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
        firefoxDriver.get("https://www.facebook.com/");
        firefoxDriver.quit();

        InternetExplorerDriver internetExplorerDriver = new InternetExplorerDriver();
       internetExplorerDriver.manage().window().maximize();
       internetExplorerDriver.get("https://www.facebook.com/");
       internetExplorerDriver.quit();

    }

}
