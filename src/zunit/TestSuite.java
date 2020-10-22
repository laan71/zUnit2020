/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/10/2020
 *
 */

package zunit;

public abstract class TestSuite {
    private int passed; // private - kun klassen selv kan se den
    private int failed;

    public void runTestSuite(){
        passed = 0;
        failed = 0;

        testMethodList();

        System.out.println("Tests passed: " + passed);
        System.out.println("Tests failed: " + failed);
    }
    public abstract void testMethodList();

    // Compare int
    public void assertEquals(int expected, int actual){
        if(expected == actual) {
            passed++;
        }else{
            failed++;
            System.out.println("Test " + (passed + failed) +  " has failed.\n" + "Expected result: " + expected + "\n" +
            "Actual result: " + actual);
        }
    }
    // Compare Strings
    public void assertEquals(String expected, String actual){
        if(expected.equals(actual)) {
            passed++;
        }else{
            failed++;
            System.out.println("Test " + (passed + failed) +  " has failed.\n" + "Expected result: " + expected + "\n" +
            "Actual result: " + actual);
        }
    }
    // Compare doubles
    public void assertEquals(double expected, double actual){
        if(expected == actual) {
            passed++;
        }else{
            failed++;
            System.out.println("Test " + (passed + failed) +  " has failed.\n" + "Expected result: " + expected + "\n" +
            "Actual result: " + actual);
        }
    }
    // Compare booleans
    public void assertEquals(boolean expected, boolean actual){
        if(expected == actual) {
            passed++;
        }else{
            failed++;
            System.out.println("Test " + (passed + failed) +  " has failed.\n" + "Expected result: " + expected + "\n" +
            "Actual result: " + actual);
        }
    }
    // Compare chars
    public void assertEquals(char expected, char actual){
        if(expected==actual) {
            passed++;
        }else{
            failed++;
            System.out.println("Test " + (passed + failed) +  " has failed.\n" + "Expected result: " + expected + "\n" +
            "Actual result: " + actual);
        }
    }
    // Compare floats
    public void assertEquals(float expected, float actual){
        if(expected==actual) {
            passed++;
        }else{
            failed++;
            System.out.println("Test " + (passed + failed) +  " has failed.\n" + "Expected result: " + expected + "\n" +
            "Actual result: " + actual);
        }
    }
}
