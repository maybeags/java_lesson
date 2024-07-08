package j11_배열;

public class ArrayTest1 {
    /*
          배열의 필요성 :
          여태까지의 수업을 기준으로 하면 10개의 정수형 데이터를 저장하려면 변수를 10개 만들어서 저장해야 했습니다.
          배열은 같은 자료형의 데이터를 하나의 변수에 저장해서 처리하는 방식입니다.

          배열 선언방식:
          int[] arr = new int[5];
          arr = { 1, 2, 3, 4, 5 };
          System.out.println(arr)을 할 경우를 확인해보시기 바랍니다.

          여기서 일반 변수와 참조 변수의 개념에 대해 알 수 있습니다.
          일반 변수 : 데이터를 직접 가지는 변수
                    byte, short, int double 등 기본 데이터 타입을 가지는 경우
          참조 변수 : 데이터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나 변경합니다.
                    STring, 배열, Collections, 객체(class)
     */

    public static void main(String[] args) {
        int[] numArray = new int[10];

        int index = 9;

        numArray[index] = 10;

        for(int i = 0; i < 10; i++) {
            System.out.println(numArray[i]);

        }

    }

}