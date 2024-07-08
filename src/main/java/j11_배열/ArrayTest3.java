package j11_배열;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
//     배열에 랜덤함수를 이용해 값을 입력
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 30) + 1;
        }

        int sum = 0;
        for(int i = 0 ; i < numbers.length ; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        for(int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("배열 짝수들의 합 : " + sum);
    }
}
