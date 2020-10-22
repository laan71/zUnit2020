/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/10/2020
 *
 */

import zunit.TestSuite;

public class TestClassFloat extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClassFloat testClassFloat = new TestClassFloat();
        testClassFloat.runTestSuite();
    }

    private void passingTest(){
        assertEquals(5.75f,5.75f);
    }
    private void failingTest(){
        assertEquals(5.99,3.1451);
    }
}
