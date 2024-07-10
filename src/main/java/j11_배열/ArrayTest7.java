package j11_배열;

public class ArrayTest7 {
    public static void main(String[] args) {
        /*
            향상된 for문 보충
            형식
              자료형 변수명  반복가능객체(주로 배열)
            for(int num : scores) {
                실행문
            }

            for 문을 실행할 반복 대상이 있으면 자료형은 반복 대상이 지닌 자료형과 같은 타입으로 지정해야 함.
            반복 대상의 요소를 하나씩 변수에 대입하면서 진행하고, 반복 대상의 길이만큼 꺼내어 반복함.
         */

        int[] scores = {90, 92, 93};

        int sum = 0;
        double avg = 0;
        double avg2 = 0;

        for(int val : scores) {
            sum += val;
        }

        avg = ((double)sum)/3;
        //이거 둘 차이 출력 결과로 보여줘야 함.
        avg2 = (double)(sum/3);

        System.out.println("총점 : " + sum + ", 평균 : " + avg);
        System.out.println("총점 : " + sum + ", 평균 : " + avg2);
    }
}
