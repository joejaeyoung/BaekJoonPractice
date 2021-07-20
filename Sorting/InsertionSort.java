

public class InsertionSort {
    public static int[] intArray = new int[32];

    public static void main(String[] args) {
        randomInt();//난수 생성
        sortingArray(); //삽입 정렬

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
        int i, j;
        int tempNum;

        //삽입정렬 시작
        for(i=1; i< intArray.length; i++){
            tempNum = intArray[i];
            for(j=i-1; j>=0; j--){
                if(intArray[j]>tempNum)
                    intArray[j+1] = intArray[j];
                else
                    break;
            }
            intArray[j+1] = tempNum;

            System.out.print((i)+"번 째 : ");
            printArray();
        }
    }


}
