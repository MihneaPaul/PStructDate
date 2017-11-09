package Lab2;

import java.util.ArrayList;

/**
 * Created by Mihnea on 15.10.2017.
 */
public class Lab2_Problema2 {

    public static int beautifulNumbers(int lower, int upper, int div){
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i=lower;i<upper;i++){
            if(Math.abs(i-revertNumber(i))%div == 0){
                count++;
                list.add(i);
            }
        }
        System.out.println("List of beaufitul numbers is: "+list);
        return count;
    }

    public static int revertNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10);
            reverse = reverse + n % 10;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Count of beautiful numbers is: " + beautifulNumbers(20,30,6));
    }

}
