import javax.swing.*;

public class MergeSort {

    public static int[] intArray = new int[32];
    public static int[] sortedIntArray = new int[32];

    public static void main(String[] args) {
        randomInt();//난수 생성
        System.out.print("초기 배열: ");
        printArray();
        mergeSort(0, intArray.length-1); //삽입 정렬

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

    public static void mergeSort(int left, int right){

        //분할정복 알고리즘 사용
        if(left<right){
            printArray();
            int mid = (left+right)/2;
            //배열 분할
            mergeSort(left, mid);
            mergeSort(mid+1, right);
            merge(left, mid, right);
        }
    }

    public static void merge(int left, int mid, int right){
        //배열 정렬 및 합병
        printArray();
        int i = left;
        int j = mid+1;
        int k = left;

        //정렬된 두배열 합병을 통해 하나의 정렬된 배열 도출
        while(i<=mid && j<=right){
            if(intArray[i]<intArray[j]){
                sortedIntArray[k++] = intArray[i++];
            }else {
                sortedIntArray[k++] = intArray[j++];
            }
        }
        while(i<=mid)
            sortedIntArray[k++] = intArray[i++];
        while(j<=right)
            sortedIntArray[k++] = intArray[j++];
        for(int idx=left; idx<k; idx++)
            intArray[idx] = sortedIntArray[idx];

    }



}
