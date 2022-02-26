package com.zipcodewilmington.danny_do_better_exercises;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringType;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {

        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        return firstSegment.concat(secondSegment);
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String val = firstSegment + secondSegment;
        return val;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String val = input.substring(0,3);
        return val;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        int val = input.length();
        String result = input.substring((val-3),val);
        return result;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int val = inputValue.length();
        if ((val %2) == 0){
            val = val/2 -1;
        }else val = Math.round(val/2);

        return inputValue.charAt(val);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        int val = spaceDelimitedString.indexOf(" ");
        return spaceDelimitedString.substring(0,val);
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        int val = spaceDelimitedString.indexOf(" ");
        int length = spaceDelimitedString.length();
        String result = spaceDelimitedString.substring(val+1,length);
        int val1 = result.indexOf(" ");
        if (val1 == -1) {
            return result;
        }else return result.substring(0,val1);
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        int length = stringToReverse.length()-1;
        String result = "";
        for(int x =length; x>=0;x--){
           result += stringToReverse.charAt(x);
        }
        return result;
    }
}
