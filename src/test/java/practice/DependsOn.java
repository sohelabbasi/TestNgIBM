package practice;

import org.testng.annotations.Test;

public class DependsOn{

    @Test
    public void login(){
        System.out.println("This is login function");
    }

    @Test(dependsOnMethods = "login")
    public void verifyDashboard(){
        System.out.println("I am verifying dashboard");
    }

}
