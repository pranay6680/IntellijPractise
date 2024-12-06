package testcode;

import com.sportsdirect.demo.myCoolApp.controller.TestRest;
//import org.junit.Test;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testingSample {
    @Test
    public void Addin(){
        TestRest kyle = new TestRest();
        int imStoring = kyle.add(10,20);
        assertEquals(30, imStoring, "it is 30");
        System.out.println(imStoring);
    }
}
