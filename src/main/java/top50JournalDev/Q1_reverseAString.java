package top50JournalDev;

public class Q1_reverseAString {

    public static void main(String[] args) {

        //How to reverse a String in Java?

        String a="java";
        String dummy="";

        for (int i = a.length()-1; i >= 0; i--) {
            dummy = dummy+a.charAt(i);

        }
        System.out.println(dummy);
    }




}
