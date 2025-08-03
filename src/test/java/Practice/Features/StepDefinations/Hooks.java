package Practice.Features.StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before("@1")
    public void Before1(){
        System.out.println("Data base conection to test home database");
    }
    @Before("@2")
    public void Before2(){
        System.out.println("Data base conenction to test the cart details");
    }
    @After
    public void After(){
        System.out.println("Closing the database connection");
    }
    @BeforeStep
    public void BeforeSteps(){
        System.out.println("Before each steps");
    }
    @AfterStep
    public void AfterSteps(){
        System.out.println("After each steps");
    }
}
