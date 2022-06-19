package top50JournalDev;

public class Q12Factorial {

    public static void main(String[] args) {
        //Find factorial of an integer?
        int n=10;

        findFactorial(n);
    }

    private static void findFactorial(int n) {
        int result=1;

        if(n<0){
            System.out.println("Negative numbers don't have factorial");;
        }else if(n==0){
            System.out.println(1);
        }else {
            for (int i = 1; i <= n; i++) {
                 result = result*i;

            }

        }

        System.out.println(result);
    }


}
