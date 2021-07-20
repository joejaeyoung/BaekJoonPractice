import java.util.Scanner;
import java.util.Stack;


public class Stack_17298 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        int[] intArray=null;
        int testNum=0;

        testNum = in.nextInt();
        intArray = new int[testNum];

        for(int i=0; i<testNum; i++){
            intArray[i]=in.nextInt();
        }

        for(int i=0; i<testNum; i++){
            while(!stack.isEmpty() && intArray[stack.peek()] < intArray[i]){
                intArray[stack.pop()] = intArray[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()) {
            intArray[stack.pop()] = -1;
        }


        StringBuilder sb = new StringBuilder();
        for(int j=0; j<testNum; j++){
            sb.append(intArray[j]).append(' ');
        }
        System.out.println(sb);


    }
}
