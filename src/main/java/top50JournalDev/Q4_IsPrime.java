package top50JournalDev;

public class Q4_IsPrime {

    public static void main(String[] args) {
        //Java program to check if the given number is Prime?

        int a = 31;

        isPrime(a);
    }

    public static void isPrime(int num) {

        if (num ==0 | num==1) {
            System.out.println(false);
        }

        if (num == 2) {
            System.out.println(true);
        }

        for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(false);
                    break;
                }
            System.out.println(true);
                break;
            }

        }
    }
