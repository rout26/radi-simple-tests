package MF.simple.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppA() {
        System.out.print("AppTest.testAppA");
        assertTrue(true);
    }

    public void testAppB() {
        System.out.print("AppTest.testAppB");
        assertTrue(true);
    }

    public void testAppC() {
        assertTrue(true);
    }
    
    public void testLongName_1_0123456789_2_0123456789_3_0123456789_4_0123456789_5_0123456789_6_0123456789_7_0123456789_8_0123456789_9_0123456789_10_0123456789_11_0123456789_12_0123456789_13_0123456789_14_0123456789_15_0123456789_16_0123456789_17_0123456789_18_0123456789_19_0123456789_20_0123456789() {
        assertTrue(true);
    }

    public void testWillFailOnFailParameter() {
        String value = System.getProperty("fail");
        if (value != null && value.toLowerCase().equals("true")) {
            fail("fail parameter is set");
        }
    }

    public void testWillThrowOnThrowParameter() {
        String value = System.getProperty("throw");
        if (value != null && value.toLowerCase().equals("true")) {
            throw new RuntimeException("Throw parameter is set");
        }
    }
}
