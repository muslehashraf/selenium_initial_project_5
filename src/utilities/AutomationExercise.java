package utilities;

import org.openqa.selenium.WebDriver;

public class AutomationExercise {
    public static WebDriver driver;

    public static WebDriver getHomePage(){
        driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        return driver;
    }

}
