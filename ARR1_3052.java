import java.util.Scanner;
import java.util.HashSet;

public class ARR1_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i=0; i<10; i++){
            h.add(scanner.nextInt()%42);
        }

        scanner.close();
        System.out.println(h.size());
    }
}
