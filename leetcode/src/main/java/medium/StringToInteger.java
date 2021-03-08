package medium;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 *
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 *
 * Input: s = "42"
 * Output: 42
 *
 * Input: s = "   -42"
 * Output: -42
 *
 * Input: s = "4193 with words"
 * Output: 4193
 *
 * Input: s = "words and 987"
 * Output: 0
 *
 * Input: s = "-91283472332"
 * Output: -2147483648
 */
public class StringToInteger {
    public int myAtoi2(String str) {
        int i = 0;
        int sign = 1;
        int result = 0;
        if (str.length() == 0) return 0;

        //Discard whitespaces in the beginning
        while (i < str.length() && str.charAt(i) == ' ')
            i++;

        // Check if optional sign if it exists
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-'))
            sign = (str.charAt(i++) == '-') ? -1 : 1;

        // Build the result and check for overflow/underflow condition
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return result * sign;

    }
    public int myAtoi(String s) {
        boolean spaceFlag = false;
        boolean signFlag = false;
        char sign = '+';
        StringBuffer digit =new StringBuffer("");
        for(int i =0; i<s.length();i++){
            char char1 = s.charAt(i);
            //System.out.println("Character is "+char1);
            //TODO - Parse string character wise and check if it is space, -|+, digit or word - Done
            //TODO - Fix character reading - Done
            //TODO - Develop code to convert string to number (test)
            //TODO - Identify corner cases 
            if(!spaceFlag && char1 == ' ') {
                //System.out.println("Space character is found at index " + i);
            }
            else if(!signFlag && (char1 == '-' || char1 == '+')){
                spaceFlag = true;
                signFlag = true;
                //System.out.println("Sign is found at index " +i);
                if(char1 == '-') sign = '-';
            }
            else if(Character.isDigit(char1)){
                spaceFlag = true;
                signFlag = true;
                //System.out.println("Digit found at index "+i);
                digit.append(char1);
            }
            else{
                //System.out.println("No digit or space or sign character found at index "+i);
                break;
            }

        }
        if(digit.toString().equals("")) return 0;
        if(sign == '-')
            try{
                return -Integer.parseInt(digit.toString());
            }
            catch (NumberFormatException ex){
                return Integer.MIN_VALUE;
            }
        else
            try{
                return Integer.parseInt(digit.toString());
            }
            catch (NumberFormatException ex){
                return Integer.MAX_VALUE;
            }
    }
}
