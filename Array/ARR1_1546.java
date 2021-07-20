package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ARR1_1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testNum = in.nextInt();
        double[] grade1 =new double[testNum];

        for(int i=0; i<testNum; i++){
            grade1[i] = in.nextDouble();
        }

        Arrays.sort(grade1);
        double sum=0;

        for(int i=0; i<testNum; i++){
            sum+=((grade1[i]/grade1[testNum-1])*100);
        }

        System.out.println(sum/testNum);


    }
}
