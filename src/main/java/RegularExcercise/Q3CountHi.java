package RegularExcercise;

import java.util.Scanner;

public class Q3CountHi {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a sentence that contains hi and I will count how many hi in the sentence");
        String word= sc.nextLine();


        hiCounter(word);


    }

    private static void hiCounter(String str) {
        int count=0;

        for (int i = 0; i < str.length()-1; i++) {
             if (str.substring(i,i+2).equals("hi")){
                 count++;
             }

        }
        System.out.println("there is "+count+ " hi");
    }
}
