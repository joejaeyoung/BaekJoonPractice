import java.util.Scanner;

public class For_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        int k;
        for(int i=1; i<=testCase; i++){
            for(k=testCase-i; k>0; k--)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if (i < testCase)
                System.out.println("");

        }
    }
}
