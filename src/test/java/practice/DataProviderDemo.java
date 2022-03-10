package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    WebDriver driver;

    @DataProvider
    public Object[][] dataProviderFunction() {
        Object[][] login = new Object[3][2];
        login[0][0] = "Admin";
        login[0][1] = "Hum@nhrm123";
        login[1][0] = "Admin";
        login[1][1] = "Hum@nhrm123";
        login[2][0] = "Admin";
        login[2][1] = "Hum@nhrm123";
        return login;
    }

    @Test(dataProvider = "dataProviderFunction")
    public void test(String usernamevalue, String passwordvalue) {
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
        usernameField.sendKeys(usernamevalue);

        WebElement passwordField = driver.findElement(By.cssSelector("input#txtPassword"));
        passwordField.clear();
        passwordField.sendKeys(passwordvalue);

        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();
        driver.close();
    }
}