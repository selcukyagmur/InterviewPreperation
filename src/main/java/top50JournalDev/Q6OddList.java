package top50JournalDev;

import java.util.ArrayList;

public class Q6OddList {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(5);
        list.add(20);

        System.out.println(isListOdd(list));

    }

    public static boolean isListOdd(ArrayList<Integer>list){
        for (Integer integer : list) {
            if(integer%2==0){
                return false;
            }

        }
        return true;
    }


}
