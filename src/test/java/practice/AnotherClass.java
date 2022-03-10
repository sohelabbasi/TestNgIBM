package practice;

import org.testng.annotations.Test;

public class AnotherClass {

    @Test(groups = "regression")
    public void eat(){
        System.out.println("object is eating");
    }

    @Test(groups = "regression")
    public void sleep(){
        System.out.println("object is sleeping");
    }

    @Test(groups = "smoke")
    public void work(){
        System.out.println("object is working");
    }
}
