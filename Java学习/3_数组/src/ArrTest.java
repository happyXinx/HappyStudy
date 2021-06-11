public class ArrTest {
    public static void main(String[] args) {

//        一维数组的使用
//        int[] s=new int[10];
//        for(int i=0; i<10; i++){
//            s[i]=2*i+1;
//            System.out.println(s[i]);
//        }
//        二维数组使用
//
//        int[][] arr={{1,3},{3,4,5},{4,5,6}};
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//        }

        //数组反转
//        int[] arr1={1,3,4,5,6,5,7};
//        for(int i=0,j=arr1.length-1;i<j ;i++,j--){
//            int temp=arr1[i];
//            arr1[i]=arr1[j];
//            arr1[j]=temp;
//        }
//        for(int i=0; i<arr1.length; i++){
//            System.out.print(arr1[i]+"\t");
//        }
//
        //二分查找
        int[] arr={1,100,200,300,400,500,600};
        int head=0;
        int end=arr.length-1;
        int target=199;
        while (head<=end){
            int middle=(head+end)/2;
            if(arr[middle]==target){
                System.out.println(middle);
                break;
            }else if(arr[middle]>target){
                end=middle-1;
            }else {
                head=middle+1;
            }
        }

    }
}
