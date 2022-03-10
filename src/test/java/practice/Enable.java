package practice;

import org.testng.annotations.Test;

public class Enable {

    @Test
    public void first(){
        System.out.println("This is first test");
    }

    @Test(enabled = false)
    public void second(){
        System.out.println("This is second test");
    }

    @Test
    public void third(){
        System.out.println("This is third test");
    }
}
