package practice;

import org.testng.annotations.*;

public class FirstTestNG {

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is after class");
    }


    @BeforeMethod
    public void preCondition(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void postCondition(){
        System.out.println("I am after method");
    }

    @Test(priority = 3)
    public void test(){
        System.out.println("this is first test");
    }

    @Test(priority = 2)
    public void second(){
        System.out.println("This is second test");
    }

    @Test(priority = 1)
    public void third(){
        System.out.println("This is third test");
    }


}
