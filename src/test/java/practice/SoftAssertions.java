package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    WebDriver driver;
             @Test
             public void test() {
        WebDriverManager.chromedriver().setup();
        //initializing the chrome driver instance
        driver = new ChromeDriver();
        System.out.println("My browser is opened");
        //to clear all the cookies
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        SoftAssert soft = new SoftAssert();


        String titleActual = driver.getTitle();
        String expectedTitle = "Human Management Syste";

                 System.out.println("I am still executing even after failed assertion");

        //soft assertion
      soft.assertEquals(titleActual, expectedTitle);

      String url = driver.getCurrentUrl();
      String expected = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login";

      soft.assertEquals(url, expected);

        WebElement username = driver.findElement(By.id("txtUsername"));
        soft.assertTrue(username.isDisplayed());

        System.out.println("Passed:::::::::::::::::::::::");

        driver.close();
        soft.assertAll();
        //this should be the last statement of your test case

    }
}
