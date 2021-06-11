/*
1. 数组越界异常 ArrayIndexOutOfBoundsException
2. 空指针异常 NullPointerException

 */

public class ArrayException {

    public static void main(String[] args) {
        int[] arr={1,2,3};
//        System.out.println(arr[5]);
        int[] arr2=null;
        System.out.println(arr2[3]);

    }
}
