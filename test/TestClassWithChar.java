/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/10/2020
 *
 */

import zunit.TestSuite;

public class TestClassWithChar extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClassWithChar testClassWithChar = new TestClassWithChar();
        testClassWithChar.runTestSuite();
    }

    private void passingTest(){
        assertEquals("A","A");
    }
    private void failingTest(){
        assertEquals("A","B");    }
}

