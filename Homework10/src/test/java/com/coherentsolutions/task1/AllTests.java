package com.coherentsolutions.task1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArrayUtilitiesTest.class,
        CalculatorTest.class,
        StringManipulatorTest.class
})

/**
 * The AllTests class serves as a JUnit test suite that combines multiple test classes
 * It includes test cases from ArrayUtilitiesTest, CalculatorTest, and StringManipulatorTest
 */
public class AllTests {

}
