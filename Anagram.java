public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);
        return java.util.Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";
        boolean result = areAnagrams(string1, string2);
        System.out.println("Are \"" + string1 + "\" and \"" + string2 + "\" anagrams? " + result);
    }
}