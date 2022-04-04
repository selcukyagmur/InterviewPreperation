package top50JournalDev;

public class Q1ReverseAString {

    public static void main(String[] args) {

        //How to reverse a String in Java?

        String a="java";
        String reverse="";

        for (int i = a.length()-1; i >= 0; i--) {
            reverse = reverse+a.charAt(i);

        }
        System.out.println(reverse);
    }




}
