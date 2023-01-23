package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        if (driver.findElement(By.cssSelector(".logo img")).isDisplayed()) System.out.println("logo is displayed");

        Driver.quitDriver();

    }
}
