/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
       // System.out.println(subsetOf("sap","space"));
       // System.out.println(subsetOf("pass","space"));
       // System.out.println(subsetOf("c","space"));
        //System.out.println(spacedString(hello));
        System.out.println( insertRandomly('s',"cat"));
        //// Put your other tests here.
    }

    /**
     * Returns the number of times the given character appears in the given string.
     * Example: countChar("Center",'e') returns 2 and countChar("Center",'c') returns 0. 
     * 
     * @param str - a string
     * @param c - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char ch) {
        //// Replace the following statement with your code
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
              count++;
        }
        return count;
    }

    /** Returns true if str1 is a subset string str2, false otherwise
     *  Examples:
     *  subsetOf("sap","space") returns true
     *  subsetOf("spa","space") returns true
     *  subsetOf("pass","space") returns false
     *  subsetOf("c","space") returns true
     *
     * @param str1 - a string
     * @param str2 - a string
     * @return true is str1 is a subset of str2, false otherwise
     */
    public static boolean subsetOf(String str1, String str2) {
         //// Replace the following statement with your code
        boolean isFound = true;
        if(str1.length() > str2.length())
        return false;
        char [] str2Arr = new char[str2.length()];
        for (int j = 0; j < str2.length(); j++)
           str2Arr[j] = str2.charAt(j);

        for (int i = 0; i < str1.length(); i++) {
            isFound = false;
            for (int j = 0; j < str2Arr.length; j++) {
              if (str2Arr[j] == str1.charAt(i)) {
                str2Arr[j] = '#';
                isFound = true;
                break;
              }
            }
            if(!isFound)    
                return false;    
        }
        return true;
    }

    /** Returns a string which is the same as the given string, with a space
     * character inserted after each character in the given string, except
     * for the last character. 
     * Example: spacedString("silent") returns "s i l e n t"
     * 
     * @param str - a string
     * @return a string consisting of the characters of str, separated by spaces.
     */
    public static String spacedString(String str) {
        //// Replace the following statement with your code
        String ans = "";
        for (int i = 0; i < str.length() - 1; i++){
            ans += str.charAt(i) + " ";
        }
        ans += str.charAt(str.length() - 1);
        return ans;
    }
  
    /**
     * Returns a string of n lowercase letters, selected randomly from 
     * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
     * letter can be selected more than once.
     * 
     * Example: randomStringOfLetters(3) can return "zoo"
     * 
     * @param n - the number of letter to select
     * @return a randomly generated string, consisting of 'n' lowercase letters
     */
    public static String randomStringOfLetters(int n) {
        //// Replace the following statement with your code
        String randomString = "";
        for (int i = 0; i < n; i++){
            char r = (char) ((Math.random() * 26) + 97);
            randomString += r;
        }
        return randomString;
    }

    /**
     * Returns a string consisting of the string str1, minus all the characters in the
     * string str2. Assumes (without checking) that str2 is a subset of str1.
     * Example: remove("meet","committee") returns "comit" 
     * 
     * @param str1 - a string
     * @param str2 - a string
     * @return a string consisting of str1 minus all the characters of str2
     */
    public static String remove(String str1, String str2) {
       //// Replace the following statement with your code
       String ans = "";
       char [] str1Arr = new char[str1.length()];
       for (int j = 0; j < str1.length(); j++)
           str1Arr[j] = str1.charAt(j);
        for (int i = 0; i < str2.length(); i++) {
            boolean isFound = false;
            for (int j = 0; j < str1Arr.length; j++) {
                if (str1Arr[j] == str2.charAt(i)) {
                    str1Arr[j] = '#';
                    isFound = true;
                    break;
                }
            }
            if(!isFound)
              ans += str2.charAt(i);
        }
        return ans;
    }

    /**
     * Returns a string consisting of the given string, with the given 
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or "cast", or "cats".  
     * @param ch - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
         // Generate a random index between 0 and str.length()
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         // Insert the character at the random index
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}
