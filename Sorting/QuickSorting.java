

public class QuickSorting {
    public static int[] intArray = new int[32];

    public static void main(String[] args) {
        randomInt();//난수 생성
        QuickSort(0, intArray.length-1); //삽입 정렬

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

    public static void QuickSort(int left, int right){

        //분할 작업 순환적으로 반복
        //피벗의 왼쪽 배열, 오른쪽 배열을 정렬
        //피벗보다 작은 원소 -> 왼쪽
        //피벗보다 큰 원소 -> 오른쪽
        if(left >= right) return ;

        int pivot = left;
        int l = pivot+1;
        int r = right;
        int temp;

        while(l<r){
            while(l<=right && intArray[l]<intArray[pivot])
                l++;
            while(r>=pivot && intArray[pivot]<intArray[r])
                r--;

            if(l < r){
                temp = intArray[l];
                intArray[l] = intArray[r];
                intArray[r] = temp;
                printArray();
            }else{
                temp = intArray[pivot];
                intArray[pivot] = intArray[r];
                intArray[r] = temp;
                printArray();
            }

            QuickSort(left, r-1);
            QuickSort(r+1, right);

        }

    }



}
