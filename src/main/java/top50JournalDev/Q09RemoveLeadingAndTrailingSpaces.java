package top50JournalDev;

public class Q09RemoveLeadingAndTrailingSpaces {

    public static void main(String[] args) {


        //How to remove leading and trailing whitespaces from a string?
        String word="       Spaces at the beginning and at the end doesn't look good        ";

        trimTheSpaces(word);
    }

    private static void trimTheSpaces(String str) {

        str=str.trim();
        System.out.println(str);

    }

}
