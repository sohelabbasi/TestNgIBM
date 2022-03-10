package secondpackage;

import org.testng.annotations.Test;

public class TestClass {

    @Test(groups = "regression")
    public void testMethod(){
        System.out.println("Method in another package");
    }

    @Test(groups = "smoke")
    public void testMethod2(){
        System.out.println("Method in another package for smoke");
    }
}
