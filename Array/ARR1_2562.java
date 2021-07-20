package Array;

import java.util.Scanner;

public class ARR1_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        int maxNum = arr[0];
        int maxNumCount = 1;

        for(int i=1; i<9; i++){
            if(maxNum<arr[i]) {
                maxNum = arr[i];
                maxNumCount = i + 1;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxNumCount);


    }

}
