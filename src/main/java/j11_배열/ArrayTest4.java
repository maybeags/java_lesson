package j11_배열;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest4 {
    public static void main(String[] args) {
        // 배열의 출력
        /*
            전 수업에서 System.out.println(arr)을 출력하면 주소값만 나온다는 사실을 확인할 수 있었습니다.
            그리고 반복문을 통해 각 인덱스에 저장된 값을 불러올 수도 있었지만 배열 전체를 출력하는 방법을 배우지 못했습니다.
            이번에는 배열을 출력하는 방법을 배울 예정입니다.
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*
            Arrays 클래스의 메소드를 사용할 예정입니다. 메소드를 이용하는 방식은 클래스명.메소드명()이었다는 점을 배웠습니다.
            toString()이라는 기능은 반목문의 도움 없이 배열을 출력할 수 있으며, 이를 String형태로 불러내줍니다.
         */

        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};  // 후에 자세히 다룰 예정
        System.out.println("정렬 전 배열 : " + Arrays.toString(arr2));

        Arrays.sort(arr2);
        System.out.println("정렬 후 배열 : " + Arrays.toString(arr2));

        Arrays.sort(arr2, Comparator.reverseOrder());

    }
}
