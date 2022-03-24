package top50JournalDev;

public class Q3VowelPresent {

    public static void main(String[] args) {

        String vowel="E";
        String word="easy";

        isVowelPresent(word,vowel);

    }

    private static void isVowelPresent(String word, String vowel) {
        if (word.toLowerCase().contains(vowel.toLowerCase())){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
