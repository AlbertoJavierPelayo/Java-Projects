package com.coherentsolutions.task1;

/**
 * The StringManipulator class provides methods for manipulating strings.
 */
public class StringManipulator {
    /**
     * Reverses a string
     * @param str The input string to be reversed
     * @return The reversed string
     */
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    /**
     * Converts a string to lowercase
     * @param str The input string to be converted to lowercase
     * @return The string in lowercase
     */
    public String toLowerCase(String str){
        return str.toLowerCase();
    }

    /**
     * Converts a string to uppercase
     * @param str The input string to be converted to uppercase
     * @return The string in uppercase
     */
    public String toUpperCase(String str){
        return str.toUpperCase();
    }

    /**
     * Removes spaces from a string
     * @param str The input string from which spaces should be removed
     * @return The string with spaces removed
     */
    public String removeSpaces(String str) {
        return str.replaceAll("\\s", "");
    }
}
