package ForWhile;

import java.util.Scanner;

public class For_2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for(int i=1; i<=testCase; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            if(i<testCase)
            System.out.println("");
        }
    }
}
