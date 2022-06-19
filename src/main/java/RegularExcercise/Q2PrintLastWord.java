package RegularExcercise;

import java.util.Scanner;

public class Q2PrintLastWord {

    public static void main(String[] args) {

        //son kelimeyi yazdır
        Scanner sc=new Scanner(System.in);
        System.out.println("bir cümle yazınız");
        String sentence=sc.nextLine();

        printLastWord(sentence);

    }

    private static void printLastWord(String sentence) {

        int lastIndexOfSpace=sentence.lastIndexOf(" ");
        System.out.println(sentence.substring(lastIndexOfSpace));


    }
    }



