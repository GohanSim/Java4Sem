import java.util.Arrays;

public class Java10 {

    public static void main(String[] args) {

        // создание массивов
        int a1[] = {1,2,3,4,5};
        int[] a2 = new int[]{6,7,8,9,10};

        // практика 1 присваивание массива

        a1 = a2;

        //a1 ссылается на массив a2
        System.out.println(Arrays.toString(a1));

        // length
        System.out.println("length = " + a1.length);

        // массив массивов
        int[][] arr = {
                {1},
                {2,3},
                {4,5,6},
                {7,8,9,10}
        };

        System.out.println(arr[2][1]);

        // практика 2 Arrays

        // toString
        int[] nums1 = {5,3,1,4,2};
        System.out.println(Arrays.toString(nums1));

        // sort
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

        // binarySearch
        int index = Arrays.binarySearch(nums1,4);
        System.out.println("index = " + index);

        // equals
        int[] nums2 = {1,2,3,4,5};
        boolean eq = Arrays.equals(nums1,nums2);
        System.out.println("equals = " + eq);

        // compare
        int result = Arrays.compare(nums1,nums2);
        System.out.println("compare = " + result);
    }
}