import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.AutomationExercise;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = AutomationExercise.getHomePage();

        List<String> expectedHeaderTitles = new ArrayList<>(Arrays.asList("Home",
                "Products",
                "Cart",
                "Signup / Login",
                "Test Cases",
                "API Testing",
                "Video Tutorials",
                "Contact us"));

        List<WebElement> headerList = driver.findElements(By.cssSelector(".navbar-nav>li"));

        for (int i = 0; i < headerList.size(); i++) {
            String expected = expectedHeaderTitles.get(i);
            WebElement actual = headerList.get(i);

            System.out.println("Displayed: " + actual.isDisplayed());
            System.out.println("Enabled: " + actual.isEnabled());
            System.out.println(actual.getText().contains(expected));
        }

        Driver.quitDriver();
    }
}