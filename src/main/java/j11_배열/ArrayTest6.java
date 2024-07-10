package j11_배열;

public class ArrayTest6 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        int count = 1;

        // 1부터 25까지 차례대로 배열에 값을 넣는다.
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = count++;
            }
        }

        // 이거 문제로 내야함
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
