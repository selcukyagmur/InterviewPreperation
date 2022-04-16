package top50JournalDev;

public class Q8RemoveWhiteSpaces {

    public static void main(String[] args) {

        String sentence="Could you please remove the white spaces from the text.";
        removeWhiteSpaces(sentence);
    }

    private static void removeWhiteSpaces(String str) {

        System.out.println(str.replace(" ", ""));
    }
}
