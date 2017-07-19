package com.azlan.assignments.question1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.runner.RunWith;

//import org.testng.Assert;
//import org.testng.annotations.*;

/**
 * Created by Azlan on 10/7/2017.
 */
@RunWith(DataProviderRunner.class)
public class IPAddressValidatorTest {

    private IPAddressValidator ipAddressValidator;

    @Before
    public void initData(){
        ipAddressValidator = new IPAddressValidator();
    }

    @DataProvider
    public static Object[][] ValidIPAddressProvider() {
        return new Object[][]{
                new Object[] {"1.1.1.1"},new Object[] {"255.255.255.255"},
                new Object[] {"192.168.1.1"},new Object[] {"10.10.1.1"},
                new Object[] {"132.254.111.10"},new Object[] {"26.10.2.10"},
                new Object[] {"127.0.0.1"}
        };
    }

    @DataProvider
    public static Object[][] InvalidIPAddressProvider() {
        return new Object[][]{
                new Object[] {"10.10.10"},new Object[] {"10.10"},
                new Object[] {"10"},new Object[] {"a.a.a.a"},
                new Object[] {"10.0.0.a"},new Object[] {"10.10.10.256"},
                new Object[] {"222.222.2.999"},new Object[] {"999.10.10.20"},
                new Object[] {"2222.22.22.22"},new Object[] {"22.2222.22.2"},
                new Object[] {"10.10.10"},new Object[] {"10.10.10"},
        };
    }

//    @Test(dataProvider = "ValidIPAddressProvider")
    @Test
    @UseDataProvider("ValidIPAddressProvider")
    public void ValidIPAddressTest(String ip) {
        boolean valid = ipAddressValidator.validate(ip);
        System.out.println("IPAddress is VALID : " + ip + " , " + valid);
        Assert.assertEquals(true, valid);
    }

//    @Test(dataProvider = "InvalidIPAddressProvider",
//            dependsOnMethods="ValidIPAddressTest")
    @Test
    @UseDataProvider("InvalidIPAddressProvider")
    public void InValidIPAddressTest(String ip) {
        boolean valid = ipAddressValidator.validate(ip);
        System.out.println("IPAddress is INVALID : " + ip + " , " + valid);
        Assert.assertEquals(false, valid);
    }
}
