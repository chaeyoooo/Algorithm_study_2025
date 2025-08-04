import java.util.Arrays;

public class array01 {

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new int[]{1, -5, 2, 4, 3})));
//        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));
//        System.out.println(Arrays.toString(solution(new int[]{6, 1, 7})));
//    }
//
//    private static int[] solution(int[] arr) {
//        Arrays.sort(arr);
//        return arr;
//    }

    public static void main(String[] args){
        int[] arr1 = {1, -5, 2, 4, 3};
        int[] arr2 = {2, 1, 1, 3, 2, 5, 4};
        int[] arr3 = {6, 1, 7};

        // 시간 복잡도 생각하기 !
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }
}
