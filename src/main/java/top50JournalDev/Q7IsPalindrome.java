package top50JournalDev;

public class Q7IsPalindrome {

    public static void main(String[] args) {

        String word="Kayak";

        isPalindrome(word);
    }

    public static void isPalindrome(String word) {
        String dummy="";
        for (int i = word.length()-1; i >= 0; i--) {
             dummy= dummy+word.charAt(i);
        }

        if (dummy.equalsIgnoreCase(word)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
