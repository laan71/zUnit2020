/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/10/2020
 *
 */

import zunit.TestSuite;

public class TestClassWithBoolean extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClassWithBoolean testClassWithBoolean = new TestClassWithBoolean();
        testClassWithBoolean.runTestSuite();
    }

    private void passingTest(){
        assertEquals(true,true);
    }
    private void failingTest(){
        assertEquals(false,true);
    }
}

