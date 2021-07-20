import java.util.Stack;
import java.util.Scanner;

public class Stack_10773 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        int testNum = in.nextInt();

        int temp;
        for(int i=0; i<testNum; i++){
            temp = in.nextInt();
            if(temp!=0){
                stack.push(temp);
            }else if(temp==0){
                stack.pop();
            }

        }

        int leftNumSize = stack.size();
        int sum=0;
        for(int i=0; i<leftNumSize; i++){
            sum+=stack.pop();
        }

        System.out.println(sum);


    }

}
