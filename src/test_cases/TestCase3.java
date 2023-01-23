package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.AutomationExercise;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = AutomationExercise.getHomePage();

        WebElement subscriptionHeader = driver.findElement(By.cssSelector(".single-widget>h2"));
        System.out.println("Is displayed: " + subscriptionHeader.isDisplayed());
        System.out.println(subscriptionHeader.getText().equals("SUBSCRIPTION"));

        WebElement subscriptionEmailBox = driver.findElement(By.id("susbscribe_email"));
        System.out.println(subscriptionEmailBox.isDisplayed());
        System.out.println(subscriptionEmailBox.getAttribute("placeholder").equals("Your email address"));

        WebElement subscriptionSubmitButton = driver.findElement(By.id("subscribe"));
        System.out.println("Button is Displayed: " + subscriptionSubmitButton.isDisplayed());

        WebElement subscriptionMessage = driver.findElement(By.cssSelector(".searchform>p"));
        String expectedMessage = "Get the most recent updates from\nour site and be updated your self...";
        System.out.println("Message is Displayed: " + subscriptionMessage.isDisplayed());
        System.out.println(subscriptionMessage.getText().equals(expectedMessage));

        Driver.quitDriver();

    }
}
