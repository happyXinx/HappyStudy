/*
java.utils.Arrays: 操作数的工具类，里面定义了很多操作数的方法

 */

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        //1. equals
        int[] arr1={1,2,3,4};
        int[] arr2={1,3,3,4};
        boolean is=Arrays.equals(arr1,arr2);
        System.out.println(is);
        //2. toString
        System.out.println(Arrays.toString(arr1));
        //3. fill
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        //4. binarysearch
        int[] arr3={1,3,3,5};
        System.out.println(Arrays.binarySearch(arr3,10));

        //5. sort
        int[] arr4={1,3,3,5,4};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

    }
}
