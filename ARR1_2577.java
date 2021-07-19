import java.util.Scanner;

public class ARR1_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        int n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
        int[] num = new int[10];
        for(int i=0; i<10; i++){
            num[i]=0;
        }

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result = a*b*c;

        String Final = String.valueOf(result);

        for(int i=0; i<Final.length(); i++){
            switch(Final.charAt(i)){
                case '0' :
                    num[0]++;
                    break;
                case '1' :
                    num[1]++;
                    break;
                case '2' :
                    num[2]++;
                    break;
                case '3' :
                    num[3]++;
                    break;
                case '4' :
                    num[4]++;
                    break;
                case '5' :
                    num[5]++;
                    break;
                case '6' :
                    num[6]++;
                    break;
                case '7' :
                    num[7]++;
                    break;
                case '8' :
                    num[8]++;
                    break;
                case '9' :
                    num[9]++;
                    break;
            }
        }
        for(int j=0; j<10; j++){
            System.out.println(num[j]);
        }
    }
}
