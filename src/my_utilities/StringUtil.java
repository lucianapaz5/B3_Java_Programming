package my_utilities;

public class StringUtil {


    /**
     * Returns the reversed version of string.
     *
     * @return  the reversed sequence of characters in String
     */
    public static String reverse (String word) {

        String reversed = "";
        for (int i = word.length() - 1 ; i >= 0 ; i--) {

            reversed += word.charAt(i);
        }
        return reversed;
    }


    public static boolean fixFormat(String loopCAMP) {
        return false;
    }

    public static boolean frequencyOfCharacters(String wednesday, char e) {
        return false;
    }
}
