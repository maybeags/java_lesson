package j08_메소드;

/*
    메소드란? 함수이다.
    함수란? 일련의 동작을 묶어 정의한 것.
    특징: 입력과 출력을 가질 수 있다.
    그러면 왜 메소드라고 부르는가?

    클래스 안에 함수를 정의하면 메소드라고 부른다.
    함수를 실행하는 것을 우리는 호출(call)라고 칭한다.

 */

public class Method1 {

    // 1. [x | x] 입력(매개변수), 출력(반환)
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    // 2. [o | x]
    public static void call2(String str) {
        System.out.println("[ o | x ]");
        System.out.println("수업과목: " + str);
    }

    // 3. [x | o]
    public static String call3() {
        System.out.println("[ x | o ]");

        String result = "";

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                result += "*";
            }
            result += "\n";
        }

        return result;

    }

    // 4. [o | o]
    public static String call4(int year, int month, int day) {
        System.out.println("[ o | o ]");
        return year + "년 " + month + "월 " + day + "일";
    }

    // Main 메소드
    public static void main(String[] args) {
        call1();
        call2("java");
        String star1 = call3();
        System.out.println(star1);
        String date = call4(2022, 10, 24);
        System.out.println(date);
    }

}