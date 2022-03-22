//Java program to reverse an Array
package manoj.dsa.Arrays;

public class ReverseTheArray {
    //Iterative Method
    static void reverseArr(int[] arr){
        int n = arr.length;
        int start = 0 ;
        int end = n-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //Recursive Method
    static void reverseArr(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArr(arr, start+1, end-1);
    }

    static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 67, 89, 43, 45, 89};
        System.out.println("Entered array:-");
        printArray(arr);
        reverseArr(arr);
        System.out.println("After Reversing it:-");
        printArray(arr);
        reverseArr(arr, 0, arr.length-1);
        System.out.println("Again After Reversing the array:- ");
        printArray(arr);

    }
}
