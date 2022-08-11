import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class idk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of your ticket");
       for(Integer val: createTicket(input.nextInt())) {
         System.out.println(val + "");
       }
    }

    public static int[] createTicket(int yas) {
        Scanner input = new Scanner(System.in);
       System.out.println("enter " + yas + " individual numbers for sorting");
        int[] newArray = new int[yas];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = input.nextInt();
        }
            Arrays.sort(newArray);
        return newArray;
}
}


