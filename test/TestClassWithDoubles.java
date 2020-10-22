/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/10/2020
 *
 */

import zunit.TestSuite;

public class TestClassWithDoubles extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClassWithDoubles testClassWithDoubles = new TestClassWithDoubles();
        testClassWithDoubles.runTestSuite();
    }

    private void passingTest(){
        assertEquals(5.5, 5.5);
    }
    private void failingTest(){
        assertEquals(33.0, 7321.3);
    }
}
