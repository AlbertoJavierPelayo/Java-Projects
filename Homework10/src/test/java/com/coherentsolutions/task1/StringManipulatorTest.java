package com.coherentsolutions.task1;

import com.coherentsolutions.task1.StringManipulator;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Test cases for the StringManipulator class
 */
public class StringManipulatorTest {
    //setup
    StringManipulator sm = new StringManipulator();

    /**
     * Test the reverse method
     * It aims to verify that the reverse method correctly reverses a string
     */
    @Test
    public void testReverse() {

        assertEquals("tac", sm.reverse("cat"));
    }

    /**
     * Test the toLowerCase method
     * It aims to verify that the toLowerCase method correctly converts a string to lowercase
     */
    @Test
    public void testToLower(){
        assertEquals("cat", sm.toLowerCase("CAT"));
        assertEquals("cat", sm.toLowerCase("cat"));
        assertEquals("cat", sm.toLowerCase("CaT"));
    }

    /**
     * Test the toUpperCase method
     * It aims to verify that the toUpperCase method correctly converts a string to uppercase
     */
    @Test
    public void testToUpper(){
        assertEquals("CAT", sm.toUpperCase("cat"));
        assertEquals("CAT", sm.toUpperCase("CAT"));
        assertEquals("CAT", sm.toUpperCase("CaT"));
    }

    /**
     * Test the removeSpaces method
     * It aims to verify that the removeSpaces method correctly removes spaces from a string without care where the spaces are
     */
    @Test
    public void testRemoveSpaces(){
        assertEquals("helloworld",sm.removeSpaces("hello world"));
        assertEquals("helloworld",sm.removeSpaces("hello      world"));
        assertEquals("helloworld",sm.removeSpaces("  hello world  "));
        assertEquals("helloworld",sm.removeSpaces("helloworld"));
    }
}
