import java.util.Scanner;

public class ARR1_8958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testNum = in.nextInt();
        String[] inputStr = new String[testNum];

        for(int i=0; i< testNum; i++) {
            inputStr[i] =in.nextLine();
        }

        in.close();

        for(int i=0; i<testNum; i++){
            int cnt=0;
            int sum=0;

            for(int j=0; j<inputStr[j].length(); j++){
                if(inputStr[i].charAt(j)=='O'){
                    cnt++;
                }
                else{
                    cnt=0;
                }
                sum+=cnt;
            }

            System.out.println(sum);


        }

    }
}
