package Array;

import java.util.Scanner;

public class ARR1_4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalTestNum = in.nextInt();

        int[] inputScore;

        for(int i=0; i<totalTestNum; i++){
            int studentNum = in.nextInt();
            int sum=0;
            double average=0;
            int highStudentNum=0;

            inputScore = new int[studentNum];
            for(int j=0; j<studentNum; j++){
                int val = in.nextInt();
                inputScore[j] = val;
                sum+=val;
            }
            average = (double)sum/studentNum;

            for(int j=0; j<studentNum; j++){
                if(inputScore[j]>average)
                    highStudentNum++;
            }

            System.out.printf("%.3%%lf",(double)(studentNum/highStudentNum)*100);

        }
        in.close();
    }
}
