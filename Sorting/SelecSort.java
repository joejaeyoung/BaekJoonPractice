import java.util.*;

public class SelecSort {

    static int[] intArray = new int[32];

    public static void main(String[] args) {
        randomInt();//난수 생성
        sortingArray(); //선택 정렬

        System.out.print("완성 : ");
        printArray();//화면출력
    }

    public static void randomInt(){
        int tempNum=0;

        //중복되지 않은 난수 생성
        OUTER :
        for(int i=0; i< intArray.length; i++){
            tempNum = (int)(Math.random()*32);
            for(int j=0; j<i; j++){
                if(intArray[j]==tempNum){
                    i--;
                    continue OUTER;
                }
            }
            intArray[i] = tempNum;
        }
    }

    public static void printArray(){
        for(int i=0; i< intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println("");
    }

    public static void sortingArray(){
        //선택정렬 시작
        for(int i=0; i< intArray.length; i++){
            for(int j=i+1; j< intArray.length; j++){
                // 값을 하나 찍어놓은 뒤 나머지 값들과 비교하여 찍어놓은 값이 더 크면 자리 바꿈
                if(intArray[i]>intArray[j]){
                    //값들의 교환
                    int tempNum = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tempNum;
                }
            }
            //디버깅
            System.out.print((i+1)+"번째 : ");
            printArray();

        }
    }


}
