public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); //charAt method is a string method in 
                                            //Java that is used to retrieve the character at a specified index within a string.
        }

        boolean isPalindrome = original.equals(reversed);

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}