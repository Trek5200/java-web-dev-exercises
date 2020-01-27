package exercises.lsn6inheritance.technology.test;

import exercises.lsn6inheritance.technology.Computer;
import exercises.lsn6inheritance.technology.Laptop;
import exercises.lsn6inheritance.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Laptop testLaptop;

    @Before
    public void createComputerObject(){
        testLaptop = new Laptop("Toshiba", 4, "DVDRW", "Intel_i7", 32, 17.2);
    }

    @Test
    public void testName(){
        assertEquals("Toshiba", testLaptop.getName());
    }

    @Test
    public void testLaptopCpu(){
        assertEquals("Intel_i7", testLaptop.getCpu());
    }

    SmartPhone testSmartPhone;

    @Before
    public void createSmartPhoneObject(){
        testSmartPhone = new SmartPhone("T-Mobile", "AMD", 2, 5.6);
    }

    @Test
    public void testNetworkProvider(){
        assertEquals("T-Mobile", testSmartPhone.getNetworkProvider());
    }

    @Test
    public void testPhoneCpu(){
        assertEquals("AMD", testSmartPhone.getCpu());
    }

}
