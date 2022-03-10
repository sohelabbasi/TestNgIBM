package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

    public WebDriver driver;

    @Test
    public void firstAssertion(){

        WebDriverManager.chromedriver().setup();
        //initializing the chrome driver instance
        driver = new ChromeDriver();
        System.out.println("My browser is opened");
        //to clear all the cookies
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

       String titleActual =  driver.getTitle();
       String expectedTitle = "Human Management Syste";

       //hard assertion
        //it stops overall execution as soon as it encounters the error
        Assert.assertEquals(titleActual, expectedTitle);
        System.out.println("Passed:::::::::::::::::::::::");
        driver.close();
    }

}
