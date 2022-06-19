/*package MentorExcersize;

import java.util.*;

public class Q1 implements Comparator <String>{

    public static void main(String[] args) {

        //kelimeleri sırala

        Scanner sc=new Scanner (System.in);
        System.out.println("please enter some words than I will sort them according to their length");
        String word1=sc.next();
        String word2=sc.next();
        String word3=sc.next();
        String word4=sc.next();
        String word5=sc.next();

        sortWords(word1,word2,word3,word4,word5);

    }

    private static void sortWords(String word1, String word2, String word3, String word4, String word5) {
        String [] arr={word1,word2,word3,word4,word5};

        Map <String,Integer> sortMap=new HashMap<>();
        sortMap.put(word1,word1.length());
        sortMap.put(word2,word2.length());
        sortMap.put(word3,word3.length());
        sortMap.put(word4,word4.length());
        sortMap.put(word5,word5.length());



    }


}
*/