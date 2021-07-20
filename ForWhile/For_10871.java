package ForWhile;

import java.util.Scanner;

public class For_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int X = sc.nextInt();

        sc.nextLine();

        String S_input = sc.nextLine();
        String[] parseString = S_input.split("\\s");

        int[] arrayInt = new int[N];

        for(int j=0; j<N; j++){
            arrayInt[j] = Integer.valueOf(parseString[j]);

            if(arrayInt[j]<X)
                System.out.print(arrayInt[j]+" ");
        }
        System.out.println("");
    }
}
