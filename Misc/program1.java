import java.util.Arrays;

 class ordarray {

public static void main(String[] args) {
    int[] arr = { 5, 11, 12, 22, 4 };

    int size = arr.length;

    int i,pos;

    System.out.println(arr);

    System.out.println("Elements in the array" + Arrays.toString(arr));

    System.out.println(" The size of the array is  " + size);


    int searchKey = 11;

    for ( i = 0; i < size; i++) {
        if (arr[i] == searchKey)
            break;
    }

    if(i==size)
        System.out.println(" Element not found");
    else
        System.out.println("Element found in the position " +i);


    int elemDel=5;


    for ( pos = 0; pos < size; pos++) {
        if (arr[pos] == elemDel)
            break;
    }

    if(pos==size)
"program1.java" 63L, 993C                                                                                                      1,1           Top

