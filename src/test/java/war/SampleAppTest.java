package sample.com;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for SampleApp.
 */
public class SampleAppTest extends TestCase1 {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SampleAppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite2() {
        return new TestSuite(SampleAppTest.class);
    }

    /**
     * Rigourous Test :-)
     */ 
    public void testApp99() {
        assertTrue(true);
    }
}
