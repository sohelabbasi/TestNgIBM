package secondpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {

    public WebDriver driver;

   @Test(groups = "regression")
    public void test1() {
        WebDriverManager.chromedriver().setup();
        //initializing the chrome driver instance
        driver = new ChromeDriver();
        System.out.println("My browser is opened");
        //to clear all the cookies
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement usernameField = driver.findElement(By.cssSelector("input#txtUsername"));
        usernameField.clear();
        usernameField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.cssSelector("input#txtPassword"));
        passwordField.clear();
        passwordField.sendKeys("HUm@nhrm123");

        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();
        driver.close();

    }

    @Test(groups = "regression")
    public void test2() {
        WebDriverManager.chromedriver().setup();
        //initializing the chrome driver instance
        driver = new ChromeDriver();
        System.out.println("My browser is opened");
        //to clear all the cookies
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement usernameField = driver.findElement(By.cssSelector("input#txtUsername"));
        usernameField.clear();
        usernameField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.cssSelector("input#txtPassword"));
        passwordField.clear();
        passwordField.sendKeys("HUm@nhrm123");

        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();
        driver.close();

    }

}
