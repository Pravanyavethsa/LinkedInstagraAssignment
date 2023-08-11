package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class FileUploadRobot {
    public static WebDriver driver;
    public static void main(String[] args)throws InterruptedException,AWTException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.foundit.in/seeker/registration?");
        Thread.sleep(1000);

        Robot robot=new Robot();
        robot.mouseMove(551,357);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        StringSelection selection=new StringSelection("C:\\Users\\ADMIN\\Documents\\sample");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(500);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.mouseWheel(5);
    }
}
