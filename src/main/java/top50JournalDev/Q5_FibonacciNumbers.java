package top50JournalDev;

public class Q5_FibonacciNumbers {

    public static void main(String[] args) {

        //Fibonacci numbers 0 1 1 2 3 5 8 13 21 34 55
        //Write a program that prints fibonacci numbers

        int num = 10;


        printFibonacciSeries(num);

    }

    public static void printFibonacciSeries(int number) {

        int first=0;
        int second=1;
        int third=1;


        for (int i = 0; i < number; i++) {
            System.out.print(first+" ");
            first=second;
            second=third;
            third=first+second;
        }



    }
}