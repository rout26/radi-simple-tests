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
    
    public void testLongName 1_0123456789 2_0123456789 3_0123456789 4_0123456789 5_0123456789 6_0123456789 7_0123456789 8_0123456789 9_0123456789 10_0123456789 11_0123456789 12_0123456789 13_0123456789 14_0123456789 15_0123456789 16_0123456789 17_0123456789 18_0123456789 19_0123456789 20_0123456789() {
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
