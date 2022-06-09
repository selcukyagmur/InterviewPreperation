package top50JournalDev;

public class Q12Factorial {

    public static void main(String[] args) {

        int n=10;

        System.out.println(findFactorial(n));
    }

    private static long findFactorial(int n) {
        int result=1;
        if(n==0){
            return 0;
        }else{
            for (int i = 1; i <= n; i++) {
                 result = result*i;

            }

        }

        return result;
    }


}
