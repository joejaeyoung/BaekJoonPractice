package ForWhile;

import java.util.Scanner;

public class For_11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        for(int i=0; i<testCase; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.printf("Case #%d: %d + %d = %d\n",i+1,a, b, a+b);
        }
        scanner.close();
    }
}
