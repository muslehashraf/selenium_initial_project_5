package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.AutomationExercise;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {


        WebDriver driver = AutomationExercise.getHomePage();

        String expectedFooterMessage = "Copyright © 2021 All rights reserved";

        WebElement footer = driver.findElement(By.cssSelector(".footer-bottom p"));

        System.out.println(footer.isDisplayed());

        System.out.println(footer.getText().equals(expectedFooterMessage));

        Driver.quitDriver();
    }
}
